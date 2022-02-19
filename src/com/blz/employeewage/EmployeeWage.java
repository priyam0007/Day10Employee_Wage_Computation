package com.blz.employeewage;
 import java.util.*;
  public class EmployeeWage {
	    public static void main(String[] args) {
		   
	    	int IS_FULL_TIME = 1;          // constants value
	    	//Computation
	    	Random random = new Random();
	    	int empcheck = random.nextInt(2);
	    	
	        if (empcheck == IS_FULL_TIME)
	    	   System.out.println("Employee is Present");
	       else
	    	   System.out.println("Employee is Abcent");
	}
}
