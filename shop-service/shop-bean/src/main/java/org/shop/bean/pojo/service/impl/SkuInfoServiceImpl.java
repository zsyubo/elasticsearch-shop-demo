package org.shop.bean.pojo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.shop.bean.pojo.entity.SkuInfo;
import org.shop.bean.pojo.mapper.SkuInfoMapper;
import org.shop.bean.pojo.service.ISkuInfoService;
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
