package com.holyong.elemodel.service.Impl;

import com.holyong.elemodel.entity.DicStudentstatus;
import com.holyong.elemodel.mapper.DicStudentstatusMapper;
import com.holyong.elemodel.service.DicStudentstatusService;
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
public class DicStudentstatusServiceImpl extends ServiceImpl<DicStudentstatusMapper, DicStudentstatus> implements DicStudentstatusService {
}
