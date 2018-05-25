package com.busbook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	public MainController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value="demo")
	public String demo() {
		return "Demo";
	}
	
}
