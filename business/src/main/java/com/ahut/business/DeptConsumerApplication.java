package com.ahut.business;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * @author hzj
 */
@SpringBootApplication
public class DeptConsumerApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(DeptConsumerApplication.class);

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DeptConsumerApplication.class);
        Environment environment = application.run(args).getEnvironment();
        LOGGER.info("启动成功");
        LOGGER.info("Business地址：\thttp://127.0.0.1:{}", environment.getProperty("server.port"));
    }
}
