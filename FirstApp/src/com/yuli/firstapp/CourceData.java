package com.yuli.firstapp;

import java.util.ArrayList;
import java.util.List;

public class CourceData {

	public String courseTitle;
	public List<String> lists=new ArrayList<String>();
	public int courseImage;
	public String courseName;
	public String courseHaveNum;
	public String courseAddress;
	public String courseType;
	public String courseGrade;
	public String courseRemainingDays;
	
	/**
	 * ¹¹ÔìÆ÷
	 */
	public CourceData(){}
	public CourceData(String courseTitle, List<String> lists,
			int courseImage, String courseName, String courseHaveNum,
			String courseAddress, String courseType, String courseGrade,
			String courseRemainingDays) {
		this.courseTitle = courseTitle;
		this.lists = lists;
		this.courseImage = courseImage;
		this.courseName = courseName;
		this.courseHaveNum = courseHaveNum;
		this.courseAddress = courseAddress;
		this.courseType = courseType;
		this.courseGrade = courseGrade;
		this.courseRemainingDays = courseRemainingDays;
	}
	/**
	 * set get
	 * @return
	 */
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public List<String> getLists() {
		return lists;
	}
	public void setLists(List<String> lists) {
		this.lists = lists;
	}
	public int getCourseImage() {
		return courseImage;
	}
	public void setCourseImage(int courseImage) {
		this.courseImage = courseImage;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseHaveNum() {
		return courseHaveNum;
	}
	public void setCourseHaveNum(String courseHaveNum) {
		this.courseHaveNum = courseHaveNum;
	}
	public String getCourseAddress() {
		return courseAddress;
	}
	public void setCourseAddress(String courseAddress) {
		this.courseAddress = courseAddress;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public String getCourseGrade() {
		return courseGrade;
	}
	public void setCourseGrade(String courseGrade) {
		this.courseGrade = courseGrade;
	}
	public String getCourseRemainingDays() {
		return courseRemainingDays;
	}
	public void setCourseRemainingDays(String courseRemainingDays) {
		this.courseRemainingDays = courseRemainingDays;
	}
	
	
}
