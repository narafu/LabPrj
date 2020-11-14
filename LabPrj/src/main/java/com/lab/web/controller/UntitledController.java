package com.lab.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("untitledController")
@RequestMapping("/untitled/")
public class UntitledController {

	@GetMapping("list")
	public String list() {

		return "contents/untitled/untitledList";
	}

}
