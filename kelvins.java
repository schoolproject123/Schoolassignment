/**
 * This subclass is to create a new object called Kelvins.
 It takes a temperature in Farenheit and returns the value in kelvins.
 *
 */
 
 //new class Kelvins
public class Kelvins {

//new variable temperature of double
double temperature; 
	
//create new object
 Kelvins() {
	
	}
	
//new constructor
 Kelvins(double newTemperature) {
		temperature = newTemperature;
	}

	
		//method to convert from farenheit to kelvin
	double Conversion() {
		return (temperature - 32) * 5/9 + 273.15;
	}
	
	//set void method
	void set(double newTemperature) {
		temperature = newTemperature;
	}
		
	
	
	}


