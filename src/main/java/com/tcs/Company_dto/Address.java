package com.tcs.Company_dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private int aId;
   private String address;
   
   @ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn
	private Company company;

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getaId() {
	return aId;
}

public void setaId(int aId) {
	this.aId = aId;
}

public Company getCompany() {
	return company;
}

public void setCompany(Company company) {
	this.company = company;
}
   
   
}
