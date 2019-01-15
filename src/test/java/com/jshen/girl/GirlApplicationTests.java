package com.jshen.girl;

import com.jshen.girl.beanTest.Bean1;
import com.jshen.girl.beanTest.Bean2;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {GirlApplication.class})
public class GirlApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testOne(){
        System.out.println("this is a Test Function");
        TestCase.assertEquals(1,1);
    }


    @Before
    public void beforeTest(){
        System.out.println("Before");
    }

    @After
    public void afterTest(){
        System.out.println("After");
    }
}
