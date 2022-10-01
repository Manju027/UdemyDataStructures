package com.udemy.recurssion;


/* 1 October 2022
 * 
 * Author Manjunath Patil
 * 
 * */
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		
	    int result = fact(n);
	    System.out.println(result);
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		if(n<0)
			return -1;
					
		if(n==1)
			return 1;
		
		return n*fact(n-1);
	}

}
