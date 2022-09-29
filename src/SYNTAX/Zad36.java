package SYNTAX;
import java.util.Scanner;
public class Zad36 {

	public static void main(String[] args) {
				
				Scanner scanner=new Scanner(System.in);{
				
				System.out.println("Please enter two strings");
				
				String word1=scanner.nextLine();
				String word2=scanner.nextLine(); 
				
				System.out.println("Please enter two numbers");
				int num1=scanner.nextInt();
				int num2=scanner.nextInt();

				if (word1==word2 && num1==num2) {
				   System.out.println("AND");}
				
				else if (word1==word2 || num1==num2) {
					   System.out.println("OR");}
				
				else if (word1!=word2 && num1!=num2) {
					   System.out.println("NONE");}
			
	}

} }
