import com.killen.entity.User;
import com.killen.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * @ClassName UserTest
 * @Description: TODO
 * @Author killen
 * @Date 2020-03-09
 * @Version V1.0
 **/
//@ContextConfiguration(locations = {"classpath:beans.xml"})
//RunWith的value属性指定以spring test的SpringJUnit4ClassRunner作为启动类
//如果不指定启动类，默认启用的junit中的默认启动类
//@RunWith(value = SpringJUnit4ClassRunner.class)
public class UserTest {

//    @Autowired
//    private UserService userService;

    @Test
    public void findUserAll_test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        List<User> users = userService.userAll();
        for (User user : users) {
            System.out.println(user);
        }
    }


}
