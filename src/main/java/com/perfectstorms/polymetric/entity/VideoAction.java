package com.perfectstorms.polymetric.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "video_actions")
public class VideoAction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;

    @Column(name = "type_id")
    private long typeId;

    private Time time;

    private Date date;

    @Column(name = "video_id")
    private long videoId;

    @Column(name = "video_position")
    private Time videoPosition;

    @Column(name = "re_position")
    private Time rePosition;

    public VideoAction() {
    }

    public VideoAction(String username, long typeId, Time time, Date date, long videoId, Time videoPosition,
                       Time rePosition) {
        this.username = username;
        this.typeId = typeId;
        this.time = time;
        this.date = date;
        this.videoId = videoId;
        this.videoPosition = videoPosition;
        this.rePosition = rePosition;
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
}
