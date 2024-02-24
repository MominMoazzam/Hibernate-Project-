package com.tcs.Company_dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Computers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int compId;
	private String cpuName;
	private int noOfProcessor;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Company company;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Employee employee;
	
	public int getCompId() {
		return compId;
	}
	public void setCompId(int compId) {
		this.compId = compId;
	}
	public String getCpuName() {
		return cpuName;
	}
	public void setCpuName(String cpuName) {
		this.cpuName = cpuName;
	}
	public int getNoOfProcessor() {
		return noOfProcessor;
	}
	public void setNoOfProcessor(int noOfProcessor) {
		this.noOfProcessor = noOfProcessor;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
