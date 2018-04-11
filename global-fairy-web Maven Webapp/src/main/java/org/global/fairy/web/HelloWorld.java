package org.global.fairy.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.global.fairy.api.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/helloWorld")
public class HelloWorld {
	private static final Logger logger = LogManager.getLogger();
	
	@Autowired
	private UserApi userApi;
	
	@RequestMapping(value = "/sayHello" , method= RequestMethod.GET)
	@ResponseBody()
	public String sayHello(){
		logger.info("PRINT A MARK IN THE METHOD");
		userApi.sayHello("ddd");
		return "HelloWorld";
	}
	
	@RequestMapping(value = "/registor" , method= RequestMethod.POST)
	@ResponseBody()
	public String registor(){
		logger.info("PRINT A MARK IN THE METHOD");
		userApi.sayHello("aaa");
		return "HelloWorld";
	}
}
