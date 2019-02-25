package com.kth.dtboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kth.dtboot.dao")
public class SpringbootRzApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRzApplication.class, args);
    }
}
