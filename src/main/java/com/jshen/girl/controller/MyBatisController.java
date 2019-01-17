package com.jshen.girl.controller;

import com.jshen.girl.PO.DTO.User;
import com.jshen.girl.mapper.UserMapper;
import com.jshen.girl.service.UserService;
import com.jshen.girl.service.impl.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MyBatisController {


    private final UserService userService;

    @Autowired
    public MyBatisController(UserService userService) {
        this.userService = userService;
    }




    @GetMapping("/api/add")
    public Object add(){
        User user = new User();
        user.setName("leo");
        user.setAge(18);
        user.setPhone("13320925765");
        user.setCreateTime(new Date());
        Integer id = userService.add(user);

        return id;
    }

    @GetMapping("/api/delete")
    public Object delete(Long id){
        return userService.deleteUser(id);
    }

    @GetMapping("/api/update")
    public Object update(String name,int id){
        User user = new User();
        user.setName(name);
        user.setId(id);
        return userService.updateUser(user);
    }

        @GetMapping("/api/findById")
    public Object findById(Long id){
        return userService.findById(id);
    }

    @GetMapping("/api/findAll")
    public Object findById(){
        return userService.findAll();
    }




}
