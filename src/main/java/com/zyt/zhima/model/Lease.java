package com.zyt.zhima.model;

import javax.persistence.*;

@Table(name = "lease")
public class Lease {
    @Id
    private Long id;

    /**
     * 类别
     */
    private String classes;

    /**
     * 标题
     */
    private String title;

    /**
     * 序号
     */
    private Integer sort;

    /**
     * 内容
     */
    private String content;

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
     * 获取类别
     *
     * @return classes - 类别
     */
    public String getClasses() {
        return classes;
    }

    /**
     * 设置类别
     *
     * @param classes 类别
     */
    public void setClasses(String classes) {
        this.classes = classes;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取序号
     *
     * @return sort - 序号
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置序号
     *
     * @param sort 序号
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}