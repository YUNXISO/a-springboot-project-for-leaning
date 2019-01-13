package com.jshen.girl.controller;

import com.jshen.girl.PO.TestProerty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@PropertySource(value = "classpath:application.yml")
@RestController
public class GetPropertyController {
    @Autowired
    private TestProerty testProerty;


    @RequestMapping("/testconfig2")
    public Object getAttribution(){
        return testProerty;
    }
}
