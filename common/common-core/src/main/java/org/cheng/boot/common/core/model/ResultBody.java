package org.cheng.boot.common.core.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "响应结果")
public class ResultBody<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
     * 响应编码
     */
    @ApiModelProperty(value = "响应编码:0-请求处理成功")
    private int code = 0;
    /**
     * 提示消息
     */
    @ApiModelProperty(value = "提示消息")
    private String message;

    /**
     * 响应数据
     */
    @ApiModelProperty(value = "响应数据")
    private T data;

	public int getCode() {
		return code;
	}

	public ResultBody<T> setCode(int code) {
		this.code = code;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public ResultBody<T> setData(T data) {
		this.data = data;
		return this;
	}
	
	public static <T> ResultBody<T> success(T data) {
        return new ResultBody<T>().setData(data).setCode(200);
    }
}
