package cl.praxis;

import cl.praxis.model.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testSumar(){
        assertEquals(5, calculadora.sumar(3, 2));
    }

    @Test
    public void testRestar() {
        assertEquals(7, calculadora.restar(9, 2));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(9, calculadora.multiplicar(3, 3));
    }

    @Test
    public void testDividir() {
        assertEquals(2, calculadora.dividir(8, 4));
    }

    @Test
    public void testDividirPorCero() {
        try{
            calculadora.dividir(6, 0);
            fail("Mostrar el IllegalArgumentException si se divide por cero.");
        } catch (IllegalArgumentException e){
            assertEquals("No se puede dividir por cero.", e.getMessage());
        }
    }
}
