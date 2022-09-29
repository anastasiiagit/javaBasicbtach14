package com.syntax.class08;
public class Mat {
	
	
int sumOdd = 0;
int sumEven = 0;

for (int i = 1; i <= 50; i++) {
    if (i % 2 == 0) {
        sumEven += i;
    } else {
        sumOdd += i;
    }
}
System.out.println("SUM OF ODD NUMBERS = " + sumOdd);
System.out.println("SUM OF EVEN NUMBERS = " + sumEven);
Scanner input = new Scanner(System.in);
int secret = 1234;
int guess;

do {
    System.out.println("Please guess the secret number: ");
    guess = input.nextInt();

}while(guess != secret);

System.out.println("You won!");


}}
