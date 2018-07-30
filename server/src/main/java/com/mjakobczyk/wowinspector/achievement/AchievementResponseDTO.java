package com.mjakobczyk.wowinspector.achievement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AchievementResponseDTO {

    @JsonProperty("title")
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
