package com.zyt.zhima.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "order_line")
public class OrderLine {
    /**
     * 订单编号
     */
    @Id
    @Column(name = "order_id")
    private String orderId;

    /**
     * 销售人员
     */
    @Column(name = "order_user")
    private Long orderUser;

    /**
     * 下单人员
     */
    private String customer;

    /**
     * 已收金额
     */
    @Column(name = "rec_amount")
    private BigDecimal recAmount;

    /**
     * 订单状态
     */
    @Column(name = "order_state")
    private String orderState;

    /**
     * 物流单号
     */
    @Column(name = "logistics_id")
    private String logisticsId;

    /**
     * 物流公司
     */
    @Column(name = "logistics_compony")
    private String logisticsCompony;

    /**
     * 收货人
     */
    @Column(name = "receive_user")
    private String receiveUser;

    /**
     * 收货手机
     */
    @Column(name = "receive_phone")
    private String receivePhone;

    /**
     * 收货地址
     */
    @Column(name = "receive_address")
    private String receiveAddress;

    /**
     * 商品id
     */
    @Column(name = "good_id")
    private Long goodId;

    /**
     * 数量
     */
    @Column(name = "order_num")
    private Integer orderNum;

    /**
     * 押金
     */
    private BigDecimal deposit;

    /**
     * 是否信用免押
     */
    @Column(name = "deposit_free")
    private String depositFree;

    /**
     * 扣款状态
     */
    @Column(name = "charge_state")
    private String chargeState;

    /**
     * 扣款金额
     */
    @Column(name = "charge_amount")
    private BigDecimal chargeAmount;

    /**
     * 扣款时间
     */
    @Column(name = "charge_date")
    private Date chargeDate;

    /**
     * 返还状态
     */
    @Column(name = "return_state")
    private String returnState;

    /**
     * 返还时间
     */
    @Column(name = "return_date")
    private Date returnDate;

    /**
     * 冻结时间
     */
    @Column(name = "freeze_date")
    private Date freezeDate;

    /**
     * 服务状态
     */
    @Column(name = "service_state")
    private String serviceState;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "create_by")
    private Long createBy;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "update_by")
    private Long updateBy;

    /**
     * 获取订单编号
     *
     * @return order_id - 订单编号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单编号
     *
     * @param orderId 订单编号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取销售人员
     *
     * @return order_user - 销售人员
     */
    public Long getOrderUser() {
        return orderUser;
    }

    /**
     * 设置销售人员
     *
     * @param orderUser 销售人员
     */
    public void setOrderUser(Long orderUser) {
        this.orderUser = orderUser;
    }

    /**
     * 获取下单人员
     *
     * @return customer - 下单人员
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * 设置下单人员
     *
     * @param customer 下单人员
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * 获取已收金额
     *
     * @return rec_amount - 已收金额
     */
    public BigDecimal getRecAmount() {
        return recAmount;
    }

    /**
     * 设置已收金额
     *
     * @param recAmount 已收金额
     */
    public void setRecAmount(BigDecimal recAmount) {
        this.recAmount = recAmount;
    }

    /**
     * 获取订单状态
     *
     * @return order_state - 订单状态
     */
    public String getOrderState() {
        return orderState;
    }

    /**
     * 设置订单状态
     *
     * @param orderState 订单状态
     */
    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    /**
     * 获取物流单号
     *
     * @return logistics_id - 物流单号
     */
    public String getLogisticsId() {
        return logisticsId;
    }

    /**
     * 设置物流单号
     *
     * @param logisticsId 物流单号
     */
    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    /**
     * 获取物流公司
     *
     * @return logistics_compony - 物流公司
     */
    public String getLogisticsCompony() {
        return logisticsCompony;
    }

    /**
     * 设置物流公司
     *
     * @param logisticsCompony 物流公司
     */
    public void setLogisticsCompony(String logisticsCompony) {
        this.logisticsCompony = logisticsCompony;
    }

    /**
     * 获取收货人
     *
     * @return receive_user - 收货人
     */
    public String getReceiveUser() {
        return receiveUser;
    }

    /**
     * 设置收货人
     *
     * @param receiveUser 收货人
     */
    public void setReceiveUser(String receiveUser) {
        this.receiveUser = receiveUser;
    }

    /**
     * 获取收货手机
     *
     * @return receive_phone - 收货手机
     */
    public String getReceivePhone() {
        return receivePhone;
    }

    /**
     * 设置收货手机
     *
     * @param receivePhone 收货手机
     */
    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone;
    }

    /**
     * 获取收货地址
     *
     * @return receive_address - 收货地址
     */
    public String getReceiveAddress() {
        return receiveAddress;
    }

    /**
     * 设置收货地址
     *
     * @param receiveAddress 收货地址
     */
    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    /**
     * 获取商品id
     *
     * @return good_id - 商品id
     */
    public Long getGoodId() {
        return goodId;
    }

    /**
     * 设置商品id
     *
     * @param goodId 商品id
     */
    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    /**
     * 获取数量
     *
     * @return order_num - 数量
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * 设置数量
     *
     * @param orderNum 数量
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 获取押金
     *
     * @return deposit - 押金
     */
    public BigDecimal getDeposit() {
        return deposit;
    }

    /**
     * 设置押金
     *
     * @param deposit 押金
     */
    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    /**
     * 获取是否信用免押
     *
     * @return deposit_free - 是否信用免押
     */
    public String getDepositFree() {
        return depositFree;
    }

    /**
     * 设置是否信用免押
     *
     * @param depositFree 是否信用免押
     */
    public void setDepositFree(String depositFree) {
        this.depositFree = depositFree;
    }

    /**
     * 获取扣款状态
     *
     * @return charge_state - 扣款状态
     */
    public String getChargeState() {
        return chargeState;
    }

    /**
     * 设置扣款状态
     *
     * @param chargeState 扣款状态
     */
    public void setChargeState(String chargeState) {
        this.chargeState = chargeState;
    }

    /**
     * 获取扣款金额
     *
     * @return charge_amount - 扣款金额
     */
    public BigDecimal getChargeAmount() {
        return chargeAmount;
    }

    /**
     * 设置扣款金额
     *
     * @param chargeAmount 扣款金额
     */
    public void setChargeAmount(BigDecimal chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    /**
     * 获取扣款时间
     *
     * @return charge_date - 扣款时间
     */
    public Date getChargeDate() {
        return chargeDate;
    }

    /**
     * 设置扣款时间
     *
     * @param chargeDate 扣款时间
     */
    public void setChargeDate(Date chargeDate) {
        this.chargeDate = chargeDate;
    }

    /**
     * 获取返还状态
     *
     * @return return_state - 返还状态
     */
    public String getReturnState() {
        return returnState;
    }

    /**
     * 设置返还状态
     *
     * @param returnState 返还状态
     */
    public void setReturnState(String returnState) {
        this.returnState = returnState;
    }

    /**
     * 获取返还时间
     *
     * @return return_date - 返还时间
     */
    public Date getReturnDate() {
        return returnDate;
    }

    /**
     * 设置返还时间
     *
     * @param returnDate 返还时间
     */
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * 获取冻结时间
     *
     * @return freeze_date - 冻结时间
     */
    public Date getFreezeDate() {
        return freezeDate;
    }

    /**
     * 设置冻结时间
     *
     * @param freezeDate 冻结时间
     */
    public void setFreezeDate(Date freezeDate) {
        this.freezeDate = freezeDate;
    }

    /**
     * 获取服务状态
     *
     * @return service_state - 服务状态
     */
    public String getServiceState() {
        return serviceState;
    }

    /**
     * 设置服务状态
     *
     * @param serviceState 服务状态
     */
    public void setServiceState(String serviceState) {
        this.serviceState = serviceState;
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
}