package org.others;

import org.springframework.stereotype.Service;

@Service("autoHello111")
public class AutoHello implements  AutoHelloInter{
    @Override
    public void getName(){
        System.out.println("AutoHello::getName");
    }
}
