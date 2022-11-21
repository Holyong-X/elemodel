package com.holyong.elemodel.utils;

import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;


/**
 * 统一返回结果的类
 * 公共的返回值对象
 */

public class ResponseResult {

    @ApiModelProperty(value = "是否成功")
    private Boolean success;

    @ApiModelProperty(value = "返回码")
    private Integer code;

    @ApiModelProperty(value = "返回消息")
    private String message;

    @ApiModelProperty(value = "返回数据")
    private Map<String, Object> data = new HashMap<String, Object>();

//    @ApiModelProperty(value = "返回数据")
//    private String datas;


    //把构造方法私有
    private ResponseResult() {
    }

    //成功静态方法
    public static ResponseResult ok() {
        ResponseResult r = new ResponseResult();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMessage("成功");
        return r;
    }

    //失败静态方法
    public static ResponseResult error() {
        ResponseResult r = new ResponseResult();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMessage("失败");
        return r;
    }

    public ResponseResult success(Boolean success) {
        this.setSuccess(success);
        return this;
    }

    public ResponseResult message(String message) {
        this.setMessage(message);
        return this;
    }

    public ResponseResult code(Integer code) {
        this.setCode(code);
        return this;
    }

    public ResponseResult data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public ResponseResult data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

//    public String getDatas() {
//        return datas;
//    }
//
//    public void setDatas(String datas) {
//        this.datas = datas;
//    }
}
