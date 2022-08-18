package org.Programs;

public class PrimeNumber {
public static void main(String[] args) {
	int a=11;
	boolean result= true;
	for (int i = 2; i < a/2; i++) {
		if (a%2!=0) {
			result=true;
			break;
			
		} else {
			result=false;
		}
		
	}
	if (false) {
		System.out.println(a+" is a not prime number");
	} else {
		System.out.println(a+" is a prime number");
	}
}
}
