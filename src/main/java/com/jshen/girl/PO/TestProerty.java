package com.jshen.girl.PO;



import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource({"classpath:application.yml"})
//@ConfigurationProperties  //不配置@value的情况下需要以下注解
@ConfigurationProperties(prefix = "testpro")

public class TestProerty {
//    @Value("${testPro.name}")
    private String name;
//    @Value("${testPro.sex}")
    private String sex;
//    @Value("${testPro.age}")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
