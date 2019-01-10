package com.jshen.girl.controller;

import com.jshen.girl.POJO.MyException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {
    @GetMapping(value = "/api/ext_test")
    public void testException() throws Exception{
        int a = 1/0;
    }

    @RequestMapping(value = "/api/ext_test2")
    public void testMyException() throws MyException {
        throw new MyException("999","Test");
    }


}
