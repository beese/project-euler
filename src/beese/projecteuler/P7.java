package beese.projecteuler;

public class P7 {
	//Problem 7: 10001st prime
	//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
	//we can see that the 6th prime is 13.
	//What is the 10001st prime number?
	
	public static void main(String [] args) {
		int count = 0;
		int lastVal = 0;
		for(int i = 2; count < 10001; i++) {
			boolean isPrime = true;
			for(int j = 2; j <= i; j++) {
				if(i % j == 0 && i != j) {
					isPrime = false;
				}
			}
			if(isPrime) {
				count++;
				lastVal = i;
			}
		}
		System.out.println("10001st prime number is: " + lastVal);
	}
}
