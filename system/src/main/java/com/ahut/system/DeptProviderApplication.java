package com.ahut.system;


import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * @author hzj
 */
@SpringBootApplication
public class DeptProviderApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(DeptProviderApplication.class);

    public static void main(String[] args) {
        try {
            SpringApplication application = new SpringApplication(DeptProviderApplication.class);
            Environment environment = application.run(args).getEnvironment();
            LOGGER.info("启动成功");
            LOGGER.info("System地址：\thttp://127.0.0.1:{}", environment.getProperty("server.port"));
        } catch (Exception e) {
            LOGGER.error("启动失败====> {}", e.getMessage(), e);
        }
    }
}
