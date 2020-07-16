package com.zhangxin.entity;

public class Video {
    private String id;
    private String title;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Video(String id, String title, String name) {
        this.id = id;
        this.title = title;
        this.name = name;
    }

    public Video() {
    }
}
