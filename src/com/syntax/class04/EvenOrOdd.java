package com.syntax.class04;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     int number=5;
     System.out.println(5%2);
     //if we take the modulus of a number by2 and answer is 0 it is always an Even number
     //otherwise it is an odd number
     
     if(number%2==0) {
    	 System.out.println("Number is Even");
     }else {
    	 System.out.println ("Number is Odd");
     }
	}

}
