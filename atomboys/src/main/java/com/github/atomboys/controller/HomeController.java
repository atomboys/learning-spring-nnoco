package com.github.atomboys.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceView;

@Controller
public class HomeController {
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	@RequestMapping("/home")
	// String -> 뷰 이름 (ftl 파일 이름)
	// ModelAndView -> 뷰와 데이터를 포함한 객체
	public ModelAndView home() {
		log.info(">>>> home");
		return new ModelAndView("home")
				.addObject("name", "이준영");
	}
}
