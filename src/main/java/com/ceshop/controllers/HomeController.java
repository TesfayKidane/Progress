package com.ceshop.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ceshop.service.ProgressService;
import com.ceshop.serviceimpl.ProgressServiceImpl;

@Controller
public class HomeController {
 
	ProgressService pService = new ProgressServiceImpl();
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String Hello(Model model) {
		model.addAttribute("home", "welcome");
		return "Home";
	}
	
	@RequestMapping(value="/progress",method=RequestMethod.GET)
	public @ResponseBody String home(@RequestParam("userId") String userId, @RequestParam("testId") String testId, Model model){
		if(userId == null || userId.isEmpty() || testId == null || testId.isEmpty())
			return "argument error";
		return pService.getProgressByUserIdTestId(Integer.parseInt(userId), Integer.parseInt(testId)).toString();
	}
	
	@RequestMapping(value="/progress",method=RequestMethod.POST)
	public @ResponseBody String homePost(@RequestParam("userId") String userId, @RequestParam("testId") String testId, Model model){
		if(userId == null || userId.isEmpty() || testId == null || testId.isEmpty())
			return "argument error";
		return pService.getProgressByUserIdTestId(Integer.parseInt(userId), Integer.parseInt(testId)).toString();
	}
}
