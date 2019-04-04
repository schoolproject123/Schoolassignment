

import java.util.*;

public class Mastertemp {

	
	public static void main(String[] args) {
		// Create scanner
        Scanner input = new Scanner(System.in);
        
        //User inputs a temperature for C or F. 
        
        System.out.print("Enter a Temperature in F or C");
        double temperature1 = input.nextInt();
        double temperature2 = input.nextInt();
        
        
        
        
        Celcius thermo1 = new Celcius();
        Fahrenheit thermo2 = new Fahrenheit();
        
        System.out.println("Temperature in Celsius = " + temperature1.getTemperature());
       
       
	}

}
