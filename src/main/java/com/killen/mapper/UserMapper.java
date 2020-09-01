package com.killen.mapper;

import com.killen.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description: TODO
 * @Author killen
 * @Date 2020-03-10
 * @Version V1.0
 **/
public interface UserMapper {
    public List<User> findUserAll();
}
