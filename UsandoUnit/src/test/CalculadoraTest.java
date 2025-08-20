package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class CalculadoraTest {

	@Test
	void somaTeste() {
		Calculadora calc = new Calculadora();
		assertEquals(2.0, calc.soma(1.0, 1.0), "Deve resultar em 2");
	}
	
    @Test
    void subtracaoTeste() {
        Calculadora calc = new Calculadora();
        assertEquals(1.0, calc.subtrai(3.0, 2.0), "Deve resultar em 1");
    }

    @Test
    void multiplicacaoTeste() {
        Calculadora calc = new Calculadora();
        assertEquals(6.0, calc.multiplica(2.0, 3.0), "Deve resultar em 6");
    }

    @Test
    void divisaoTeste() {
        Calculadora calc = new Calculadora();
        assertEquals(2.0, calc.divide(4.0, 2.0), "Deve resultar em 2");
    }

    @Test
    void potenciacaoTeste() {
        Calculadora calc = new Calculadora();
        assertEquals(8.0, calc.potencia(2.0, 3.0), "Deve resultar em 8");
    }

}
