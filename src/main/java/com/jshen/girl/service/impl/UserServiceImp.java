package com.jshen.girl.service.impl;

import com.jshen.girl.PO.DTO.User;
import com.jshen.girl.mapper.UserMapper;
import com.jshen.girl.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImp implements UserService {


    @Resource
     UserMapper userMapper;



    @Override
    public int add(User user) {
        userMapper.insert(user);
        int id = user.getId();
        return id;
    }
}
