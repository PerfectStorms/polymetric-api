package com.perfectstorms.polymetric.entity;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "video_actions")
public class VideoAction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;

    private long type;

    private Time time;

    public VideoAction() {
    }

    public VideoAction(String username, long type, Time time) {
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
}
