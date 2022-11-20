package com.lin.kumedia.sql.entity.media;

import java.util.List;

/**
 * 媒体信息
 * @author zhen.lin
 * @date 2022年10月31日
 */
public class MediaInfoMap {

    private Long id;
    
    private String title;
    
    private String performer;
    
    private String poster;
    
    private List<MediaEposodeMap> episodes;
    
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

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public List<MediaEposodeMap> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<MediaEposodeMap> episodes) {
        this.episodes = episodes;
    }

}
