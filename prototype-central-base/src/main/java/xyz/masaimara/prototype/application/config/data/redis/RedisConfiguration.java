package xyz.masaimara.prototype.application.config.data.redis;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:/redis.properties")
//@EnableTransactionManagement
//@ConfigurationProperties("spring.redis")
public class RedisConfiguration {
//    @Bean
//    public StringRedisTemplate redisTemplate() {
//        StringRedisTemplate template = new StringRedisTemplate(redisConnectionFactory());
//        // explicitly enable transaction support
//        template.setEnableTransactionSupport(true);
//        return template;
//    }

//    @Bean
//    public LettuceConnectionFactory redisConnectionFactory() {
//        return new LettuceConnectionFactory(new RedisStandaloneConfiguration());
//    }

    /**
     * listOperations
     * valueOperations
     * GeoOperations
     * HashOperations
     * HyperLogLogOperations
     * SetOperations
     * ZSetOperations
     *
     * BoundGeoOperations
     * BoundHashOperations
     * BoundKeyOperations
     * BoundListOperations
     * BoundSetOperations
     * BoundValueOperations
     * BoundZSetOperations
     */
}
