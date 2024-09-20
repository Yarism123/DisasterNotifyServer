package org.example.disasternotifyserver.jwt;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class KeyGeneratorTest {

    @Test
    void randomKeyCheck(){
        String s = KeyGenerator.generateSecretKey();
        log.info("key = {}",s);
    }
}