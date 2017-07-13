package com.controller.mapping;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

	@Value("${index.page}") 
	private String INDEX;
	
	@Value("${salutation.page}") 
	private String SALUTATION;
	
	@Value("${salutation.text}")
	private String SALUTATION_TEXT;
	
	@Value("${name}")
	private String name;
	
	@Value("${method1}")
	private String method1;
	
	@Value("${method2}")
	private String method2;
	
	@Value("${method3}")
	private String method3;
	
	@Value("${method4}")
	private String method4;
	
	@Value("${method5}")
	private String method5;
	
	@Value("${method6}")
	private String method6;
	
	@Value("${method7}")
	private String method7;
	
	@Value("${method8}")
	private String method8; 
	
	@Value("${method9}")
	private String method9;
	
	
	

	
	@RequestMapping(value={"/welcome", "/index"}, method={RequestMethod.GET, RequestMethod.POST})	
	public String salutation(Model model) {
		model.addAttribute("text", SALUTATION_TEXT);
		model.addAttribute("name", name);
		
		return SALUTATION;
	}
	
	
}
