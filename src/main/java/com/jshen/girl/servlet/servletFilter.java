package com.jshen.girl.servlet;

import com.jshen.girl.POJO.MyException;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义Filter用于非前后端分离的场景较为有效
 */

//@WebFilter(urlPatterns = "/api")
public class servletFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("自定义Filter初始化");
    }

    @Override
    public void destroy() {
        System.out.println("自定义Filter销毁");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException, MyException {
        System.out.println("doFilter");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        if (!"admin".equals(request.getParameter("username").toString())){
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
//            throw new MyException("555","权限不足");
              response.sendRedirect("/error.html");

        }
    }
}
