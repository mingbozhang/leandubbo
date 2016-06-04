package com.bob.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bob.api.TestService;

@Controller
public class TestController {

	@Reference(version = "1.0.0")
	TestService testService;

	public void setTestService(TestService testService) {
		this.testService = testService;
	}

	@RequestMapping(path = "/getMessage", method = RequestMethod.GET)
	@ResponseBody
	public String getMessage() {
		return "This message is from dubbo interface>>" + testService.getMessage("abc");
	}
}
