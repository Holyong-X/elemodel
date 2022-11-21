package com.holyong.elemodel.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.Data;


/**
 * @Package: com.holyong.elemodel.entity
 * @Author holyong
 * @CreateDate 2022-11-16
 * @describe 河道实体类
 */
@Data
@TableName("river")
@ApiModel(value="River对象", description="河道")
public class River extends Model<River> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "river_id", type = IdType.ASSIGN_ID)
    private String riverId;

    private String smid;

    private String riverName;

    private String riverLength;

    private String waterLever;

    private String flow;

    private String direction;

    private String respons;

    private String phone;

    private String post;


}