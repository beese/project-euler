package beese.projecteuler;

public class P6 {
	//Project Euler Problem 6: Sum square difference
	//The sum of the squares of the first ten natural numbers is,
	//1^2 + 2^2 + ... + 10^2 = 385
	//The square of the sum of the first ten natural numbers is,
	//(1 + 2 + ... + 10)^2 = 55^2 = 3025
	//Hence the difference between the sum of the squares of the 
	//first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
	//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	
	public static void main(String [] args) {
		int squareSum = 0;
		int sum = 0;
		int difference = 0;
		
		for(int i = 1; i < 101; i++) {
			squareSum += Math.pow(i, 2);
			sum += i;
		}
		
		sum = (int) Math.pow(sum, 2);
		
		difference = sum - squareSum;
		
		System.out.println("The difference is: " + difference);
	}
}
