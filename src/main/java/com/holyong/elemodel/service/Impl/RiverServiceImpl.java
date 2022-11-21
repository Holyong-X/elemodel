package com.holyong.elemodel.service.Impl;

import com.holyong.elemodel.entity.River;
import com.holyong.elemodel.mapper.RiverMapper;
import com.holyong.elemodel.service.RiverService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @author holyong
 * @date 2022-11-16
 * @description 河道 服务实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RiverServiceImpl extends ServiceImpl<RiverMapper, River> implements RiverService {
}
