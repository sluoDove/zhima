package com.zyt.zhima.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "good")
public class Good {
    @Id
    private Long id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品简介
     */
    private String description;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 库存
     */
    private Integer inventory;

    /**
     * 状态 1展示 0隐藏
     */
    private String state;

    /**
     * 图片
     */
    private String img;

    /**
     * 服务费介绍
     */
    @Column(name = "service_desc")
    private String serviceDesc;

    @Column(name = "create_by")
    private Long createBy;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_by")
    private Long updateBy;

    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 月租起价格
     */
    @Column(name = "month_rent")
    private BigDecimal monthRent;

    /**
     * 租期
     */
    @Column(name = "day_rent")
    private Integer dayRent;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取商品名称
     *
     * @return name - 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取商品简介
     *
     * @return description - 商品简介
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置商品简介
     *
     * @param description 商品简介
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取库存
     *
     * @return inventory - 库存
     */
    public Integer getInventory() {
        return inventory;
    }

    /**
     * 设置库存
     *
     * @param inventory 库存
     */
    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    /**
     * 获取状态 1展示 0隐藏
     *
     * @return state - 状态 1展示 0隐藏
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态 1展示 0隐藏
     *
     * @param state 状态 1展示 0隐藏
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取图片
     *
     * @return img - 图片
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置图片
     *
     * @param img 图片
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 获取服务费介绍
     *
     * @return service_desc - 服务费介绍
     */
    public String getServiceDesc() {
        return serviceDesc;
    }

    /**
     * 设置服务费介绍
     *
     * @param serviceDesc 服务费介绍
     */
    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
    }

    /**
     * @return create_by
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return update_by
     */
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * @param updateBy
     */
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * @return update_date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取月租起价格
     *
     * @return month_rent - 月租起价格
     */
    public BigDecimal getMonthRent() {
        return monthRent;
    }

    /**
     * 设置月租起价格
     *
     * @param monthRent 月租起价格
     */
    public void setMonthRent(BigDecimal monthRent) {
        this.monthRent = monthRent;
    }

    /**
     * 获取租期
     *
     * @return day_rent - 租期
     */
    public Integer getDayRent() {
        return dayRent;
    }

    /**
     * 设置租期
     *
     * @param dayRent 租期
     */
    public void setDayRent(Integer dayRent) {
        this.dayRent = dayRent;
    }
}