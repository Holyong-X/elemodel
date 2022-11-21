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
 * @describe 实体类
 */
@Data
@TableName("house")
@ApiModel(value="House对象", description="")
public class House extends Model<House> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "house_id", type = IdType.ASSIGN_ID)
    private String houseId;

    private String smid;

    private String mumber;

    private String owner;

    private String certificateNumber;

    private String type;

    private String rooms;

    private String time;

    private String floors;


}