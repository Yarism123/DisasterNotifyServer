package com.company.disasternotifyapp.user;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class RedisService {

    private final RedisTemplate<String, String> redisTemplate;

    // Access Token을 Redis에 저장
    public void storeAccessToken(String accessToken, String value, long timeout, TimeUnit timeUnit) {
        redisTemplate.opsForValue().set(accessToken, value, timeout, timeUnit);
    }

    // Access Token 값을 가져오기
    public String getValues(String accessToken) {
        return redisTemplate.opsForValue().get(accessToken);
    }

    // Access Token 삭제 (로그아웃 시 사용)
    public void deleteAccessToken(String accessToken) {
        redisTemplate.delete(accessToken);
    }
}
