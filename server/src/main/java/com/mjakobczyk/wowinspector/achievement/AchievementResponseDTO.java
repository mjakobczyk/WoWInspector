package com.mjakobczyk.wowinspector.achievement;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AchievementResponseDTO {

    private String title;

    public AchievementResponseDTO(String title) {
        this.title = title;
    }

    public AchievementResponseDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
