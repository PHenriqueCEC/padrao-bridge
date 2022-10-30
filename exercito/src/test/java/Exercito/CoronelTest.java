package Exercito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoronelTest {

    @Test
    void deveRetornarSalarioCoronelComSelva() {
        CursoOperacional cursoOperacional = new Selva();
        Coronel coronel = new Coronel(1000.0f);
        coronel.setCursoOperacional(cursoOperacional);
        assertEquals(1800.0f, coronel.calcularSoldo(), 0.30f);
    }

    @Test
    void deveRetornarSalarioCoronelComCaatinga() {
        CursoOperacional cursoOperacional = new Caatinga();
        Coronel coronel = new Coronel(1000.0f);
        coronel.setCursoOperacional(cursoOperacional);
        assertEquals(1700.0f, coronel.calcularSoldo(), 0.20f);
    }

    @Test
    void deveRetornarSalarioCoronelComParaquedista() {
        CursoOperacional cursoOperacional = new Paraquedista();
        Coronel coronel = new Coronel(1000.0f);
        coronel.setCursoOperacional(cursoOperacional);
        assertEquals(1600.0f, coronel.calcularSoldo(), 0.10f);
    }

}
