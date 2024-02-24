package com.tcs.Company_dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	private String cName;
	private int noOfYears;
	
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "company")
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "company")
	private List<Computers> computerList;
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "company")
	private List<Employee> employeeList;
	
	
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getNoOfYears() {
		return noOfYears;
	}
	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Computers> getComputerList() {
		return computerList;
	}
	public void setComputerList(List<Computers> computerList) {
		this.computerList = computerList;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	
}
