package kr.byweb.tm.user.anlysStd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.byweb.tm.user.anlysStd.model.AnlysStd;
import kr.byweb.tm.user.anlysStd.service.AnlysStdService;

@Controller
public class AnlysStdController {
	
	@Autowired
	AnlysStdService anlysStdService;
	
	@RequestMapping("/")
	public String getAnlysStdList(Model model) {
		model.addAttribute("name", "홍길동");
		return "anlysStd/anlysStdList";
	}
	
	@RequestMapping("/selectTime")
	public @ResponseBody String selectTime() {
		
		String strTime = "";
		try {
			strTime = anlysStdService.selectTime();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strTime;
	}
	
	/*
	@RequestMapping("/getAnlysStdList")
	public AnlysStd getAnlysStdList() {
		return anlysStdService.getAnlysStdList();
	}*/
}
