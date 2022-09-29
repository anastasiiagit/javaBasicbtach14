package SYNTAX;
import java.util.Scanner;
public class Zad37 {

	public static void main(String[] args) {
		
						
						Scanner scanner=new Scanner(System.in);{
							
						System.out.println("Are you thirsty?");
						
						boolean thirsty=scanner.nextBoolean();
						 
						
						System.out.println("Are you sleepy?");
						boolean sleepy=scanner.nextBoolean();
					

						if (thirsty  !=sleepy) {
						   System.out.println("drink=water");}
						
						else if (thirsty && sleepy) {
							   System.out.println("drink=coffee");}
						
						else if (sleepy !=thirsty ) {
							   System.out.println("drink=tea");}
						
						} else {
						System.out.println("nothing");}	
							
			}	 	
	}



