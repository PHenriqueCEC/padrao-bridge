package Exercito;

public class Sargento extends Patente {

    public Sargento(float soldo) {
        super(soldo);
    }

    public float calcularSoldo() {
        return this.soldo * (1.0f + this.cursoOperacional.percentualAumento());
    }
}
