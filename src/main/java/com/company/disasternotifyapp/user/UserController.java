package com.company.disasternotifyapp.user;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.company.disasternotifyapp.jwt.JwtToken;
import com.company.disasternotifyapp.jwt.JwtTokenProvider;
import com.company.disasternotifyapp.user.request.UserSignInRequest;
import com.company.disasternotifyapp.user.request.UserSignUpRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;
    private final JwtTokenProvider jwtTokenProvider;

    @PostMapping("/sign-up")
    public ResponseEntity<String> signUp(@RequestBody UserSignUpRequest user) {
        return userService.signup(user);
    }

    @PostMapping("/sign-in")
    public ResponseEntity<JwtToken> login(@RequestBody UserSignInRequest user) {
        return userService.signIn(user);
    }


    @PostMapping("/logout")
    public ResponseEntity<String> logout(Authentication authentication, HttpServletRequest request) {
        if (authentication != null) {
            String accessToken = extractAccessTokenFromRequest(request); // 요청에서 Access Token 추출
            if (accessToken != null) {
                jwtTokenProvider.invalidateAccessToken(accessToken); // Access Token 무효화
                return ResponseEntity.ok("로그아웃 성공");
            } else {
                return ResponseEntity.status(400).body("로그아웃 실패: Access Token이 없습니다.");
            }
        } else {
            return ResponseEntity.status(401).body("로그아웃 실패: 인증되지 않은 사용자");
        }
    }

    // 요청에서 Access Token을 추출하는 메서드
    private String extractAccessTokenFromRequest(HttpServletRequest request) {
        String bearerToken = request.getHeader(HttpHeaders.AUTHORIZATION);
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7); // "Bearer " 부분을 잘라내고 실제 토큰 반환
        }
        return null; // 토큰이 없으면 null 반환
    }

    @GetMapping("/test")
    public ResponseEntity<String> testApi(Principal principal) {
        if (principal == null) {
            throw new IllegalArgumentException("사용자가 인증되지 않았습니다.");
        }
        return ResponseEntity.ok("자격 인증 성공!");
    }

}
