package Exercito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SargentoTest {
    @Test
    void deveRetornarSalarioSargentoComSelva() {
        CursoOperacional cursoOperacional = new Selva();
        Sargento sargento = new Sargento(1000.0f);
        sargento.setCursoOperacional(cursoOperacional);
        assertEquals(1300.0f, sargento.calcularSoldo(), 0.30f);
    }

    @Test
    void deveRetornarSalarioSargentoComCaatinga() {
        CursoOperacional cursoOperacional = new Caatinga();
        Sargento sargento = new Sargento(1000.0f);
        sargento.setCursoOperacional(cursoOperacional);
        assertEquals(1200.0f, sargento.calcularSoldo(), 0.20f);
    }

    @Test
    void deveRetornarSalarioSargentoComParaquedista() {
        CursoOperacional cursoOperacional = new Paraquedista();
        Sargento sargento = new Sargento(1000.0f);
        sargento.setCursoOperacional(cursoOperacional);
        assertEquals(1100.0f, sargento.calcularSoldo(), 0.10f);
    }
}
