package com.example.zlc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.zlc.entity.admin;
import com.example.zlc.mapper.userMapper;
import com.example.zlc.service.userService;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl extends ServiceImpl<userMapper, admin> implements userService {
}
