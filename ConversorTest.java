package conversor;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTest {
	Conversor umConversor = new Conversor();
	
	@Test
	public void testcelsiusParaFahrenheit() {
		assertEquals(10.0, umConversor.celsiusParaFahrenheit(10.0), 0.01);
	
	}

}
