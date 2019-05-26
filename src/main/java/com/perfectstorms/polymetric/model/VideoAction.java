package com.perfectstorms.polymetric.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;
import java.sql.Time;

public class VideoAction {

    private long id;
    private String username;

    @JsonProperty(value = "type_id")
    private long typeId;
    private Time time;
    private Date date;

    @JsonProperty(value = "video_id")
    private long videoId;

    @JsonProperty(value = "video_position")
    private Time videoPosition;

    @JsonProperty(value = "re_position")
    private Time rePosition;

    public VideoAction(long id, String username, long typeId, Time time, Date date) {
        this.id = id;
        this.username = username;
        this.typeId = typeId;
        this.time = time;
        this.date = date;
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

    public long getTypeId() {
        return typeId;
    }

    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getVideoId() {
        return videoId;
    }

    public void setVideoId(long videoId) {
        this.videoId = videoId;
    }

    public Time getVideoPosition() {
        return videoPosition;
    }

    public void setVideoPosition(Time videoPosition) {
        this.videoPosition = videoPosition;
    }

    public Time getRePosition() {
        return rePosition;
    }

    public void setRePosition(Time rePosition) {
        this.rePosition = rePosition;
    }

    @Override
    public String toString() {
        return "VideoAction{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", typeId=" + typeId +
                ", time=" + time +
                ", date=" + date +
                ", videoId=" + videoId +
                ", videoPosition=" + videoPosition +
                ", rePosition=" + rePosition +
                '}';
    }
}
