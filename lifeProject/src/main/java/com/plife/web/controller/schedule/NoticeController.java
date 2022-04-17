package com.plife.web.controller.schedule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.plife.web.entity.NoticeView;
import com.plife.web.service.NoticeService;

@Controller
@RequestMapping("/schedule/")
public class NoticeController {

	@Autowired
	private NoticeService service;
	
	
	@RequestMapping("list")
	public String list(Model model) {
	
		int page = 1;
		String field = "title";
		String query = "";
		boolean pub = true;
		
		//List<NoticeView> list = service.getViewList(page, field, query, pub);
		
		//model.addAttribute("list",list);
		
		return "schedule.list"; // TilesViewResolver
	}
	
	
	/*
	@RequestMapping("detail")
	public String detail() {
	
		return "schedule.detail";
	}
	*/
	
	/*
	@RequestMapping("reg")
	public String reg() {
		
		return "schedule.reg";
	}
	*/
}

