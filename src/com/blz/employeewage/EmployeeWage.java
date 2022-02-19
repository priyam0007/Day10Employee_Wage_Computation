package com.blz.employeewage;
 import java.util.*;
  public class EmployeeWage {
	  
	    public static final int IS_FULL_TIME = 1;                   
  	    public static final int IS_PART_TIME = 2;
  	    public static final int EMP_RATE_PER_HOUR = 20;
  	    public static final int NUM_OF_WORKING_DAYS= 20;
  	    public static final int MAX_HOURS_IN_MONTH = 100;
	    public static void main(String[] args) {
		    int empHRs = 0;                           // Variables
  	    	int empWage = 0;                          // Variables
  	    	int totalempWage = 0;                     // Variables 
  	    	Random random = new Random();
	    	int empcheck = random.nextInt(3);       //Computation 
	    	switch(empcheck) {
	    	case IS_FULL_TIME:
	                 empHRs = 8;
	                 break;
	        case  IS_PART_TIME:
	    	         empHRs = 4;
	    	         break;
	        default:
	    	         empHRs = 0;
	    	}      
	            empWage= empHRs*EMP_RATE_PER_HOUR;
	            System.out.println("empWage:"   + empWage);
	            totalempWage= empWage*MAX_HOURS_IN_MONTH*NUM_OF_WORKING_DAYS;
	            System.out.println("totalempWage:"   + totalempWage);
	           
	    }
  }
