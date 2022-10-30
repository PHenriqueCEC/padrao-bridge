package Exercito;

public abstract class Patente {
    protected CursoOperacional cursoOperacional;
    protected float soldo;

    public Patente(float soldo) {
        this.soldo = soldo;
    }

    public void setCursoOperacional(CursoOperacional cursoOperacional) {
        this.cursoOperacional = cursoOperacional;
    }

    public void setSoldo(float soldo) {
        this.soldo = soldo;
    }


}