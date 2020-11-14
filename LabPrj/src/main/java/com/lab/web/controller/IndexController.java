package com.lab.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("indexController")
public class IndexController {

	@GetMapping("/index")
	public String index() {

		return "layouts/index";
	}

}
