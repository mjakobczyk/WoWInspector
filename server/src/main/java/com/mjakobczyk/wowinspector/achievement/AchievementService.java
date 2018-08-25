package com.mjakobczyk.wowinspector.achievement;

import com.mjakobczyk.wowinspector.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@Service
public class AchievementService {

    @Value("${resource.achievement.endpoint}/{achievement_id}${resource.apikey}")
    private String getAchievementByIdResource;

    @Autowired
    private RestTemplate restTemplate;

    public AchievementOutputDTO getAchievementByID(int ID) throws ResourceNotFoundException {
        return restTemplate.getForObject(getAchievementByIdResource, AchievementOutputDTO.class, ID);
    }
}