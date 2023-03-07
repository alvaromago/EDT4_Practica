package es.studium.CajaBlanca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExamen
{

	@Test
	void camino1()
	{
		String resultadoEsperado = "Ya eres mayor de edad";
		String resultadoReal = Examen.mensaje(18);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void camino2()
	{
		String resultadoEsperado = "Ya puedes jubilarte";
		String resultadoReal = Examen.mensaje(67);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void camino3()
	{
		String resultadoEsperado = "No pasa nada";
		String resultadoReal = Examen.mensaje(15);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void camino4()
	{
		boolean resultadoEsperado = true;
		boolean resultadoReal = Examen.validar("45678515Y");
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void camino5()
	{
		boolean resultadoEsperado = false;
		boolean resultadoReal = Examen.validar("745751H");
		assertEquals(resultadoEsperado, resultadoReal);
	}
}
