package xyz.masaimara.prototype.data.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisTemplates {
    public final RedisTemplate redisTemplate;

    public final StringRedisTemplate stringRedisTemplate;

    @Autowired
    public RedisTemplates(RedisTemplate redisTemplate, StringRedisTemplate stringRedisTemplate) {
        this.redisTemplate = redisTemplate;
        this.stringRedisTemplate = stringRedisTemplate;
    }

    public RedisTemplate getRedisTemplate() {
        return redisTemplate;
    }

    public StringRedisTemplate getStringRedisTemplate() {
        return stringRedisTemplate;
    }
}
