package org.example.disasternotifyserver.user;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class UserControllerTest {

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Test
    public void passwordEncodeTest(){
        String rawPassword = "myPassword123";
        String encodedPassword = passwordEncoder.encode(rawPassword);

        log.info("encodedPassword = {}",encodedPassword);
        // 인코딩된 비밀번호가 null이 아님을 확인
        assertTrue(encodedPassword != null && !encodedPassword.isEmpty());

        // 인코딩된 비밀번호가 원본 비밀번호와 일치하지 않아야 함
        assertTrue(!encodedPassword.equals(rawPassword));

        // 인코딩된 비밀번호가 원본 비밀번호와 일치하는지 확인
        assertTrue(passwordEncoder.matches(rawPassword, encodedPassword));
    }
}