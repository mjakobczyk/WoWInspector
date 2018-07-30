package com.mjakobczyk.wowinspector.achievement;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AchievementOutputDTO {

    @JsonProperty("title")
    private String title;

    public AchievementOutputDTO(String title) {
        this.title = title;
    }

    public AchievementOutputDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
