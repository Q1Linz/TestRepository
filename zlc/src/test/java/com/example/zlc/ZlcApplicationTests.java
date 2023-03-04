package com.example.zlc;

import com.example.zlc.entity.admin;
import com.example.zlc.service.userService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ZlcApplicationTests {

    @Autowired
    private userService userService;

    @Test
    void contextLoads() {
        List<admin> list = userService.list();
        System.out.println("list = " + list);
    }

}
