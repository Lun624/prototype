package xyz.masaimara.prototype.data.redis.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

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
