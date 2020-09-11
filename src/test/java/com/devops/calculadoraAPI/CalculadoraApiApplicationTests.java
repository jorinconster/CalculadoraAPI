package com.devops.calculadoraAPI;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;



import com.devops.calculadoraAPI.modelo.Operaciones;

@RunWith(SpringRunner.class)
@SpringBootTest
class CalculadoraApiApplicationTests {


		@Autowired
		Operaciones calculadora;

		@Test
		public void testSuma() {
			// Arrange
			double n1 = 0;
			double n2 = 1;
			double resultadoEsperado = 1;
			double deltaEsperado = 0;
			//Act
			double resultadoActual = calculadora.suma(n1, n2);

			//Assert
			assertEquals("La suma realizada no coincide", resultadoEsperado, resultadoActual, deltaEsperado);
		}

	@Test
	public void testResta() {
		// Arrange
		double n1 = 5;
		double n2 = 2;
		double resultadoEsperado = 3;
		double deltaEsperado = 0;
		//Act
		double resultadoActual = calculadora.resta(n1, n2);

		//Assert
		assertEquals("La resta realizada no coincide", resultadoEsperado, resultadoActual, deltaEsperado);
	}

	@Test
	public void testMultiplicacion() {
		// Arrange
		double n1 = 10;
		double n2 = 4;
		double resultadoEsperado = 40;
		double deltaEsperado = 0;
		//Act
		double resultadoActual = calculadora.multiplicacion(n1, n2);

		//Assert
		assertEquals("La multiplicacion realizada no coincide", resultadoEsperado, resultadoActual, deltaEsperado);
	}

	@Test
	public void testDivision() {
		// Arrange
		double n1 = 24;
		double n2 = 8;
		double resultadoEsperado = 3;
		double deltaEsperado = 0;
		//Act
		double resultadoActual = calculadora.division(n1, n2);

		//Assert
		assertEquals("La division realizada no coincide", resultadoEsperado, resultadoActual, deltaEsperado);
	}

}
