package com.mayikt.v2.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: UserService
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/6/2221:09
 */
@Service
@Lazy(false)
//@Lazy
public class UserService {

    // @Lazy 如果 为true 的情况 下，  懒汉式，在获取的时候才被初始化
    // @Lazy 如果 为false 的情况下 饿汉式 在启动的时候 对象被创建
    // 如果不写@Lazy 注解的情况下 默认是饿汉式
    public UserService() {
        System.out.println("无参构造函数被执行...");
    }
}
