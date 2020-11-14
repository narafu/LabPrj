package com.lab.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lab.web.service.ProdService;
import com.lab.web.vo.Code;
import com.lab.web.vo.ProductVO;

@Controller("prodController")
@RequestMapping("/prod/")
public class ProdController {

	@Autowired
	private ProdService prodService;

	
	@GetMapping("list")
	public String prodList(Model model) {
		
		List<Code> prodMenu = prodService.selectProdMenu();
		model.addAttribute("prodMenu", prodMenu);
		
		List<ProductVO> prodList = prodService.selectProdList();
		model.addAttribute("prodList", prodList);
		
		List<ProductVO> rankingList = prodService.selectRankingList();
		model.addAttribute("rankingList", rankingList);

		return "contents/prod/prodList";
	}

}
