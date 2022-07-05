package com.webprofile.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {
	@Id
	private int id;
	private String name;
	private UserLinks userlinks;
	private UserInfo userInfo;
	private UserEducation userEducation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public UserLinks getUserlinks() {
		return userlinks;
	}

	public void setUserlinks(UserLinks userlinks) {
		this.userlinks = userlinks;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	public UserEducation getUserEducation() {
		return userEducation;
	}
	
	public void setUserEducation(UserEducation userEducation) {
		this.userEducation = userEducation;
	}

}
