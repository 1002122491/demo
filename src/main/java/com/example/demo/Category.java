package com.example.demo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;


/**
 * 
 * @author 
 * @date 2022-09-30
 */
public class Category {
    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", link='" + link + '\'' +
                ", subjectCount=" + subjectCount +
                ", isEnable=" + isEnable +
                ", createTime=" + createTime +
                ", modifiedTime=" + modifiedTime +
                ", isDeleted=" + isDeleted +
                '}';
    }

    /**
     * 主键
     */
    private Long id;

    /**
     * 专题名称
     */
    private String title;

    /**
     * 图片地址
     */
    private String imgUrl;

    /**
     * 跳转链接
     */
    private String link;

    /**
     * 每张试卷几道题
     */
    private Integer subjectCount;

    /**
     * 启用标识，0-否，1-是
     */
    private Integer isEnable;

    /**
     * 创建时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime modifiedTime;

    /**
     * 删除标识，0-未删除，1-已删除
     */
    private Integer isDeleted;


    public Long getId() {
        return id;
    }
    public Category setId(Long id) {
        this.id = id;
        return this;
    }
    public String getTitle() {
        return title;
    }
    public Category setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public Category setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }
    public String getLink() {
        return link;
    }
    public Category setLink(String link) {
        this.link = link;
        return this;
    }
    public Integer getSubjectCount() {
        return subjectCount;
    }
    public Category setSubjectCount(Integer subjectCount) {
        this.subjectCount = subjectCount;
        return this;
    }
    public Integer getIsEnable() {
        return isEnable;
    }
    public Category setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
        return this;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }
    public Category setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }
    public LocalDateTime getModifiedTime() {
        return modifiedTime;
    }
    public Category setModifiedTime(LocalDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public Integer getIsDeleted() {
        return isDeleted;
    }
    public Category setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

}

