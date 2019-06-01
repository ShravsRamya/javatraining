package com.lti.training.day2.oops;

public class Customer {
private String name;
private String email;
private Address address; //has a relationship
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public void displayInfo() {
System.out.println("Name" + empno);
System.out.println("Email" + name);
System.out.println("Passport" + passport.getPassportNo());
System.out.println("AadharCard" + aadharcard.getAadharNo());

}
