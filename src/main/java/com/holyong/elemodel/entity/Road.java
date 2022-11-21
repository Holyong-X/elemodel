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
@TableName("road")
@ApiModel(value="Road对象", description="")
public class Road extends Model<Road> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "road_id", type = IdType.ASSIGN_ID)
    private String roadId;

    private String smid;

    private String roadName;

    private String roadCode;

    private String roadLength;

    private String roadLevel;

    private String time;

    private String respons;

    private String phone;

    private String post;


}