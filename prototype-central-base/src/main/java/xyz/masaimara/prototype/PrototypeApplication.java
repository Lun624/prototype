package xyz.masaimara.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.ValueOperations;
import xyz.masaimara.prototype.data.mapper.TestMapper;

@SpringBootApplication
public class PrototypeApplication implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(PrototypeApplication.class);

    private final TestMapper testMapper;
//    @Autowired
//    private RedisTest test;

    private final ListOperations<String, String> listOperations;
    private ValueOperations<String, String> valueOperations;

    @Autowired
    public PrototypeApplication(TestMapper testMapper, ListOperations<String, String> listOperations, ValueOperations<String, String> valueOperations) {
        this.testMapper = testMapper;
        this.listOperations = listOperations;
        this.valueOperations = valueOperations;
    }

    public static void main(String[] args) {
        SpringApplication.run(PrototypeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("result:{}", testMapper.findJobById("0e9573bb7ad5409daf3299d1a0e4a48f"));

        valueOperations.set("0e9573bb7ad5409daf3299d1a0e4a48f", "http://masaimara.xyz");
        listOperations.leftPush("spring.boot.redis.test", "0e9573bb7ad5409daf3299d1a0e4a48f");
        String key = "spring.boot.redis.test";
    }
}
