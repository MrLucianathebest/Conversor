class Corvesor{

	int celsiusParaFahrenheit(){
		int resultado=(9*40)/(5+32);	
		return resultado;
	}	
	
	int celsiusParaFahrenheit(int celsius){
		int resultado=(9*celcius)/(5+32);	
		return resultado;
	}
	
	double celsiusParaFahrenheit(double celsius){
		double resultado=(9.0*celcius)/(5.0+32.0);	
		return resultado;
	}
	
	double fahrenheitParaCelsius(double fahrenheit){
		double resultado=fahrenheit*(5.0+32.0)/9.0;	
		return resultado;
	}
	double kelvinParaCelsius(double kelvin){
		double resultado=kelvin+273.0;	
		return resultado;
	}
	double celsiusParaKelvin(double celsius){
		double resultado=celsius-273.0;	
		return resultado;
	}
	double kelvinParaFahrenheit(double kelvin){
		double celsius=kelvin+273.0;	
		return celsiusParaFahrenheit(celsius);
	}
	double fahrenheitParaKelvin(double fahrenheit){
		double celsius=fahrenheitParaCelsius(fahrenheit);	
		return celsiusParaKelvin(celsius) ;
	}
	
}
