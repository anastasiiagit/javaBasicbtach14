package EU;

public class number7 {

	public static void main(String[] args) {
		// Write a java program to check whether a given
		// number is prime or not?
		int num = 7;
		int divisorCount = 0; 
		// Prime number is divisible by itself and 1 so divisor count will be a count of
		// 2 for it to be a prime number
		// So the logic will be based on the number of possible divisor

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisorCount++;
			}
		}

		if (divisorCount == 2) {
			System.out.println(num + " is a Prime number");
		} else {
			System.out.println(num + " is not a Prime number");
		}

	}

}
