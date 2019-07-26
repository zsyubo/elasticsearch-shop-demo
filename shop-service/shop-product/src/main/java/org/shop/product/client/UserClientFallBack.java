package org.shop.product.client;

import org.shop.common.vo.UserVo;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallBack implements UserClient {

    @Override
    public UserVo getUserVoById(int id) {
        UserVo userVo = new UserVo();
        userVo.setAge(99);
        userVo.setName("异常");
        userVo.setId(id);
        return userVo;
    }
}
