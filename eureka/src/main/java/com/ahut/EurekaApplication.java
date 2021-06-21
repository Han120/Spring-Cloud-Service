package com.ahut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;

/**
 * @author hzj
 */
@EnableEurekaServer  //Eureka Server 服务启动类，接收其他微服务注册进来
@SpringBootApplication
public class EurekaApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(EurekaApplication.class);

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(EurekaApplication.class);
        Environment environment = application.run(args).getEnvironment();
        LOGGER.info("启动成功");
        LOGGER.info("System地址：\thttp://127.0.0.1:{}", environment.getProperty("server.port"));
    }
}
