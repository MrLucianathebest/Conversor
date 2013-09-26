package conversorTest;

import static org.junit.Assert.*;

import org.junit.Test;

import conversor.Conversor;

public class ConversorTest {
	Conversor testeConversor = new Conversor();
	
	@Test
	public void testCelsiusParaFahrenheit() {
		//testa valores grandes, pequenos e negativos!
		assertEquals(1832.0, testeConversor.celsiusParaFahrenheit(1000.0), 0.01);
		assertEquals(32.018, testeConversor.celsiusParaFahrenheit(0.01), 0.01);
		assertEquals(-8.140, testeConversor.celsiusParaFahrenheit(-22.3), 0.01);
	}
	
	@Test
	public void testFahrenheitParaCelsius() {
		//testa valores grandes, pequenos e negativos!
		assertEquals(1000.0, testeConversor.fahrenheitParaCelsius(1832.0), 0.01);
		assertEquals(0.01, testeConversor.fahrenheitParaCelsius(32.018), 0.01);
		assertEquals(-22.3, testeConversor.fahrenheitParaCelsius(-8.14), 0.01);
	}
	
	@Test
	public void testCelsiusParaKelvin() {
		//testa valores grandes, pequenos e negativos!
		assertEquals(273, testeConversor.celsiusParaKelvin(0), 0.01);
		assertEquals(273.01, testeConversor.celsiusParaKelvin(0.01), 0.01);
		assertEquals(250.7, testeConversor.celsiusParaKelvin(-22.3), 0.01);
	}
	
	@Test
	public void testKelvinParaCelsius() {
		//testa valores grandes, pequenos e negativos!
		assertEquals(-273.0, testeConversor.kelvinParaCelsius(0.0), 0.01);
		assertEquals(-214, testeConversor.kelvinParaCelsius(59.0), 0.01);
		assertEquals(326, testeConversor.kelvinParaCelsius(599.00), 0.01);
	}
	
	@Test
	public void testFahrenheitParaKelvin() {
		//testa valores grandes, pequenos e negativos!
		assertEquals(255.22, testeConversor.fahrenheitParaKelvin(0.0), 0.01);
		assertEquals(421.88, testeConversor.fahrenheitParaKelvin(299.98), 0.01);
		assertEquals(31.85, testeConversor.fahrenheitParaKelvin(-402.07), 0.01);
	}
	
	@Test
	public void testKelvinParaFahrenheit() {
		//testa valores grandes, pequenos e negativos!
		assertEquals(0.0, testeConversor.kelvinParaFahrenheit(255.22), 0.01);
		assertEquals(299.98, testeConversor.kelvinParaFahrenheit(421.88), 0.01);
		assertEquals(-402.07, testeConversor.kelvinParaFahrenheit(31.85), 0.01);
	}

}