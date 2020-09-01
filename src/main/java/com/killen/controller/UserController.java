package com.killen.controller;

import com.killen.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

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
     public @ResponseBody  String hello() {
         return "Hello World!";
     }

     @RequestMapping("/user")
     public @ResponseBody User user() {
         User user = new User();
         user.setId(1);
         user.setAge(18);
         user.setName("mole");
         user.setPassWord("admin");
         user.setRegisteredTime(new Date());
         user.setSex("男");
         return user;
     }
}
