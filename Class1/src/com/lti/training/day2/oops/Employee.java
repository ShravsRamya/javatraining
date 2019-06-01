package com.lti.training.day2.oops;

public class Employee {
	private int empno;
	private String name;
	private String doj;
	private double salary;
	
	
    //one to one association
	// has a relationship
	//association
	
	private Passport passport;
	private AadharCard aadharcard;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public AadharCard getAadharcard() {
		return aadharcard;
	}
	public void setAadharcard(AadharCard aadharcard) {
		this.aadharcard = aadharcard;
	}
public void displayInfo() {
System.out.println("Empno" + empno);
System.out.println("Name" + name);
System.out.println("Passport" + passport.getPassportNo());
System.out.println("AadharCard" + aadharcard.getAadharNo());
}
}

