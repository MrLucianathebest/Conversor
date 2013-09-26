package conversor;

public class Conversor {

	public int celsiusParaFahrenheit(){
		int resultado=(9*40)/(5)+32;	
		return resultado;
	}	
	
	public int celsiusParaFahrenheit(int celsius){
		int resultado=(9*celsius)/5+32;	
		return resultado;
	}
	
	public double celsiusParaFahrenheit(double valorCelsius){
		double resultado=(9.0*valorCelsius)/5.0+32.0;	
		return resultado;
	}
	
	public double fahrenheitParaCelsius(double fahrenheit){
		double resultado=((fahrenheit-32.0)*5.0)/9.0;	
		return resultado;
	}
	public double kelvinParaCelsius(double kelvin){
		double resultado=kelvin-273.0;	
		return resultado;
	}
	public double celsiusParaKelvin(double celsius){
		double resultado=celsius+273.0;	
		return resultado;
	}
	public double kelvinParaFahrenheit(double kelvin){
		double celsius=kelvin-273.0;	
		return celsiusParaFahrenheit(celsius);
	}
	public double fahrenheitParaKelvin(double fahrenheit){
		double celsius=fahrenheitParaCelsius(fahrenheit);	
		return celsiusParaKelvin(celsius);
	}

}