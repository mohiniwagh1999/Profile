package com.profile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MsgController {
     @Value("${msg}")
	public String msg;
	
	@GetMapping("/")
	@ResponseBody
	public String getMsg()
	{
		return msg;
	}
}
