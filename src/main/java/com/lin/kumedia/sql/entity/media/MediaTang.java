package com.lin.kumedia.sql.entity.media;

import java.util.List;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.lin.kumedia.sql.entity.common.BaseEntity;

/**
 * 唐诗表 实体类
 * 
 * @see https://baomidou.com/pages/223848/#tablename
 * @author zhen.lin
 * @date 2022年6月16日
 */
@TableName(value = "media_tang", autoResultMap = true)
public class MediaTang extends BaseEntity {

    public static class TangRowItem {
        /**
         * 拼音列表
         */
        private List<String> pinyi;
        /**
         * 文本
         */
        private String text;
        /**
         * 换行
         */
        private Integer br;
        /**
         * 时间1
         */
        private List<Double> one;
        /**
         * 时间2
         */
        private List<Double> two;

        public List<String> getPinyi() {
            return pinyi;
        }

        public void setPinyi(List<String> pinyi) {
            this.pinyi = pinyi;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public Integer getBr() {
            return br;
        }

        public void setBr(Integer br) {
            this.br = br;
        }

        public List<Double> getOne() {
            return one;
        }

        public void setOne(List<Double> one) {
            this.one = one;
        }

        public List<Double> getTwo() {
            return two;
        }

        public void setTwo(List<Double> two) {
            this.two = two;
        }
        
    }

    /**
     * 名称
     */
    private String title;
    /**
     * 媒体ID
     */
    private String tangId;
    /**
     * 作者
     */
    private String writers;
    /**
     * 音频
     */
    private String audio;
    /**
     * 视频
     */
    private String video;
    /**
     * 内容json
     */
    @TableField(typeHandler = JacksonTypeHandler.class)
    private List<TangRowItem> rows;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTangId() {
        return tangId;
    }

    public void setTangId(String tangId) {
        this.tangId = tangId;
    }

    public String getWriters() {
        return writers;
    }

    public void setWriters(String writers) {
        this.writers = writers;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public List<TangRowItem> getRows() {
        return rows;
    }

    public void setRows(List<TangRowItem> rows) {
        this.rows = rows;
    }
    
    
}
