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
@TableName("householder")
@ApiModel(value="Householder对象", description="")
public class Householder extends Model<Householder> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "householder_id", type = IdType.ASSIGN_ID)
    private String householderId;

    private String roomId;

    private String name;

    private String sex;

    private String age;

    private String certificateNumber;

    private String relation;


}