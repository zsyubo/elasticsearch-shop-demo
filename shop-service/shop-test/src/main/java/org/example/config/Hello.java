package org.example.config;

import org.others.AutoHelloInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Hello {
//    @Autowired
//    Helloworld helloworld;
//
//    public void say(){
//        helloworld.say();
//    }


    @Resource
    AutoHelloInter he;

    public void say(){
        he.getName();
    }
}
