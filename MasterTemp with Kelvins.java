
/*
* This program asks a user for a temperature value and converts it from Fahrenheit to Celcius
* and Kelvin. It receives user's input and sends it to two different classes that do the 
* convertion. It finally displays the converted temperatures back to the user.
*/
import java.util.*;

public class Mastertemp {

	
	public static void main(String[] args) {
		// Create scanner
        Scanner input = new Scanner(System.in);
        
        //User inputs a temperature for F. 
        
        System.out.print("Enter a Temperature in F");
        double temperature1 = input.nextDouble();
        
        /* Exception Code Block to go here
	*/
       
       
        
       		//create new object called Celcius with temperature1
        	Celcius thermo1 = new Celcius(temperature1);
		
		//create new object called Kelvins with temperature1
        	Kelvins temp = new Kelvins(temperature1);
            
            
            // Output displayed to user
            System.out.println("Temperature in Celsius = " + thermo1.Conversion());
            System.out.println("Temperature in Kelvins = " + temp.Conversion());
        
	}
         
       
       
	}

	



