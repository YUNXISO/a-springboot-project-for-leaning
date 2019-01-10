package com.jshen.girl.controller;

import com.jshen.girl.POJO.JsonTest;
import com.jshen.girl.POJO.MyException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@PropertySource({"classpath:application.yml"})
@RestController
public class testController {

    @Value("${testpro2.name}")
    private String name;

    @Value("${testpro2.age}")
    private Integer age;

    @Value("${testpro2.sex}")
    private String sex;

    private Map<String,Object> testMap;

    @RequestMapping("/hello")
    public String hello() throws MyException {
        System.out.println("Controller 处理中！");
        return "Hi hello world";
    }

    @GetMapping("/Test/MockMvc")
    public String mockMvcTestAPI(){
        return "MockMVC";
    }

    @RequestMapping("/hello2")
    public String hello_2(){
        return "Hi hello world";
    }


    @RequestMapping("/testconfig")
    public Map<String, Object> getAttribution(){
        testMap = new HashMap<>(16);
        testMap.put("name",name);
        testMap.put("age",age);
        testMap.put("sex",sex);
        return testMap;
    }

    @GetMapping("/TestJson")
    public Object TestJson(){
        return new JsonTest(new Date(),"李虎林");
    }


}
