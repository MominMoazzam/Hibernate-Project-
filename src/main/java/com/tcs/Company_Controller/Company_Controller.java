package com.tcs.Company_Controller;

import java.util.ArrayList;
import java.util.List;


import com.tcs.Company_dao.Company_Dao;
import com.tcs.Company_dto.Address;
import com.tcs.Company_dto.Company;
import com.tcs.Company_dto.Computers;
import com.tcs.Company_dto.Employee;
import com.tcs.Company_dto.Skills;

public class Company_Controller {

	public static void main(String[] args) {
		

//		Company company = new Company();
//		company.setcName("Dairy Farm");
//		company.setNoOfYears(2);
		
//		Address address = new Address();
//		address.setAddress("Bhiwandi wagle road near Talao pali");
		
//		company.setAddress(address);
//		address.setCompany(company);
		
		Computers computer = new Computers();
//		computer.setCompany(company);
		computer.setCpuName("Intel");
		computer.setNoOfProcessor(2);
//		
//		Computers computer1 = new Computers();
//		computer1.setCompany(company);
//		computer1.setCpuName("Ryzen");
//		computer1.setNoOfProcessor(3);
	
		List<Computers> computerList = new ArrayList<Computers>();
		computerList.add(computer);
//		computerList.add(computer1);
		
		Employee  employee = new Employee();
//		employee.setCompany(company);
		employee.setComputer(computer);
		employee.seteDob("2012");
		employee.seteName("Goncha");
		employee.seteDoJoining("2019");
		
//		Employee  employee1 = new Employee();
//		employee1.setCompany(company);
//		employee1.setComputer(computer1);
//		employee1.seteDob("2013");
//		employee1.seteName("duogn");
//		employee1.seteDoJoining("2020");
		
		computer.setEmployee(employee);
//		computer1.setEmployee(employee1);
		
//		company.setComputerList(computerList);
		
		Skills skill = new Skills();
		skill.setEmployee(employee);
		skill.setHandsOnExperience(2);
		skill.setsName("Karigar");
		
//		Skills skill1 = new Skills();
//		skill1.setEmployee(employee1);
//		skill1.setHandsOnExperience(2);
//		skill1.setsName(".NET");
		
		List<Skills> skillList = new ArrayList<Skills>();
		skillList.add(skill);
//		skillList.add(skill1);
		
		employee.setSkillList(skillList);
//		employee1.setSkillList(skillList);
		
		Company_Dao dao = new Company_Dao();
		
//		                                       SAVING THE DATA
//				dao.saveCompany(company);
		
//		                                       UPDATION AND DELETION OF ADDRESS
//				dao.updateAddress(8);
//              dao.deleteAddress(16);
//		    
//		                                       ADDITION OF MORE EMPLOYEE IN COMPANY(UPDATION)
//		        dao.addEmployee(employee, 1);
		
		        
				
		
		

	}
}
