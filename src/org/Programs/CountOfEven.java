package org.Programs;

public class CountOfEven {
public static void main(String[] args) {
	int oddCount=0,evenCount=0;
	for (int i = 0; i < 100; i++) {
		
		if(i % 2 != 0) {
			oddCount++;
		} else {
			evenCount++;
		}
		
		
	}
	System.out.println("ODD NUMMBER COUNT =" +oddCount);
	System.out.println("EVEN NUMBER COUNT ="+evenCount);
}
}
