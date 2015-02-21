package beese.projecteuler;

import java.util.ArrayList;

public class P3 {
	
	//Project Euler Problem 3: Largest Prime Factor
	//The prime factors of 13195 are 5, 7, 13 and 29.
	//What is the largest prime factor of the number 600851475143 ?
	
	static ArrayList<Long> factors = new ArrayList<Long>();
	
	public static void factor(long a) {
		boolean worked = true;
		boolean exists = false;
		for(int i = 2; i <= a/i; i++) {
			if(a % i == 0) {
				factor(a/i);
				worked = false;
			}
		}
		if(worked) {
			for(int i = 0; i < factors.size(); i++) {
				if(a == factors.get(i)) {
					exists = true;
				}
			}
			if(!exists) { 
				factors.add(a);
			}	
		}
	}
	
	public static void main(String [] args) {
		long num = 600851475143L;
		factor(num);
		// now find the maximum factor in the ArrayList
		long max = factors.get(0);
		for(int i = 1; i < factors.size(); i++) {
			if (factors.get(i) > max) {
				max = factors.get(i);
			}
		}
		System.out.println("Maximum prime factor of the number: " + max);
	}
	
}