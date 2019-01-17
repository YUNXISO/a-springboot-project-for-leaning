package com.jshen.girl.service.impl;

import com.jshen.girl.PO.DTO.User;
import com.jshen.girl.mapper.UserMapper;
import com.jshen.girl.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public User findById(Long userId) {
        return userMapper.findById(userId);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public String updateUser(User user) {
        Integer num =  userMapper.update(user);
        return num.toString();
    }

    @Override
    public String deleteUser(Long userId) {
        Integer num =  userMapper.delete(userId);
        return num.toString();
    }
}
