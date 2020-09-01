package com.killen.service.impl;

import com.killen.entity.User;
import com.killen.mapper.UserMapper;
import com.killen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description: TODO
 * @Author killen
 * @Date 2020-03-09
 * @Version V1.0
 **/
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> userAll() {
        return userMapper.findUserAll();
    }


//    public List<User> userAll() {
//        return userMapper.userAll();
//    }
//
//    public User findByUserName(String userName) {
//        return userDao.findByUserName(userName);
//    }
//
//    public void addUser(User user) {
//        userDao.addUser(user);
//    }
//
//    public void updateUser(User user) {
//        userDao.updateUser(user);
//    }
//
//    public void deleteUser(Integer id) {
//        userDao.deleteUser(id);
//    }
}
