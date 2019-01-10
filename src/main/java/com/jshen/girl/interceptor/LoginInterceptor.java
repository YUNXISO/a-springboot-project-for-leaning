package com.jshen.girl.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 进入controller之前
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request
            , HttpServletResponse response
            , Object handler) throws Exception {

        System.out.println("loginInterceptor------->preHandle");

//        String token = request.getParameter("access_token");
//        /*
//        *业务操作
//        */
//        response.getWriter().print("错误");
//        response.getWriter().flush();
//        response.getWriter().close();

        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    /**
     * 调用完controller后，视图渲染前
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request
            , HttpServletResponse response
            , Object handler
            , ModelAndView modelAndView) throws Exception {

        System.out.println("loginInterceptor------->postHandle");

         HandlerInterceptor.super.postHandle(request,response,handler,modelAndView);

    }

    /**
     * 整个完成之后，通常用于资源清理
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request
            , HttpServletResponse response
            , Object handler
            , Exception ex) throws Exception {

        System.out.println("loginInterceptor------->afterCompletion");

        HandlerInterceptor.super.afterCompletion(request,response,handler,ex);

    }
}
