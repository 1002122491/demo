package com.example.demo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;


/**
 * 
 * @author 
 * @date 2022-09-30
 */
public class CategoryDTO {
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
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public Integer getSubjectCount() {
        return subjectCount;
    }
    public void setSubjectCount(Integer subjectCount) {
        this.subjectCount = subjectCount;
    }
    public Integer getIsEnable() {
        return isEnable;
    }
    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public LocalDateTime getModifiedTime() {
        return modifiedTime;
    }
    public void setModifiedTime(LocalDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
    public Integer getIsDeleted() {
        return isDeleted;
    }
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
    public CategoryDTO(){
        this.isEnable = 0;
        this.isDeleted = 0;
    }
    public  CategoryDTO convert(Category category){
        CategoryDTO categoryDTO = new CategoryDTO();
        BeanUtils.copyProperties(category, categoryDTO);
        return categoryDTO;
    }

}

