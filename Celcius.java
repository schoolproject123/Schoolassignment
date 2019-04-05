/** 
 *This subclass is to create a new object called Celcius. 
  It takes a temperature in Farenheit and returns the value in Celcius. 
 * 
 */

//New Class, Subclass to MasterTemp program and class
public class Celcius {
	
	// Base temp set for celcius  
	double Temperature; 
		

		//Create Object
		Celcius() {
	
	}
	
	//create Constructors
	Celcius(double newTemperature) {
		temperature = newTemperature;
	}

	
	//Convert from Farenheit to Celcius
	double Conversion() {
		return (temperature - 32) * 5/9;
	}
	
	//create void method
	void set(double newTemperature) {
		temperature = newTemperature;
	}

}

	
