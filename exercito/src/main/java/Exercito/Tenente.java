package Exercito;

public class Tenente extends Patente {

    public Tenente(float soldo) {
        super(soldo);
    }

    public float calcularSoldo() {
        return this.soldo * (1.3f + this.cursoOperacional.percentualAumento());
    }


}
