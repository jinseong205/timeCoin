package com.jinseong.timeCoin.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
	@GetMapping("/api/main/hello")
	public String hello(){
	
		JSONObject content = new JSONObject();
		content.put("content", "안녕하세요");
	
		return content.toString();
	}
}
