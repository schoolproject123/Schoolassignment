/** 
 *This subclass is to create a new object called Celcius. 
  It takes a temperature in Farenheit and returns the value in Celcius. 
 * 
 */

//New Class, Subclass to MasterTemp program and class
public class Celcius {
	
	// Base temp set for celcius  
	double Temperature = 35; 
		

	
		// Calculation performed to turn a user input into a temp in Celcius 
		double getTemperature() {
		return ((Temperature - 32)*5)/9;
		
		
		

   }

}
