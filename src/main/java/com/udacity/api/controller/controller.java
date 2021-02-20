package com.udacity.api.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    private Map<String, Object> result = new HashMap<>();

    @RequestMapping("/hello")

    public Map<String, Object> hello() {
	result.put("Name", "Will");
	result.put("idade", "18");
	return result;

    }

}
