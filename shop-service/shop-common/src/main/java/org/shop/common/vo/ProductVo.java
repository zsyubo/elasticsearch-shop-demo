package org.shop.common.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductVo {

    private int id;

    private String productName;

    private BigDecimal price;

    private UserVo uservo;
}
