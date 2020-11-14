package com.lab.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("stockController")
@RequestMapping("/stock/")
public class StockController {

	@GetMapping("list")
	public String index() {

		return "contents/stock/list";
	}

}
