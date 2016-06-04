package com.bob.provider;

import java.util.Date;

import com.alibaba.dubbo.config.annotation.Service;
import com.bob.api.TestService;

@Service(version="1.0.0")
public class TestServiceImpl implements TestService {

	public String getMessage(String name) {
		return "Hello!" + name + " now is " + new Date().getTime();
	}

}
