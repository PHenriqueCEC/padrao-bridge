package Exercito;

public class Coronel extends Patente {

    public Coronel(float soldo) {
        super(soldo);
    }

    public float calcularSoldo() {
        return this.soldo * (1.5f + this.cursoOperacional.percentualAumento());
    }



}
