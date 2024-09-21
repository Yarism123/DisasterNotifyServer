package com.company.disasternotifyapp.user;

import com.company.disasternotifyapp.user.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
@ActiveProfiles("test") // 테스트 프로파일 설정 (선택 사항)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {
        // 테스트 사용자 데이터 추가
        userRepository.deleteAll(); // 이전 데이터 삭제
        User user = User.builder()
                .username("testUser")
                .password("testPassword")
                .roles(List.of("ROLE_USER")).build();
        userRepository.save(user);
    }

    @Test
    public void testFindByUsername() {
        Optional<User> foundUser = userRepository.findUserByUsername("testUser");
        assertThat(foundUser).isPresent(); // 사용자가 존재해야 함
        assertThat(foundUser.get().getUsername()).isEqualTo("testUser"); // 사용자 이름 확인
    }

    @Test
    public void testFindByUsername_NotFound() {
        Optional<User> foundUser = userRepository.findUserByUsername("nonExistentUser");
        assertThat(foundUser).isNotPresent(); // 사용자가 존재하지 않아야 함
    }
}