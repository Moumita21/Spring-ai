
package com.course.demo.controller;

import com.course.demo.DTO.AiRequest;
import com.course.demo.service.AiService;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiController {

    private final AiService aiService;
    

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/ask")
    public String ask(@RequestParam AiRequest request) {

        return aiService.ask(request.getLanguage(),request.getCode());
    }
}
