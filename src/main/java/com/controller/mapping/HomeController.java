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
	public String INDEX;
	
	@Value("${salutation.page}") 
	public String SALUTATION;
	
	@Value("${salutation.text}")
	public String SALUTATION_TEXT;
	
	@Value("${name}")
	public String name;
	
	@Value("${method1}")
	public String method1;
	
	@Value("${method2}")
	public String method2;
	
	@Value("${method3}")
	public String method3;
	
	@Value("${method4}")
	public String method4;
	
	@Value("${method5}")
	public String method5;
	
	@Value("${method6}")
	public String method6;
	
	@Value("${method7}")
	public String method7;
	
	@Value("${method8}")
	public String method8; 
	
	@Value("${method9}")
	public String method9;
	

	
	@RequestMapping(value={"/welcome", "/index"}, method={RequestMethod.GET, RequestMethod.POST})	
	public String salutation(Model model) {
		model.addAttribute("text", SALUTATION_TEXT);
		model.addAttribute("name", name);
		
		return SALUTATION;
	}
	
	
}