package beese.projecteuler;

public class P5 {
	//Project Euler Problem 5: Smallest Multiple
	//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
	//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	
	public static void main(String [] args) {
		int smallNum = 0;
		for(int i = 20; ; i++) {
			boolean isDiv = true;
			for(int j = 2; j < 21; j++) {
				if(!(i % j == 0)) {
					isDiv = false;
					break;
				}
			}
			if(isDiv) {
				smallNum = i;
				break;
			}
		}
		System.out.println("Smallest number that is evenly divisible by 1 to 20: " + smallNum);
	}
}
