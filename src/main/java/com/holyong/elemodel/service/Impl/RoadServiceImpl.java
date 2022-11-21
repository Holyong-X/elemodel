package com.holyong.elemodel.service.Impl;

import com.holyong.elemodel.entity.Road;
import com.holyong.elemodel.mapper.RoadMapper;
import com.holyong.elemodel.service.RoadService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @author holyong
 * @date 2022-11-16
 * @description  服务实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoadServiceImpl extends ServiceImpl<RoadMapper, Road> implements RoadService {
}
