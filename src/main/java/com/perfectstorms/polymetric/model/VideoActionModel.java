package com.perfectstorms.polymetric.model;

import java.sql.Time;

public class VideoActionModel {
    private long id;
    private String username;
    private long type;
    private Time time;

    public VideoActionModel(String username, long type, Time time) {
        this.username = username;
        this.type = type;
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "VideoActionModel{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", type='" + type + '\'' +
                ", time=" + time +
                '}';
    }
}
