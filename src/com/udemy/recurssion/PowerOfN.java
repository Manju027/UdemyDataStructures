package com.udemy.recurssion;

public class PowerOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;
		int x = 2;
		
		int result = power(x,n);
		System.out.println(result);

	}

	private static int power(int x, int n) {
		// TODO Auto-generated method stub
		if(n<0) return -1;
		if(n== 0) return x;
		return x*power(x,n-1);
	}

}
