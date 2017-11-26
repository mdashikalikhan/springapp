package com.controller.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.model.StudentModel;

@Controller
public class StudentController {
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public ModelAndView initializeStudent()
	{
		return new ModelAndView("studentForm", "command", new StudentModel());
	}
	
	public String addStudent()
	{
		return "result";
	}
}
