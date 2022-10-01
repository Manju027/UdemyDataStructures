package com.udemy.recurssion;

public class GCD {
	
	public static void main(String[] args) {
		
		int a = 8;
		int b = 4;
		
		int result = gcdResult(a,b);
		System.out.println(result);
	}

	private static int gcdResult(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0) return a;
		return gcdResult(b,a%b);
	}

}
