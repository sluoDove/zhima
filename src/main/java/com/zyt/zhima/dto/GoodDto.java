package com.zyt.zhima.dto;


import com.zyt.zhima.model.Good;

/**
 * @author ls
 * @date 2019/11/14
 * @desc
 */
public class GoodDto extends Good {

    private Long goodId;

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }
}
