package com.holyong.elemodel.service.Impl;

import com.holyong.elemodel.entity.DicPolitical;
import com.holyong.elemodel.mapper.DicPoliticalMapper;
import com.holyong.elemodel.service.DicPoliticalService;
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
public class DicPoliticalServiceImpl extends ServiceImpl<DicPoliticalMapper, DicPolitical> implements DicPoliticalService {
}
