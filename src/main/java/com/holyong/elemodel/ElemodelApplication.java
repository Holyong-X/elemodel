package com.holyong.elemodel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableScheduling
@EnableSwagger2
@ComponentScan(basePackages = {"com.holyong"})
@MapperScan(basePackages = "com.holyong.elemodel.mapper")
@SpringBootApplication
public class ElemodelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElemodelApplication.class, args);
    }

}
