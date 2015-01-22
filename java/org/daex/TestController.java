package org.daex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/test")
	public String test(){
		return "view";
	}
	@RequestMapping({"/index","/"})
	public String welcome(){
		return "welcome";
	}
	
}
