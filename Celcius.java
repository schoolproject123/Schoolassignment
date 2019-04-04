/* This program is called by the Master program and calculates the 
temperature into celcius and displays the result in the master */


public class Celcius {
	
	/* Base temp set for celcius */ 
	double Temperature = 35; 
		

	
		/* Calculation performed to turn a user input into a temp in Celcius */
		double getTemperature() {
		return ((Temperature - 32)*5)/9;
		
		
		

   }

}
