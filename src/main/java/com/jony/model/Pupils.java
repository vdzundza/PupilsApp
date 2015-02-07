package com.jony.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Pupils {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) // for Autonumber
	
	private int pupilsId;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private int yearLevel;
	public Pupils(){}
	public Pupils(int pupilsId, String firstname, String lastname, int yearLevel) {
		super();
		this.pupilsId = pupilsId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.yearLevel = yearLevel;
	}
	public int getPupilsId() {
		return pupilsId;
	}
	public void setPupilsId(int pupilsId) {
		this.pupilsId = pupilsId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getYearLevel() {
		return yearLevel;
	}
	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	

}
