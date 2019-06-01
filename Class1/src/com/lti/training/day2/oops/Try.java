package com.lti.training.day2.oops;

public class Try {
	
public static void main(String args[]) {
	
	
	Employee e=new Employee();
	e.setEmpno(21);
	e.setName("Ramya");
	e.setDoj("10-6-19");
	e.setSalary(30000.25);
	

	System.out.println(e.getEmpno());
	System.out.println(e.getName());
	System.out.println(e.getDoj());
	System.out.println(e.getSalary());
	
	
	
	
	Passport a= new Passport();
	a.setPassportNo("abc123");
	a.setIssueDate("21-05-19");
	a.setExpiryDate("30-12-25");
	a.setNameOfThePerson("Ramya");
	e.setPassport(a);
	
	System.out.println(a.getPassportNo());
	System.out.println(a.getIssueDate());
	System.out.println(a.getNameOfThePerson());
	System.out.println(a.getExpiryDate());
	
	AadharCard ac=new AadharCard();
	ac.setAadharNo(12345);
	ac.setAddress("mumbai");
	ac.setName("Ramya");
	e.setAadharcard(ac);
	
	e.displayInfo();
	
	
	
	/*System.out.println(e.getAadharcard().getAadharNo());
	System.out.println(e.getAadharcard().getName());
	System.out.println(e.getAadharcard().getAddress());*/
	
}

}
