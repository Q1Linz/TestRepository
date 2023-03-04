package com.example.zlc.controller;


import com.example.zlc.entity.admin;
import com.example.zlc.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class userController {
    @Autowired
    private userService userService;

    @RequestMapping("/toIndex")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/selectAdmin")
    public String selectAdmin(Model model){
        List<admin> admins = userService.list();
        model.addAttribute("admins",admins);
        return "admin";
    }
}
