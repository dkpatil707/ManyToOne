package manytoone.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytoone.dto.Employee;


public class EmployeeDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
		
	}
	
	public void saveEmployee (Employee employee1) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee1);
		entityTransaction.commit();
	}
		
		public void saveEmployee(List<Employee> employee) {
			EntityManager entityManager=getEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			for(Employee employee1:employee ) {
				entityManager.persist(employee1);
			}
			entityTransaction.commit();
	}

	
		public void updateEmployee(int id,Employee employee) {
			EntityManager entityManager=getEntityManager();
			Employee dbEmployee=entityManager.find(Employee.class, id);
			if(dbEmployee!=null) {
//				id is present them i can update the data
				EntityTransaction entityTransaction=entityManager.getTransaction();
				entityTransaction.begin();
				
				employee.setId(id);
				employee.setCompany(dbEmployee.getCompany());
				entityManager.merge(employee);
				entityTransaction.commit();
			}else {
				System.out.println("Sorry Emp id is not present");
			}
		}
		
		public void deleteEmployee(int id) {
			EntityManager entityManager=getEntityManager();
			Employee dbEmployee=entityManager.find(Employee.class, id);
			if(dbEmployee!=null) {
//				id is present them i can update the data
				EntityTransaction entityTransaction=entityManager.getTransaction();
				entityTransaction.begin();
				entityManager.remove(dbEmployee);
				
				entityTransaction.commit();
			}else {
				System.out.println("Sorry Emp id is not present");
			}
		}
		
		public void findEmployee(int id) {
			EntityManager entityManager=getEntityManager();
			Employee dbEmployee=entityManager.find(Employee.class, id);
			if(dbEmployee!=null) {
//				id is present them i can update the data
				System.out.println(dbEmployee);
			}else {
				System.out.println("Sorry Emp id is not present");
			}
		}
		
		
	}

