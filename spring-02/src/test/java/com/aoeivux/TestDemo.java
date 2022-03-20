package com.aoeivux;

import com.aoeivux.pojo.Student;
import com.aoeivux.pojo.User;
import com.aoeivux.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void helloSpring(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //在执行getBean的时候，也就是new ClassPathXmlApplicationContext()的时候，就已经创建好了,放在一个容器里面


        User user = context.getBean("user", User.class);
        User user1 = context.getBean("user", User.class);

        user.getUser();

        System.out.println(user == user1);

        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());
    }
}
