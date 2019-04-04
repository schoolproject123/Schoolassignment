/*
* This program asks a user for a temperature value and converts it from Fahrenheit to Celcius
* and Kelvin. It receives user's input and sends it to two different classes that do the 
* convertion. It finally displays the converted temperatures back to the user.
*/

// Import Java Utilities
import java.util.*;

public class Mastertemp {

	
	public static void main(String[] args) {
	// Create scanner
        Scanner input = new Scanner(System.in);
        
	// Ask user to enter a temperature in Fahrenheit. 
        
        System.out.print("Enter a Temperature in Fahrenheit");
        double temperature1 = input.nextInt();
        double temperature2 = input.nextInt();
        
        // Create two objects           
        Celcius thermo1 = new Celcius();
        Kelvins thermo2 = new Kelvins();
        
	// Displays output to user	
        System.out.println("Temperature in Celsius = " + temperature1.getTemperature());
	System.out.println("Temperature in Kelvins = " + temperature1.getTemperature());
       
       
	}

}
