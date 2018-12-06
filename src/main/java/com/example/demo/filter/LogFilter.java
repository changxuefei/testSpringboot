package com.example.demo.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author: ChangXuefei
 * @date: 2018/11/29 16:10
 * @Version 1.0
 */
@Slf4j
@WebFilter(filterName = "logFilter",urlPatterns = {"/*"})
public class LogFilter implements Filter {
    @Override
    public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {
        log.info("filter初始化");
    }


    @Override
    public void destroy() {
        log.info("filter销毁");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("LogFilter=====");
        chain.doFilter(request,response);
    }
}
