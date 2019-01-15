package com.jshen.girl;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.jshen.girl.mapper")
//@MapperScan({"com.jshen.girl.mapper"})
@ServletComponentScan

//public class GirlApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(GirlApplication.class, args);
//    }
//}

public class GirlApplication extends SpringBootServletInitializer {

    /**
     * 打war包需要修改启动类
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(GirlApplication.class);
    }

        public static void main(String[] args) throws Exception {
        SpringApplication.run(GirlApplication.class, args);
    }


}
