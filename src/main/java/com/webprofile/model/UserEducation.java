package com.webprofile.model;

public class UserEducation {
	
	private Education primaryEducation;
	private Education secondaryEducation;
	private Education tertiaryEducation;
	public Education getPrimaryEducation() {
		return primaryEducation;
	}
	public void setPrimaryEducation(Education primaryEducation) {
		this.primaryEducation = primaryEducation;
	}
	public Education getSecondaryEducation() {
		return secondaryEducation;
	}
	public void setSecondaryEducation(Education secondaryEducation) {
		this.secondaryEducation = secondaryEducation;
	}
	public Education getTertiaryEducation() {
		return tertiaryEducation;
	}
	public void setTertiaryEducation(Education tertiaryEducation) {
		this.tertiaryEducation = tertiaryEducation;
	}
	
}
