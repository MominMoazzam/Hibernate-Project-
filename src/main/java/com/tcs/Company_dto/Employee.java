package com.tcs.Company_dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eId;
	private String eName;
	private String eDob;
	private String eDoJoining;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Company company;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "employee",orphanRemoval = true)
	private List<Skills> skillList;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Computers computer;
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDob() {
		return eDob;
	}
	public void seteDob(String eDob) {
		this.eDob = eDob;
	}
	public String geteDoJoining() {
		return eDoJoining;
	}
	public void seteDoJoining(String eDoJoining) {
		this.eDoJoining = eDoJoining;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public List<Skills> getSkillList() {
		return skillList;
	}
	public void setSkillList(List<Skills> skillList) {
		this.skillList = skillList;
	}
	public Computers getComputer() {
		return computer;
	}
	public void setComputer(Computers computer) {
		this.computer = computer;
	}

	
	
	
}
