package xyz.masaimara.prototype.data.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RedisTest {

    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;
}
