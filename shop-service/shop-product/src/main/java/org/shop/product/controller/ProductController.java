package org.shop.product.controller;

import lombok.extern.slf4j.Slf4j;
import org.shop.common.vo.ProductVo;
import org.shop.common.vo.UserVo;
import org.shop.product.client.UserClient;
import org.shop.product.entity.SkuInfo;
import org.shop.product.service.ISkuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * 商品Controller
 *
 * @author hyf
 * @date 2019-07-25
 **/
@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ISkuInfoService skuInfoService;

    @Autowired
    UserClient userClient;

    @RequestMapping("/get")
    public ProductVo getProductById(int id) {
        ProductVo productVo = new ProductVo();
        productVo.setId(id);
        productVo.setProductName("好蜂蜜");
        productVo.setPrice(new BigDecimal("10.6"));
        UserVo userVo = userClient.getUserVoById(6);
        System.out.println("查询的UsetrVo：" + userVo);
        productVo.setUservo(userVo);
        return productVo;
    }

    @RequestMapping("/get_sku_info")
    public SkuInfo getSkuInfoById(int id) {
        return skuInfoService.getById(id);
    }
}
