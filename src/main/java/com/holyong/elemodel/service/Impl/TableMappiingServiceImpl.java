package com.holyong.elemodel.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.holyong.elemodel.entity.TableMappiing;
import com.holyong.elemodel.mapper.TableMappiingMapper;
import com.holyong.elemodel.service.TableMappiingService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author holyong
 * @date 2022-11-18
 * @description 表名称映射关系表 服务实现类
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TableMappiingServiceImpl extends ServiceImpl<TableMappiingMapper, TableMappiing> implements TableMappiingService {
}
