package com.example.demo.controller;

import com.example.demo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author: ChangXuefei
 * @date: 2018/11/27 14:55
 * @Version 1.0
 */
@RestController  //有这个注解方法返回json就不用加@responseBody注解了
@Slf4j
public class IndexController {

    @Value("${tt}")
    private String url;
    @RequestMapping("/")
    public String index(){
        log.trace("=====trace1=====");
        log.debug("=====debug1=====");
        log.info("=====info1=====");
        log.warn("=====warn1=====");
        log.error("=====error1=====");
        User u = new User();
        return u.toString();
    }

    @GetMapping("/add")
    public void addUser(@Valid @RequestParam User user){
    // @Valid 会对User进行jsr验证，但是这个注解只能用在控制器，验证不通过会抛异常
    }
}
