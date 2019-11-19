package com.zyt.zhima.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_file_info")
public class SysFileInfo {
    /**
     * 主键id
     */
    @Id
    @Column(name = "file_id")
    private String fileId;

    /**
     * 文件仓库（oss仓库）
     */
    @Column(name = "file_bucket")
    private String fileBucket;

    /**
     * 文件名称
     */
    @Column(name = "file_name")
    private String fileName;

    /**
     * 文件后缀
     */
    @Column(name = "file_suffix")
    private String fileSuffix;

    /**
     * 文件大小kb
     */
    @Column(name = "file_size_kb")
    private Long fileSizeKb;

    /**
     * 文件唯一标识id
     */
    @Column(name = "final_name")
    private String finalName;

    /**
     * 存储路径
     */
    @Column(name = "file_path")
    private String filePath;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建用户
     */
    @Column(name = "create_user")
    private Long createUser;

    /**
     * 修改用户
     */
    @Column(name = "update_user")
    private Long updateUser;

    /**
     * 获取主键id
     *
     * @return file_id - 主键id
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * 设置主键id
     *
     * @param fileId 主键id
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * 获取文件仓库（oss仓库）
     *
     * @return file_bucket - 文件仓库（oss仓库）
     */
    public String getFileBucket() {
        return fileBucket;
    }

    /**
     * 设置文件仓库（oss仓库）
     *
     * @param fileBucket 文件仓库（oss仓库）
     */
    public void setFileBucket(String fileBucket) {
        this.fileBucket = fileBucket;
    }

    /**
     * 获取文件名称
     *
     * @return file_name - 文件名称
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置文件名称
     *
     * @param fileName 文件名称
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 获取文件后缀
     *
     * @return file_suffix - 文件后缀
     */
    public String getFileSuffix() {
        return fileSuffix;
    }

    /**
     * 设置文件后缀
     *
     * @param fileSuffix 文件后缀
     */
    public void setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
    }

    /**
     * 获取文件大小kb
     *
     * @return file_size_kb - 文件大小kb
     */
    public Long getFileSizeKb() {
        return fileSizeKb;
    }

    /**
     * 设置文件大小kb
     *
     * @param fileSizeKb 文件大小kb
     */
    public void setFileSizeKb(Long fileSizeKb) {
        this.fileSizeKb = fileSizeKb;
    }

    /**
     * 获取文件唯一标识id
     *
     * @return final_name - 文件唯一标识id
     */
    public String getFinalName() {
        return finalName;
    }

    /**
     * 设置文件唯一标识id
     *
     * @param finalName 文件唯一标识id
     */
    public void setFinalName(String finalName) {
        this.finalName = finalName;
    }

    /**
     * 获取存储路径
     *
     * @return file_path - 存储路径
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * 设置存储路径
     *
     * @param filePath 存储路径
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
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
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建用户
     *
     * @return create_user - 创建用户
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建用户
     *
     * @param createUser 创建用户
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取修改用户
     *
     * @return update_user - 修改用户
     */
    public Long getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置修改用户
     *
     * @param updateUser 修改用户
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }
}