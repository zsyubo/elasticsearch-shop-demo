package org.shop.product.client;

import org.shop.common.vo.UserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// ,path = "/eureka-client-shop-product"
@FeignClient(name = "eureka-client-shop-user", fallback = UserClientFallBack.class)
public interface UserClient {

    @RequestMapping(value = "/user/get", method = RequestMethod.GET)
//    @RequestParam("id")  必须要，不然会调用500
    UserVo getUserVoById(@RequestParam("id") int id);
}
