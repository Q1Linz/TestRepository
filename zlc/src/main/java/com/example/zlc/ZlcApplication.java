package com.example.zlc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.zlc.mapper")
public class ZlcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZlcApplication.class, args);
    }

}
