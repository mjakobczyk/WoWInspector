package com.mjakobczyk.wowinspector.achievement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@Service
public class AchievementService {

    @Value("${resource.achievement.endpoint}/{achievement_id}${resource.apikey}")
    private String getAchievmentByIdResource;

    private RestTemplate restTemplate;

    public AchievementOutputDTO getAchievementByID(@PathVariable(value = "achievement_id")
                                                           int achievementID) {
        System.out.println(getAchievmentByIdResource);

        // Mock data fetched from the server
        AchievementOutputDTO achievementOutputDTO = new AchievementOutputDTO();
        achievementOutputDTO.setTitle("The Loremaster");
        return achievementOutputDTO;
//        return restTemplate.getForObject(getAchievmentByIdResource,
//                AchievementOutputDTO.class,
//                achievementID);
    }
}