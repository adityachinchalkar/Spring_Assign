package com.edyoda;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Myapp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("myUser", User.class);
        System.out.println(user.displayinfo());
        System.out.println(user.getName());
        System.out.println(user.getPhone());
        context.close();
    }
}
