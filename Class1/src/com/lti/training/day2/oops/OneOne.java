package com.lti.training.day2.oops;

public class OneOne {
	
public static void main(String args[]) {
	
	Customer c= new Customer();
	c.setName("Sravani");
	c.setEmail("sravani123@gmail.com");
	
	System.out.println(c.getName());
	System.out.println(c.getEmail());
	
	
	Address s=new Address();
	s.setCity("ongole");
	s.setState("Andhra Pradesh");
	s.setPincode(123456);
	
	System.out.println(s.getCity());
    System.out.println(s.getState());
    System.out.println(s.getPincode());
}


}
