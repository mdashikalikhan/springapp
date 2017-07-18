package com.controller.test;

import java.util.Map;

import javax.annotation.Resource;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@Resource(name="messages")
	private Map<String, String> messages;
	
	@RequestMapping(value={"/m0", "/m1", "m2"})
	@ResponseBody
	public String method0() {
		System.out.println(messages.get("method0"));
		return "method0";
	}
	
	@RequestMapping(value="/{messageId}", method=RequestMethod.GET)
	@ResponseBody
	public String getMessage(@PathVariable("messageId") String messageId)
	{
		return messages.get(messageId);
	}
}
