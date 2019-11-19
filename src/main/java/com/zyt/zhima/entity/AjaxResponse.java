package com.zyt.zhima.entity;

public class AjaxResponse {

    // 是否成功
    private Boolean success = true;

    // 返回信息
    private String message = "";

    // 错误代码
    private int errCode;

    // 需要返回的数据
    private Object data;

    public AjaxResponse() {

    }

    public AjaxResponse(Boolean success, String message, int errCode, Object data) {
        this.success = success;
        this.message = message;
        this.errCode = errCode;
        this.data = data;
    }

    public AjaxResponse(Boolean success, Object data) {
        this.success = success;
        this.message = message;
        this.errCode = errCode;
        this.data = data;
    }

    public AjaxResponse(Boolean success, String message) {
        this.success = success;
        this.message = message;
        this.errCode = errCode;
        this.data = data;
    }

    public AjaxResponse(Boolean success, String message, int errCode) {
        this.success = success;
        this.message = message;
        this.errCode = errCode;
        this.data = data;
    }


    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
