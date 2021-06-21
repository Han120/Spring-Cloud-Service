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
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(EurekaApplication.class);

    public static void main(String[] args) {
        try {
            SpringApplication application = new SpringApplication(EurekaApplication.class);
            Environment environment = application.run(args).getEnvironment();
            LOGGER.info("启动成功");
            LOGGER.info("System地址：\thttp://127.0.0.1:{}", environment.getProperty("server.port"));
        } catch (Exception e) {
            LOGGER.error("启动失败====> {}", e.getMessage(), e);
        }
    }
}
