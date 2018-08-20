package xyz.masaimara.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import xyz.masaimara.prototype.data.mapper.TestMapper;

@SpringBootApplication
public class PrototypeApplication implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(PrototypeApplication.class);

    private final TestMapper testMapper;

    @Autowired
    public PrototypeApplication(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(PrototypeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("result:{}", testMapper.findJobById("0e9573bb7ad5409daf3299d1a0e4a48f"));
    }
}
