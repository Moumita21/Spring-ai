
package com.course.demo.service;

import org.springframework.ai.chat.client.ChatClient;

import java.io.WriteAbortedException;
import java.util.List;
import java.util.Map;

import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.messages.SystemMessage;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.stereotype.Service;

import com.course.demo.DTO.AiResponse;

@Service
public class AiService {

    private final ChatClient chatClient;

    public AiService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }
    
    

    public String ask(String language, String code) {
//    	PromptTemplate promptTemplate=new PromptTemplate("Write a sort {language} code snippet"+" that demostrate {code}"+" Include comments explaining each step");
//    	
//    	Prompt prompt= promptTemplate.create(Map.of("language",language,
//    			"code",code));
    	
    	
		return chatClient.prompt().user(u -> u.text("write a short {language} code snippet that demostrate {code}").
				param("language",language).param("code",code)).call().content();
		
    
    	
       
    }
}
