package com.lab.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("youtubeController")
@RequestMapping("/youtube/")
public class YoutubeController {

	@GetMapping("video/list")
	public String videoList() {

		return "contents/youtube/video/videoList";
	}

	@GetMapping("video/reg")
	public String videoReg() {

		return "contents/youtube/video/videoReg";
	}

	@GetMapping("channel/list")
	public String channelList() {

		return "contents/youtube/channel/channelList";
	}
	
	@GetMapping("channel/reg")
	public String channelReg() {
		
		return "contents/youtube/channel/channelReg";
	}
	
}
