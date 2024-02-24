package com.tcs.Company_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tcs.Company_dto.Address;
import com.tcs.Company_dto.Company;
import com.tcs.Company_dto.Computers;
import com.tcs.Company_dto.Employee;

public class Company_Dao {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private EntityManager manager = factory.createEntityManager();
	private EntityTransaction transaction = manager.getTransaction();
	
	public void saveCompany(Company company) {
		transaction.begin();
		manager.persist(company);
		transaction.commit();
	}
	
	public void updateAddress(int aId) {
		Address addr = manager.find(Address.class, aId);
		if(addr != null) {
			transaction.begin();
			addr.setAddress("Thane near bhiwandi");
			manager.merge(addr);
			transaction.commit();
		}
	}
	
	public void deleteAddress(int aid) {
	  Address addr = manager.find(Address.class,aid);
		 if(addr != null) {
			transaction.begin();
			Company company = addr.getCompany();
			addr.setCompany(null);
			company.setAddress(null);
			manager.remove(addr);
			transaction.commit();
		 }
	}
	
	public void addEmployee(Employee emp,int cid) {
		Company company = manager.find(Company.class, cid);
		if(company != null) {
			transaction.begin();
//			              In  the below two line we are setting the foreign key value of particular NEW coming employee 
			emp.setCompany(company);
			emp.getComputer().setCompany(company);
			List<Employee> empList = company.getEmployeeList();
			empList.add(emp);
			company.setEmployeeList(empList);
			manager.merge(company);
			transaction.commit();	
		}
	}
	
    public void deleteEmployee(int id) {
    	Employee employee = manager.find(Employee.class, id);
    	if(employee != null) {
    		Computers computer = employee.getComputer();
    		Company company = employee.getCompany();
    		computer.setEmployee(null);
    		
    	}
    }
	

}
