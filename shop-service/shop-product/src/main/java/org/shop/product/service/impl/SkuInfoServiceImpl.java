package org.shop.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.shop.product.entity.SkuInfo;
import org.shop.product.mapper.SkuInfoMapper;
import org.shop.product.service.ISkuInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 库存单元表 服务实现类
 * </p>
 *
 * @author hyf
 * @since 2019-07-26
 */
@Service
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoMapper, SkuInfo> implements ISkuInfoService {

}
