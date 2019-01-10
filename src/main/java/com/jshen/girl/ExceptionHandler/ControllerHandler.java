package com.jshen.girl.ExceptionHandler;



import com.jshen.girl.POJO.MyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


//@ControllerAdvice
@RestControllerAdvice
public class ControllerHandler {

    private static final Logger LOG = LoggerFactory.getLogger(ControllerHandler.class);

    @ExceptionHandler(value = Exception.class)
    Object handleExcrption (Exception e , HttpServletRequest request){
        LOG.error("url:{}",request.getRequestURL());
        Map<String,Object> map = new HashMap<>(16);
        map.put("code",101);
        map.put("msg",e.getMessage());
        map.put("url",request.getRequestURL());

        return map;
    }

    @ExceptionHandler(value = MyException.class)
    Object myExceptionhandle (MyException e ,HttpServletRequest request){

//        thymleaf跳转
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("error.html");
//        modelAndView.addObject("msg",e.getMsg());
//        return modelAndView;

//        json返回错误
        Map<String,Object> map = new HashMap<>(16);
        map.put("msg",e.getMsg());
        map.put("code",e.getCode());
        map.put("url",request.getRequestURL());

        return map;
    }
}
