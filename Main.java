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
		String operacao = "Escolha a conversão desejada:\n"
		+"1 - Celsius para fahrenheit."
		+"2 - Celsius para kelvin.\n"
		+"3 - fahrenheit para celsius.\n"
		+"4 - fahrenheit para kelvin.\n"
		+"5 - Kelvin para fahrenheit.\n"
		+"6 - Kelvin para celsius. \n";
		
		System.out.println(operacao);
		
		opcao = Integer.parseInt(leitor.readLine());
		
		System.out.println("Diite o valor que deseja converter:");
		valorParaConversao = Double.parseDouble(leitor.readLine());
		switch(opcao){
		case 1:
			resultado = conversor.celsiusParaFahrenheit(valorParaConversao);
			break;
		case 2:
			resultado = conversor.celsiusParaKelvin(valorParaConversao);
			break;
		case 3:
			resultado = conversor.fahrenheitParaCelsius(valorParaConversao);
			break;
		case 4:
			resultado = conversor.fahrenheitParaKelvin(valorParaConversao);
			break;
		case 5:
			resultado = conversor.kelvinParaCelsius(valorParaConversao);
			break;
		case 6:
			resultado = conversor.kelvinParaFahrenheit(valorParaConversao);
			break;
		default:
			System.out.println("Opção inválida!!!");
		}
		
		System.out.println("O resultado da conversão é "+resultado);
		}
}


