package com.lti.training.day2.oops;

public class App {
	public static void main(String[] args) {
		
	Student stu1=new Student();
	stu1.name="sravani";
	stu1.college="rise";
	stu1.doj="may 21";
	System.out.println(stu1.name);
	System.out.println(stu1.college);
	System.out.println(stu1.doj);
	
	
	Passport a= new Passport();
	a.setPassportNo("abc123");
	a.setIssueDate("21-05-19");
	a.setExpiryDate("30-12-25");
	a.setNameOfThePerson("sravani");
	
	System.out.println(a.getPassportNo());
	System.out.println(a.getIssueDate());
	System.out.println(a.getNameOfThePerson());
	System.out.println(a.getExpiryDate());
	
	
	AadharCard ac=new AadharCard(12345,"abcd","mumbai");
	System.out.println(ac.getAadharNo());
	System.out.println(ac.getName());
	System.out.println(ac.getAddress());
	}

}


