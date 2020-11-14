package com.lab.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("mgtController")
@RequestMapping("/mgt/")
public class MgtController {

	@GetMapping("main/list")
	public String mgtMainList() {

		return "contents/mgt/main/mgtMainList";
	}
	
	@GetMapping("notice/list")
	public String mgtNoticeList() {

		return "contents/mgt/notice/mgtNoticeList";
	}
	
	@GetMapping("board/list")
	public String mgtBoardList() {

		return "contents/mgt/board/mgtBoardList";
	}
	
	@GetMapping("report/list")
	public String mgtReportList() {

		return "contents/mgt/report/mgtReportList";
	}

}
