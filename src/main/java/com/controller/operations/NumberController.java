package com.controller.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NumberController {
	@Autowired
	NumberManager numberManager;

	@RequestMapping(value = "/numbers", method = RequestMethod.GET)
	public ModelAndView numberOperations() {
		NumbersVo numbers = new NumbersVo();
		numbers.setNumber1(1);
		numbers.setNumber2(2);
		numbers.setNumber3(3);
		return new ModelAndView("numberOperation", "command", numbers);
	}

	@RequestMapping(value = "/addNumber", method = RequestMethod.POST)
	public ModelAndView addNumbers(@ModelAttribute("web") NumbersVo numbersVo,
			ModelMap model) {
		ModelAndView modelAndView = new ModelAndView("numberOperation",
				"command", numbersVo);
		modelAndView.getModelMap().addAttribute(
				"summation",
				"Summation: [" + numbersVo.getNumber1() + ", "
						+ numbersVo.getNumber2() + ", "
						+ numbersVo.getNumber3() + "] = "
						+ numberManager.add(numbersVo));
		return modelAndView;
	}
}
