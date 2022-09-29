package SYNTAX;

import java.util.Scanner;

public class Zad35 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Do you need a loan?");
		Boolean ans1=scanner.nextBoolean();
		
		if (ans1) {
		System.out.println("What is your credit score?");
		int num=scanner.nextInt();
		
		if (num<=600) {
		    System.out.println("Not eligible");
	    }
		if (num>600 && num<700) {
			System.out.println("Maybe eligibl");
		}
		if (num>700 && num<800) {
			System.out.println("Eligible");}
		if (num>800) {
			System.out.println("Definitely eligible");
		
		} else {
			System.out.println("Unknown");
		}
		}
	}
}





