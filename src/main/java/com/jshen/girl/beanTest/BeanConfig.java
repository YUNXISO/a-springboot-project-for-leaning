package com.jshen.girl.beanTest;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 测试Bean初始化顺序以及当一个bean依赖另一个bean时
 * 使用第三方SDK开发时可以使用此方法实现spring管理第三方包
 * 在实例化bean2时spring会查询beanfactory中是否有bean1实例，没有则创建，有则使用
 * 使用@Data注解可以省略getter、setter，IDEA中下载lombok插件使使用@Data后调用方法不报错
 * @ConfigurationProperties(prefix = "bean1")可以使用配置文件直接注入对象的setter方法
 * 方法详见测试类
 */

@Configuration
public class BeanConfig {


    @Bean
    public Bean2 bean2(Bean1 bean1){
        Bean2 bean2 = new Bean2();
        bean2.setName(bean1.getName());
        System.out.println("======the Bean2's param include Bean1======");
        return bean2;
    }
//
//    @Bean
//    public Bean2 bean2(){
//        System.out.println("======Bean2======");
//        return new Bean2();
//    }

    @Bean
    @ConfigurationProperties(prefix = "bean1")
    public Bean1 bean1(){
        System.out.println("======Bean1======");
        return new Bean1();
    }



}
