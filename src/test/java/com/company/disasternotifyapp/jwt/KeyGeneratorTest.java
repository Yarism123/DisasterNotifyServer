package com.company.disasternotifyapp.jwt;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class KeyGeneratorTest {

    @Test
    void randomKeyCheck(){
        String s = KeyGenerator.generateSecretKey();
        log.info("key = {}",s);
    }
}