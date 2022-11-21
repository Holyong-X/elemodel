package com.holyong.elemodel.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.holyong.elemodel.entity.Road;
import com.holyong.elemodel.entity.TableMappiing;
import com.holyong.elemodel.service.TableMappiingService;
import com.holyong.elemodel.utils.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * @author holyong
 * @date 2022-11-18
 * @description 表名称映射关系表控制器
 */
@Api(value = "表名称映射关系表", tags = "表名称映射关系表")
@RestController
@RequestMapping("table-mappiing")
public class TableMappiingController {

    @Autowired
    private TableMappiingService targetService;



    /**
    * 获取分页数据
    *
    * @return
    */
    @ApiOperation(value = "获取表名称映射关系表分页列表", notes = "获取表名称映射关系表分页列表")
    @GetMapping(value = "{page}/{limit}")
    public ResponseResult list(@ApiParam(name = "current", value = "当前页码", required = true)
            @PathVariable Long current,
                               @ApiParam(name = "limit", value = "每页记录数", required = true)
            @PathVariable Long limit,
                               @RequestBody(required = false) TableMappiing entity) {
        Page<TableMappiing> pageParam = new Page<>(current, limit);
        QueryWrapper<TableMappiing> wrapper = new QueryWrapper<>();
        targetService.page(pageParam,wrapper);
        return ResponseResult.ok().data("items", pageParam.getRecords()).data("total", pageParam.getTotal());
    }


    /**
    * 查找所有记录数
    */
    @ApiOperation(value = "获取表名称映射关系表的所有数据")
    @GetMapping("/findAll")
    public ResponseResult findAll() {
        List<TableMappiing> list = targetService.list();
        return ResponseResult.ok().data("result",list);
    }



    /**
     * 根据ID查找数据
     */
    @ApiOperation(value = "获取表名称映射关系表详情", notes = "根据ID获取表名称映射关系表详情")
    @GetMapping("/get")
    public ResponseResult get(@RequestParam("id") String id) {
        TableMappiing entity = targetService.getById(id);
        return ResponseResult.ok().data("result",entity);
    }


    /**
     * 添加数据
     * @return
     */
    @ApiOperation(value = "新增表名称映射关系表", notes = "新增表名称映射关系表")
    @PostMapping("/add")
    public ResponseResult add(@RequestBody TableMappiing entity) {
        targetService.save(entity);
        return ResponseResult.ok();
    }

    /**
     * 更新数据
     * @return
     */
    @ApiOperation(value = "编辑表名称映射关系表", notes = "编辑表名称映射关系表")
    @PostMapping("/update")
    public ResponseResult update(@RequestBody TableMappiing entity) {
        targetService.updateById(entity);
        return ResponseResult.ok();
    }

    /**
    * 删除数据
    * @return
    */
    @ApiOperation(value = "移除表名称映射关系表", notes = "移除表名称映射关系表")
    @DeleteMapping("/remove")
    public ResponseResult remove(@RequestParam(value = "id") String id) {
        targetService.removeById(id);
        return ResponseResult.ok();
    }

    /**
    * 批量删除数据
    * @return
    */
    @ApiOperation(value = "批量移除表名称映射关系表", notes = "批量移除表名称映射关系表 多个参数用,号隔开")
    @PostMapping("/batch/remove")
    public ResponseResult batchRemove(@RequestParam(value = "ids") String ids) {
        targetService.removeByIds(Arrays.asList(ids.split(",")));
        return ResponseResult.ok();
    }
}
