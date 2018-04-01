package com.controller.test;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@Resource(name = "messages")
	private Map<String, String> messages;

	@RequestMapping(value = { "/m0", "/m1", "/m2" })
	@ResponseBody
	public String method0() {
		System.out.println(messages.get("method0"));
		return "method0";
	}

	@RequestMapping(value = "/messages/{messageId}", method = RequestMethod.GET)
	@ResponseBody
	public String getMessage(@PathVariable("messageId") String messageId) {
		return messages.get(messageId);
	}

	@RequestMapping(value = "*", method = { RequestMethod.GET,
			RequestMethod.POST })
	@ResponseBody
	public String fallbackMessage() {
		return "Invalid Request";
	}

	@RequestMapping(value = "/ex/greetings", method = RequestMethod.GET)
	@ResponseBody
	public String getGreetingsBySimplePath() {
		return "Get Greetings";
	}

	@RequestMapping(value = "/ex/greetings", method = RequestMethod.POST)
	@ResponseBody
	public String postGreetings() {
		return "Post Greetings";
	}

	@RequestMapping(value = "/ex/greetings", headers = "key=val", method = RequestMethod.GET)
	@ResponseBody
	public String getGreetingsWithHeader() {
		return "Get Greetings with some header";
	}

	@RequestMapping(value = "/ex/greetings", headers = { "key1=val1",
			"key2=val2" }, method = RequestMethod.GET)
	@ResponseBody
	public String getGreetingsWithMultipleHeader() {
		return "Get Greetings with multiple header";
	}

	/*
	 * @RequestMapping(value="/ex/greetings", headers="Accept=application/json",
	 * method=RequestMethod.GET)
	 * 
	 * @ResponseBody public String getGreetingsAsJsonFromBrowser() { return
	 * "Get Greetings with header from browser accepts"; }
	 */

	@RequestMapping(value = "/ex/greetings", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String getGreetingsAsJsonFromREST() {
		return "Get Greetings with header from REST";
	}

	@RequestMapping(value = "/ex/greetings/{greetingsId}/locations/{locationId}", method = RequestMethod.GET)
	@ResponseBody
	public String getGreetingsBySimplePathVariable(
			@PathVariable String greetingsId, @PathVariable String locationId) {
		return "Get Greetings with id=" + greetingsId + " and location="
				+ locationId;
	}

	@RequestMapping(value = "/ex/location", method = RequestMethod.GET)
	@ResponseBody
	public String getLocationBySimplePathWithRequestParam(
			@RequestParam("id") String id) {
		return "Get specific location with id = " + id;
	}

	@RequestMapping(value = "/ex/location", params = "id", method = RequestMethod.GET)
	@ResponseBody
	public String getLocationBySimplePathWithExplicitRequestParam(
			@RequestParam("id") String id, @RequestParam("name") String name) {
		return "Get specific location params with id = " + id +  " name = " + name;
	}

	@RequestMapping(value = "/ex/location", params = { "id", "name" }, method = RequestMethod.POST)
	@ResponseBody
	public String getLocationBySimplePathWithExplicitMultipleRequestParam(
			@RequestParam("id") String id, @RequestParam("name") String name) {
		return "Get specific location with multiple params with id = " + id + " name = " + name;
	}
}