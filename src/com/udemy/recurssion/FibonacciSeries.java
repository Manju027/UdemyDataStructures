package com.udemy.recurssion;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =3;
		
		System.out.println(fibonacciMethod(n));

	}

	private static int fibonacciMethod(int n) {
		// TODO Auto-generated method stub
		
		if(n==0||n==1) return n;
		
		return fibonacciMethod(n-1)+fibonacciMethod(n-2);
		
		
	}

}
