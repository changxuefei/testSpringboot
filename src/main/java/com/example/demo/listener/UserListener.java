package com.example.demo.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @author: ChangXuefei
 * @date: 2018/11/29 16:59
 * @Version 1.0
 */
@WebListener
@Slf4j
public class UserListener implements ServletRequestListener {
    // implements SessionListener ServletContextListener
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("监听器销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("监听器初始化");
    }
}
