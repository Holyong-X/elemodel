package com.holyong.elemodel.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.holyong.elemodel.entity.ParkLot;
import com.holyong.elemodel.mapper.ParkLotMapper;
import com.holyong.elemodel.service.ParkLotService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author holyong
 * @date 2022-11-18
 * @description  服务实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ParkLotServiceImpl extends ServiceImpl<ParkLotMapper, ParkLot> implements ParkLotService {
}
