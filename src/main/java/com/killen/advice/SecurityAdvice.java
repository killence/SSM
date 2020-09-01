package com.killen.advice;

import org.springframework.stereotype.Repository;

/**
 * @ClassName SecurityAdvice
 * @Description: TODO
 * @Author killen
 * @Date 2020-03-09
 * @Version V1.0
 * 安全验证
 **/
public class SecurityAdvice {

    /**
     * 登入安全用户
     */
    public void loginSecurity() {
        System.out.println("验证账号密码是否安全！");
    }

}
