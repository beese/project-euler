package beese.projecteuler;

public class P4 {
	//Project Euler Problem 4: Largest palindrome product
	//A palindromic number reads the same both ways. 
	//The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
	//Find the largest palindrome made from the product of two 3-digit numbers.
	
	public static void main(String [] args) {
		
		int largestPalindrome = 0;
		for(int i = 100; i < 1000; i++) {
			for(int j = 100; j < 1000; j++) {
				int product = i * j;
				String strProduct = Integer.toString(product);
				boolean isPalindrome = true;
				for(int k = 0; k < strProduct.length()/2; k++) {
					if(strProduct.charAt(k) != strProduct.charAt(strProduct.length()-(k+1))) {
						isPalindrome = false;
						break;
					}
				}
				if(isPalindrome) {
					if(product > largestPalindrome) {
						largestPalindrome = product;
					}
				}
			}
		}
		System.out.println("Largest palindrome made from the product of two 3 digit numbers: " + largestPalindrome);
	}
}
