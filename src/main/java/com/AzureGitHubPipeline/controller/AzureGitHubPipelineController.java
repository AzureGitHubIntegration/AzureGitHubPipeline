package com.AzureGitHubPipeline.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureGitHubPipelineController {

    @GetMapping("api/v1/health")
    public ResponseEntity<String> health(){
        return ResponseEntity.ok().body("OK");
    }
}
