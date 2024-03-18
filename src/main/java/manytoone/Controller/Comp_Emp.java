package manytoone.Controller;

import java.util.ArrayList;


import java.util.List;

import manytoone.dto.Company;
import manytoone.dao.CompanyDao;
import manytoone.dao.EmployeeDao;
import manytoone.dto.Employee;

public class Comp_Emp {
	
	public static void main(String[] args) {
		
		Company company=new Company();
		company.setId(21);
		company.setName("Wipro");
		company.setGst("Info@123");
		
//		Employee employee1=new Employee();
//		employee1.setId(15);
//	    employee1.setName("Golu");
//	    employee1.setAddress("Pune");
//	    employee1.setCompany(company);
//	    
//	    Employee employee2=new Employee();
//	    employee2.setId(16);
//	    employee2.setName("Rakey");
//	    employee2.setAddress("Maharashtra");
//	    employee2.setCompany(company);


		Employee employee3=new Employee();
		employee3.setId(15335);
		employee3.setName("Guddu");
		employee3.setAddress("Pune");
	    employee3.setCompany(company);
	    
	    Employee employee4=new Employee();
	    employee4.setId(195335);
	    employee4.setName("Rakeygsfw");
	    employee4.setAddress("Maharashtra");
	    employee4.setCompany(company);

	    CompanyDao companyDao=new CompanyDao();
//	    companyDao.saveCompany(company);   ----------------------------

	   
	    EmployeeDao employeeDao=new EmployeeDao();
	    
	    employeeDao.saveEmployee(employee3);
	    employeeDao.saveEmployee(employee4);  
	    
	    List<Employee> employees=new ArrayList<Employee>();
//	    employees.add(employee1);
//	    employees.add(employee2);
	    employees.add(employee3);
	    employees.add(employee4);
//
	    employeeDao.saveEmployee(employees);
   
	    
	    
	    
	    //DELETE
//	    EmployeeDao employeeDao=new EmployeeDao();
//	    employeeDao.deleteEmployee(2);
//	    employeeDao.deleteEmployee(3);
//	    
//		CompanyDao companyDao=new CompanyDao();
//		companyDao.deleteCompany(1);

//	    Update 
//		Employee employee1=new Employee();
	//	
//	    employee1.setName("Avi");
//	    employee1.setAddress("Mysore");
	//    
//		EmployeeDao employeeDao=new EmployeeDao();
//		employeeDao.updateEmployee(1, employee1);
	//	
//		Company company=new Company();
	//
//		company.setName("Amazonnnnnn");
//		company.setGst("ammajaaan@123");
//		CompanyDao companyDao=new CompanyDao();
	//	
//		companyDao.updateCompany(2, company);
//	    FIND
		
//		EmployeeDao employeeDao=new  EmployeeDao();
//		employeeDao.findEmployee(1);
	//
//		CompanyDao companyDao=new CompanyDao();
//		companyDao.findCompany(1);
		
	}

}
