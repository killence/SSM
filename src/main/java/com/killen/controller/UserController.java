package com.killen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author killen
 * @Date 2020-03-09
 * @Version V1.0
 * 用户的控制器
 **/
@Controller
public class UserController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

}
