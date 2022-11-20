package com.lin.kumedia.web.pojo;

/**
 * 电影列表
 * 
 * @author zhen.lin
 * @date 2022年10月27日
 */
public class MediaProfile {

    private Long id;
    /**
     * 标题
     */
    private String title;
    /**
     * 年份
     */
    private Integer age;
    /**
     * 路径
     */
    private String path;
    /**
     * 评份
     */
    private Double rating;
    /**
     * 缩略图
     */
    private String thumb;
    /**
     * 简介
     */
    private String profile;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

}
