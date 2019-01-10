package com.jshen.girl.servlet;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
/**
 * 自定义ServletRequestListener
 */
public class requestListener implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("=====requestInitialized=====");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("=====requestDestroyed=====");
    }


}
