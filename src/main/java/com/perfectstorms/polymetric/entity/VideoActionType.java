package com.perfectstorms.polymetric.entity;

import javax.persistence.*;

@Entity
@Table(name = "video_action_types")
public class VideoActionType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    public VideoActionType() {
    }

    public VideoActionType(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
