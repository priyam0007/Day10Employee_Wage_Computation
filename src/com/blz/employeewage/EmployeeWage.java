package com.blz.employeewage;
 import java.util.*;
  public class EmployeeWage {
	    public static void main(String[] args) {
		   
	    	int IS_FULL_TIME = 1;                   // constants value
	    	int IS_PART_TIME = 2;
	    	int EMP_RATE_PER_HOUR =20;              // constants value 
	    	int empHRs = 0;                           // Variables
  	    	int empWage = 0;                          // Variables
  	    	Random random = new Random();
	    	int empcheck = random.nextInt(3);       //Computation 
	    	
	        if (empcheck == IS_FULL_TIME)
	                 empHRs = 8;
	       else if (empcheck == IS_PART_TIME)
	    	         empHRs = 4;
	       else
	    	         empHRs = 0;
	                 
	            empWage= empHRs*EMP_RATE_PER_HOUR;
	            System.out.println("empWage:"   + empWage);
	}
}
