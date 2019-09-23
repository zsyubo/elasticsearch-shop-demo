package com.mayikt.v2;

import com.mayikt.v1.entity.UserEntity;
import com.mayikt.v2.config.MySpringConfig;
import com.mayikt.v2.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 蚂蚁课堂创始人-余胜军QQ644064779
 * @title: V2TestSpring
 * @description: 每特教育独创第五期互联网架构课程
 * @date 2019/6/2221:13
 */
public class V2TestSpring {
    private static AnnotationConfigApplicationContext annotationConfigApplicationContext;

    public static void main(String[] args) {
        // applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 既然现在是注解方式，那么如何启动呢、
        annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MySpringConfig.class);
        System.out.println("启动配置加载完毕...");
        UserEntity userEntity = annotationConfigApplicationContext.getBean("userEntity", UserEntity.class);
        // spring核心是IOC  Map集合 和AOP
//        System.out.println("userEntity:" + userEntity.toString());
        // 源码分析 重点去分析annotationConfigApplicationContext
        UserService userService1 = annotationConfigApplicationContext.getBean("userService", UserService.class);
//        UserService userService2 = annotationConfigApplicationContext.getBean("userService", UserService.class);
//        System.out.println(userService1 == userService2);
//        //打印spring注入的对象
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        System.out.println("-------");
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            System.out.println(beanDefinitionNames[i]);
        }
        // spring中默认的对象是单例 userService1 == userService2 等于true情况下 不同的呢 多例子
        //思考问题 bean对象是在什么时候创建的呢？
        /**
         *
         * 默认情况是懒汉时 两种启动方式  第一种 调用的时候 采创建、第二种当配置文件在加载的时候创建
         * 如何证明 默认情况下是调用的时候创建呢？
         */
    }
}
