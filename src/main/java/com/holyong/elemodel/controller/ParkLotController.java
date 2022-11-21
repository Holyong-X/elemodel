package com.holyong.elemodel.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.holyong.elemodel.entity.ParkLot;
import com.holyong.elemodel.entity.Road;
import com.holyong.elemodel.entity.TableMappiing;
import com.holyong.elemodel.service.ParkLotService;
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
 * @description 控制器
 */
@Api(value = "", tags = "")
@RestController
@RequestMapping("park-lot")
public class ParkLotController {

    @Autowired
    private ParkLotService targetService;



    /**
    * 获取分页数据
    *
    * @return
    */
    @ApiOperation(value = "获取分页列表", notes = "获取分页列表")
    @GetMapping(value = "{page}/{limit}")
    public ResponseResult list(@ApiParam(name = "current", value = "当前页码", required = true)
            @PathVariable Long current,
                               @ApiParam(name = "limit", value = "每页记录数", required = true)
            @PathVariable Long limit,
                               @RequestBody(required = false) ParkLot entity) {
        Page<ParkLot> pageParam = new Page<>(current, limit);
        QueryWrapper<ParkLot> wrapper = new QueryWrapper<>();
        targetService.page(pageParam,wrapper);
        return ResponseResult.ok().data("items", pageParam.getRecords()).data("total", pageParam.getTotal());
    }


    /**
    * 查找所有记录数
    */
    @ApiOperation(value = "获取的所有数据")
    @GetMapping("/findAll")
    public ResponseResult findAll() {
        List<ParkLot> list = targetService.list();
        return ResponseResult.ok().data("result",list);
    }



    /**
     * 根据ID查找数据
     */
    @ApiOperation(value = "获取详情", notes = "根据ID获取详情")
    @GetMapping("/get")
    public ResponseResult get(@RequestParam("id") String id) {
        ParkLot entity = targetService.getById(id);
        return ResponseResult.ok().data("result",entity);
    }

    /**
     * 根据条件查找数据
     */
    @ApiOperation(value = "获取详情", notes = "根据条件查找数据")
    @PostMapping("/getByCondition")
    public ResponseResult getByCondition(@RequestBody ParkLot parkLot) {
        QueryWrapper<ParkLot> queryWrapper =new QueryWrapper<>();
        queryWrapper.eq("SMID",parkLot.getSmid());
        ParkLot entity = targetService.getOne(queryWrapper);
        return ResponseResult.ok().data("result",entity);
    }


    /**
     * 添加数据
     * @return
     */
    @ApiOperation(value = "新增", notes = "新增")
    @PostMapping("/add")
    public ResponseResult add(@RequestBody ParkLot entity) {
        targetService.save(entity);
        return ResponseResult.ok();
    }

    /**
     * 更新数据
     * @return
     */
    @ApiOperation(value = "编辑", notes = "编辑")
    @PostMapping("/update")
    public ResponseResult update(@RequestBody ParkLot entity) {
        targetService.updateById(entity);
        return ResponseResult.ok();
    }

    /**
    * 删除数据
    * @return
    */
    @ApiOperation(value = "移除", notes = "移除")
    @DeleteMapping("/remove")
    public ResponseResult remove(@RequestParam(value = "id") String id) {
        targetService.removeById(id);
        return ResponseResult.ok();
    }

    /**
    * 批量删除数据
    * @return
    */
    @ApiOperation(value = "批量移除", notes = "批量移除 多个参数用,号隔开")
    @PostMapping("/batch/remove")
    public ResponseResult batchRemove(@RequestParam(value = "ids") String ids) {
        targetService.removeByIds(Arrays.asList(ids.split(",")));
        return ResponseResult.ok();
    }
}
