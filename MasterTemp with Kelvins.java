/*
* This program asks a user for a temperature value and converts it from Fahrenheit to Celcius
* and Kelvins. It receives user's input and sends it to two different classes that do the 
* conversion. It finally displays the converted temperatures back to the user.
*/

// Import Java Utilities
import java.util.*;

public class MasterTemp {

	
	public static void main(String[] args) {
		// Create scanner object
        Scanner input = new Scanner(System.in);
        
        // Defining variables to be used by the program
        boolean continueinput = true; 	// Boolean variable to determine if keeps asking for a right number
        double temperature1 = 0;	// Variable for registering the user's input for temperature
        
        // Verify user's input
        do {
        	try {
        		// Ask user to enter a temperature in Fahrenheit. 
        		System.out.print("Enter a Temperature in Fahrenheit: ");
        		temperature1 = input.nextDouble();
        
        		// Create two objects           
        		Celcius thermo1 = new Celcius(temperature1);
        		Kelvins thermo2 = new Kelvins(temperature1);
        
        		// Displays output to user	
        		System.out.println("Temperature in Celsius = " + thermo1.conversion());
        		System.out.println("Temperature in Kelvins = " + thermo2.conversion());
        		continueinput = false;
        	}
        
        	//check if input is wrong
        	catch(InputMismatchException ex) {
        		System.out.println("The input must be a Number. Please try again.");
        		input.nextLine();
        	}
        }while (continueinput);
	}

}
