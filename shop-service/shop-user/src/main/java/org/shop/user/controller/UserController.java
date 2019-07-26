package org.shop.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.shop.common.vo.UserVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/get")
    public UserVo getUserVoById(int id) {
        UserVo userVo = new UserVo();
        userVo.setAge(id);
        userVo.setName("你好");
        userVo.setAge(36);
        return userVo;
    }
}
