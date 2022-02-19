package com.blz.employeewage;
 import java.util.*;
  public class EmployeeWage {
	    public static void main(String[] args) {
		   
	    	int IS_FULL_TIME = 1;                   // constants value
	    	int EMP_RATE_PER_HOUR =20;              // constants value 
	    	int empHRs = 0;                           // Variables
  	    	int empWage = 0;                          // Variables
  	    	Random random = new Random();
	    	int empcheck = random.nextInt(2);       //Computation 
	    	
	        if (empcheck == IS_FULL_TIME)
	                 empHRs = 8;
	       else 
	    	         empHRs = 0;
	                 
	            empWage= empHRs*EMP_RATE_PER_HOUR;
	            System.out.println("empWage:"   + empWage);
	}
}
