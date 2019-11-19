package com.zyt.zhima.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_config")
public class SysConfig {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 属性编码标识
     */
    private String code;

    /**
     * 是否是字典中的值
     */
    @Column(name = "dict_flag")
    private String dictFlag;

    /**
     * 字典类型的编码
     */
    @Column(name = "dict_type_id")
    private Long dictTypeId;

    /**
     * 属性值，如果是字典中的类型，则为dict的code
     */
    private String value;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private Long createUser;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新人
     */
    @Column(name = "update_user")
    private Long updateUser;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取属性编码标识
     *
     * @return code - 属性编码标识
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置属性编码标识
     *
     * @param code 属性编码标识
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取是否是字典中的值
     *
     * @return dict_flag - 是否是字典中的值
     */
    public String getDictFlag() {
        return dictFlag;
    }

    /**
     * 设置是否是字典中的值
     *
     * @param dictFlag 是否是字典中的值
     */
    public void setDictFlag(String dictFlag) {
        this.dictFlag = dictFlag;
    }

    /**
     * 获取字典类型的编码
     *
     * @return dict_type_id - 字典类型的编码
     */
    public Long getDictTypeId() {
        return dictTypeId;
    }

    /**
     * 设置字典类型的编码
     *
     * @param dictTypeId 字典类型的编码
     */
    public void setDictTypeId(Long dictTypeId) {
        this.dictTypeId = dictTypeId;
    }

    /**
     * 获取属性值，如果是字典中的类型，则为dict的code
     *
     * @return value - 属性值，如果是字典中的类型，则为dict的code
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置属性值，如果是字典中的类型，则为dict的code
     *
     * @param value 属性值，如果是字典中的类型，则为dict的code
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取更新人
     *
     * @return update_user - 更新人
     */
    public Long getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置更新人
     *
     * @param updateUser 更新人
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }
}