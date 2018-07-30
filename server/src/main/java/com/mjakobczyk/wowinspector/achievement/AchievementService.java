package com.mjakobczyk.wowinspector.achievement;

import org.springframework.beans.factory.annotation.Value;

public class AchievementService {

    @Value("${resource.achievment.endpoint}/achievment_id{resource.apikey}")
    private String getAchievmentByIdResource;

    public AchievementOutputDTO getAchievmentById(int achievmentID) {
        AchievementOutputDTO achievementOutputDTO = new AchievementOutputDTO();

        // Mock data fetched from the server
        achievementOutputDTO.setTitle("The Loremaster");
        return achievementOutputDTO;
    }
}