package com.tcs.Company_dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Skills {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sId;
	private String sName;
	private int handsOnExperience;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Employee employee;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getHandsOnExperience() {
		return handsOnExperience;
	}
	public void setHandsOnExperience(int handsOnExperience) {
		this.handsOnExperience = handsOnExperience;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
