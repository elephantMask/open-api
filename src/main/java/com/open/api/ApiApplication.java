package com.open.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ServletComponentScan(value = "com.open.api")
@ComponentScan
// 开启注解事务管理，等同于xml配置文件中的 <tx:annotation-driven />
@EnableTransactionManagement
//@EnableEurekaServer
public class ApiApplication {

    @Value("${env}")
    private String env;

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
