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


}
