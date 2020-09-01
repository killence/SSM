package com.killen.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName User
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-22
 * @Version V1.0
 * 用户实例类
 **/
public class User implements Serializable {
    //用户Id
    private Integer id;
    //用户名
    private String name;
    //密码
    private String passWord;
    //年龄
    private Integer age;
    //性别
    private String sex;
    //注册时间
    private Date registeredTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getRegisteredTime() {
        return registeredTime;
    }

    public void setRegisteredTime(Date registeredTime) {
        this.registeredTime = registeredTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passWord='" + passWord + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", registeredTime=" + registeredTime +
                '}';
    }
}
