package SYNTAX;
import java.util.Scanner;
public class Zad40 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	   
		System.out.println("Enter name of the instructor");
		String  nume = scanner.nextLine(); 
	    switch (nume) { 
	        case "Asghar":
	            System.out.println("Will take care of Java Assignment");
	            break;
	        case "Moazzam":
	            System.out.println("Will take care of SDLC Assignment");
	            break;
	        case "Weqas":
	            System.out.println("Will take care of Selenium Assignment");
	            break;
	        case "Asel":
	            System.out.println("Will take care of every Assignment");
	            break;
	        default:
	            System.out.println(" Invalid instructor selected");
	    }
	}

	}


