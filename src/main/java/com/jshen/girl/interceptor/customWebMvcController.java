package com.jshen.girl.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class customWebMvcController implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/hello");
        //拦截全部时最末尾需要“**”，普通子目录只用“*”
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
