package xyz.masaimara.prototype.application.config.data.redis;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@Configuration
@PropertySource("classpath:/redis.properties")
//@ConfigurationProperties("spring.redis")
public class RedisConfiguration {

//    @Bean
//    public LettuceConnectionFactory redisConnectionFactory() {
//        return new LettuceConnectionFactory(new RedisStandaloneConfiguration());
//    }

    @Bean
    @Qualifier("listOperations")
    public ListOperations listOperations(StringRedisTemplate template){
        return template.opsForList();
    }

    @Bean
    @Qualifier("valueOperations")
    public ValueOperations<String, String> valueOperations(StringRedisTemplate template) {
        return template.opsForValue();
    }
}
