package com.lin.kumedia.sql.entity.media;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lin.kumedia.sql.entity.common.BaseEntity;

/**
 * 电影资源表 实体类
 * @see https://baomidou.com/pages/223848/#tablename
 * @author zhen.lin
 * @date 2022年6月16日
 */
@TableName(value = "media_list", autoResultMap = true)
public class MediaList extends BaseEntity {

    /**
     * 电影名称
     */
    private String title;
    /**
     * 媒体ID
     */
    private String mediaId;
    /**
     * 年份
     */
    private Integer age;
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
    /**
     * 缩画
     */
    private String poster;
    /**
     * 演员
     */
    private String performer;
    /**
     * 故事
     */
    private String story;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }
    
    
}
