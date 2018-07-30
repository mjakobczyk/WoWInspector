package com.mjakobczyk.wowinspector.achievement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AchievementController {

    @Autowired
    AchievementService achievementService;

    @GetMapping("/achievement/{achievement_id}")
    public ResponseEntity<AchievementOutputDTO> getAchievmentById(@PathVariable(value = "achievment_id") int achievementID) {
        return ResponseEntity.status(HttpStatus.OK).body(achievementService.getAchievmentById(achievementID));
    }

}
