package com.jshen.girl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@ServletComponentScan
//public class GirlApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(GirlApplication.class, args);
//    }
//}

public class GirlApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(GirlApplication.class);
    }

        public static void main(String[] args) throws Exception {
        SpringApplication.run(GirlApplication.class, args);
    }
}
