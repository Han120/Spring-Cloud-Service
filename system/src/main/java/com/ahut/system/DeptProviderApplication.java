package com.ahut.system;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

/**
 * @author hzj
 */
@EnableDiscoveryClient //Eureka服务发现
@EnableEurekaClient  //本服务启动后会自动注册进eureka服务中
@SpringBootApplication
public class DeptProviderApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(DeptProviderApplication.class);

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DeptProviderApplication.class);
        Environment environment = application.run(args).getEnvironment();
        LOGGER.info("启动成功");
        LOGGER.info("System地址：\thttp://127.0.0.1:{}", environment.getProperty("server.port"));
    }
}
