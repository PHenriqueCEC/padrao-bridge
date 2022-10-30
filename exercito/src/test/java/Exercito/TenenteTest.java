package Exercito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TenenteTest {

    @Test
    void deveRetornarSalarioTenenteComSelva() {
        CursoOperacional cursoOperacional = new Selva();
        Tenente tenente = new Tenente(1000.0f);
        tenente.setCursoOperacional(cursoOperacional);
        assertEquals(1600.0f, tenente.calcularSoldo(), 0.30f);
    }

    @Test
    void deveRetornarSalarioTeneteComCaatinga() {
        CursoOperacional cursoOperacional = new Caatinga();
        Tenente tenente = new Tenente(1000.0f);
        tenente.setCursoOperacional(cursoOperacional);
        assertEquals(1500.0f, tenente.calcularSoldo(), 0.20f);
    }

    @Test
    void deveRetornarSalarioTenenteComParaquedista() {
        CursoOperacional cursoOperacional = new Paraquedista();
        Tenente tenente = new Tenente(1000.0f);
        tenente.setCursoOperacional(cursoOperacional);
        assertEquals(1400.0f, tenente.calcularSoldo(), 0.10f);
    }
}
