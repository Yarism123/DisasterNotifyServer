package org.example.disasternotifyserver.jwt;

import java.security.SecureRandom;
import java.util.Base64;

public class KeyGenerator {
    public static String generateSecretKey() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] key = new byte[32]; // 256비트
        secureRandom.nextBytes(key);
        return Base64.getEncoder().encodeToString(key);
    }
}
