package com.mvc.model;

public class StudentModel {
	private Integer id;
	private String name;
	private Integer age;
	private String sex;
	private String semester;
	private String aboutYou;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	/**
	 * @return the aboutYou
	 */
	public String getAboutYou() {
		return aboutYou;
	}
	/**
	 * @param aboutYou the aboutYou to set
	 */
	public void setAboutYou(String aboutYou) {
		this.aboutYou = aboutYou;
	}
	
	
	
}
