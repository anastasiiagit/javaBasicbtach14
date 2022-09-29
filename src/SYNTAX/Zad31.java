package SYNTAX;

import java.util.Scanner;

public class Zad31 {

	public static void main(String[] args) {
		boolean hot=true;
		int t=85;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Is it sunny outside?");
		String temp=scanner.nextLine();
		if (hot) {
		System.out.println("It is a sunny day, I should go somewhere!");}	
		else {  
		System.out.println("I stay home and practice Java");  }
		System.out.println("What is the temperature outside?"); 
		int gr=scanner.nextInt();
		if(gr >= t) {
		System.out.println("I am going to the beach");  	
	    }else {
		    System.out.println("I am going to the park");
		   
	}
	}
}
