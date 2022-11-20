package com.lin.kumedia.web.pojo;

public class TangProfile {

    private Long id;
    /**
     * 名称
     */
    private String title;
    /**
     * 作者
     */
    private String writer;
    /**
     * 路径
     */
    private String path;

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

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
