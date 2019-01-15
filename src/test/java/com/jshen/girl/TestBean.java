package com.jshen.girl;

import com.jshen.girl.beanTest.Bean2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {GirlApplication.class})
public class TestBean {
    @Autowired
    private Bean2 bean2;

    @Test
    public void testBean2(){
        System.out.println("======"+bean2.getName()+"======");
    }
}
