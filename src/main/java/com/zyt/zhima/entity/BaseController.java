package com.zyt.zhima.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseController {
    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * @param data
     * @return
     */
    public AjaxResponse responseSuccess(Object data) {
        return new AjaxResponse(true, data);
    }

    /**
     * @param data
     * @return
     */
    public AjaxResponse responseSuccess(Object data, Integer errCode, String message) {
        return new AjaxResponse(true, message, errCode, data);
    }


    /**
     * @param message
     * @return
     */
    public AjaxResponse responseFail(String message) {
        return new AjaxResponse(false, message);
    }

    /**
     * @param message
     * @return
     */
    public AjaxResponse responseFail(Object data, Integer errCode, String message) {
        return new AjaxResponse(false, message, errCode, data);
    }

}