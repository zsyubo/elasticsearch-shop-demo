package com.mayikt.v1.test;

import com.mayikt.v1.entity.UserEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: V1TestSpring
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/6/2220:59
 */
public class V1TestSpring {
    private static ClassPathXmlApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserEntity userEntity = applicationContext.getBean("userEntity", UserEntity.class);
        System.out.println(userEntity.toString());
    }
    /**
     * 面试题： spring中注入的beanid 如果重复的话，会怎么样？ 启动的时候会报错
     *
     * spring启动方式 xml方式  完全采用注解形式
     */
}
