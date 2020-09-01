package com.killen.service;

import com.killen.entity.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description: TODO
 * @Author killen
 * @Date 2020-03-09
 * @Version V1.0
 * 用户业务层
 **/
public interface UserService {

    //    //查询所有用户记录
//    List<User> userAll();
//
//    //通过姓名查询用户记录
//    User findByUserName(String userName);
//
//    //添加用户
//    void addUser(User user);
//
//    //修改用户
//    void updateUser(User user);
//
//    //删除用户
//    void deleteUser(Integer id);
    List<User> userAll();
}
