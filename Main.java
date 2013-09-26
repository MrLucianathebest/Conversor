package conversor;

import java.io.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		Conversor conversor = new Conversor();
		int opcao;
		double valorParaConversao, resultado=0;
		
		System.out.println("Escolha a conversão desejada:");
		System.out.println("1 - Celsius para fahrenheit.");
		System.out.println("2 - Celsius para kelvin.");
		System.out.println("3 - fahrenheit para celsius.");
		System.out.println("4 - fahrenheit para kelvin.");
		System.out.println("5 - Kelvin para fahrenheit.");
		System.out.println("6 - Kelvin para celsius.");
		
		opcao = Integer.parseInt(leitor.readLine());
		
		System.out.println("Diite o valor que deseja cosnverter:");
		valorParaConversao = Double.parseDouble(leitor.readLine());
		
		
		if(opcao == 1){
			resultado = conversor.celsiusParaFahrenheit(valorParaConversao);
		}
		else if(opcao==2){
			resultado = conversor.celsiusParaKelvin(valorParaConversao);
		}
		else if(opcao==3){
			resultado = conversor.fahrenheitParaCelsius(valorParaConversao);
		}
		else if(opcao==4){
			resultado = conversor.fahrenheitParaKelvin(valorParaConversao);
		}
		else if (opcao==5){
			resultado = conversor.kelvinParaCelsius(valorParaConversao);
		}
		else if (opcao==6){
			resultado = conversor.kelvinParaFahrenheit(valorParaConversao);
		}
		else{
			System.out.println("Opção inválida!!!");
		}
		
		System.out.println("O resultado da conversão é "+resultado);
		}
}


