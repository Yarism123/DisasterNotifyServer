package org.example.disasternotifyserver.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.disasternotifyserver.jwt.JwtToken;
import org.example.disasternotifyserver.jwt.JwtTokenProvider;
import org.example.disasternotifyserver.user.entity.User;
import org.example.disasternotifyserver.user.exception.DuplicateUsernameException;
import org.example.disasternotifyserver.user.exception.InvalidPasswordException;
import org.example.disasternotifyserver.user.exception.UserNotFoundException;
import org.example.disasternotifyserver.user.request.UserSignInRequest;
import org.example.disasternotifyserver.user.request.UserSignUpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Slf4j
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManagerBuilder authenticationManagerBuilder;
    private final JwtTokenProvider jwtTokenProvider;

    @Transactional
    public ResponseEntity<String> signup(UserSignUpRequest userSignUpRequest){
        Optional<User> findUser = userRepository.findUserByUsername(userSignUpRequest.getUsername());
        if(findUser.isPresent()){
            throw new DuplicateUsernameException("이미 존재하는 ID입니다.");
        }

        User user = User.builder()
                .username(userSignUpRequest.getUsername())
                .password(passwordEncoder.encode(userSignUpRequest.getPassword()))
                .city_code(userSignUpRequest.getCity_code())
                .county_code(userSignUpRequest.getCounty_code())
                .roles(new ArrayList<>(List.of("ROLE_USER"))) //역할 추가
                .build();

        userRepository.save(user);

        log.info("생성된 User: {}",user.toString());
        return ResponseEntity.ok("회원가입에 성공하셨습니다.");
    }


    //로그인
    @Transactional
    public ResponseEntity<JwtToken> signIn(UserSignInRequest userSignInRequest) {

        // 1. username + password 를 기반으로 Authentication 객체 생성
        // 이때 authentication 은 인증 여부를 확인하는 authenticated 값이 false
        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(userSignInRequest.getUsername(), userSignInRequest.getPassword());

        // 2. 실제 검증. authenticate() 메서드를 통해 요청된 Member 에 대한 검증 진행
        // authenticate 메서드가 실행될 때 CustomUserDetailsService 에서 만든 loadUserByUsername 메서드 실행
        Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);

        log.info("Authentication successful: {}", authentication.isAuthenticated());
        log.info("Authenticated username: {}", authentication.getName());
        log.info("Granted Authorities: {}", authentication.getAuthorities());

        // 3. 인증 정보를 기반으로 JWT 토큰 생성
        JwtToken jwtToken = jwtTokenProvider.generateToken(authentication);


        log.info("username: {}",userSignInRequest.getUsername());
        log.info("password: {}",userSignInRequest.getPassword());
        log.info("jwtToken accessToken = {}, refreshToken = {}", jwtToken.getAccessToken(), jwtToken.getRefreshToken());

        return ResponseEntity.ok(jwtToken);
    }

    // JWT 토큰 무효화 로직 구현 (예: 블랙리스트에 추가)
    public void logout(String username) {
        System.out.println("User " + username + " has logged out.");
    }

}
