package xyz.masaimara.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import xyz.masaimara.prototype.data.mapper.TestMapper;
import xyz.masaimara.prototype.data.redis.Address;
import xyz.masaimara.prototype.data.redis.Person;
import xyz.masaimara.prototype.data.redis.RedisRepository;

@SpringBootApplication
public class PrototypeApplication implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(PrototypeApplication.class);

    private final TestMapper testMapper;

    private final RedisRepository redisRepository;

    @Autowired
    public PrototypeApplication(TestMapper testMapper, RedisRepository redisRepository) {
        this.testMapper = testMapper;
        this.redisRepository = redisRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(PrototypeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("result:{}", testMapper.findJobById("0e9573bb7ad5409daf3299d1a0e4a48f"));

        redisRepository.addToken("prototype.user.token", "0e9573bb7ad5409daf3299d1a0e4a48f1");

//        Person person = new Person();
//        person.setFirstname("a").setLastname("b")
//                .setAddress(new Address().setCountry("China").setCity("Shanghai"));
//        redisRepository.wirteJack("0e9573bb7ad5409daf3299d1a0e4a48f1", person);
    }
}
