package com.mvc.service;

import java.util.ArrayList;
import java.util.List;

import com.mvc.model.Community;
import com.mvc.model.Country;
import com.mvc.model.StudentModel;

public class StudentServiceImpl implements StudentService {

	@Override
	public void add(StudentModel student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Country> getAllCountries() {
		List<Country> countyList = new ArrayList<Country>();
		countyList.add(new Country(1, "Bangladesh"));
		countyList.add(new Country(2, "USA"));
		countyList.add(new Country(3, "UK"));
		return countyList;
	}

	@Override
	public List<Community> getAllCommunities() {
		List<Community> communityList = new ArrayList<Community>();
		communityList.add(new Community("1", "Java"));
		communityList.add(new Community("2", "Struts 2"));
		communityList.add(new Community("3", "JSF 2"));
		communityList.add(new Community("4", "Spring 2"));
		communityList.add(new Community("5", "Spring 3"));
		communityList.add(new Community("5", "Spring 4"));
		return null;
	}

}
