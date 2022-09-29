package com.syntax.class02;

public class Varibles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Anastasiia";
		String lastname="Balaniuk";
		String grade="Betch 14";
		String city="Pittsburg";
		String State="PA";
		String phone="4123375664";
		
		System.out.println(" My name is "+name+ " and my last name " + lastname);
		
		System.out.println(" I am "+ grade+ " student ");
		System.out.println(" I llive in a "+ city+" " + State);
		System.out.println("My phone is"+phone);
		
		 city="New York";
		 State="NY";
		 phone="099546547";
		
		System.out.println(" My name is "+name);
		System.out.println(" I moved to "+city+ " "+ State);
		System.out.println(" My new number is "+phone);
	}
	
	
     /* Rules for Identifiers=names (variables, 
    * 1. cannot use keywrds as identifiers
    * string new ="Hello"; -> error
    * 
    * 2. cannot have spaces in identifiers
    * string last name="Smith";
    * 
    * 3. identifieers cannot start with number
    *
    
    */
	
   int number1=123; //number can be anywhere after 
   
   /* 4. indetifiers cannot cantain any special charecter 
    * except $ or _
    */
   
   double $price$=9.98;
   float _price_=1.99F;
   
   /*
    * Naming Conventions
    * 
    * Class should start with Uppercase and follow camel
    * 
    * variables should start with lowercase and follow car
    */
   
   String Weather="hot";
   String myweather="cold"; 
}
