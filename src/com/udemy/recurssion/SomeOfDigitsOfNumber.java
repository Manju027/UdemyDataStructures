package com.udemy.recurssion;

public class SomeOfDigitsOfNumber {
	
	public static void main(String[] args) {
	int n=1;
	
	int sum = sumOfDigits(n);
	
	System.out.println(sum);
	}

	private static int sumOfDigits(int n) {
		// TODO Auto-generated method stub
		if(n<10) return n;
		
		return n%10+sumOfDigits(n/10);
	}

}
