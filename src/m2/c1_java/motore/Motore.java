package m2.c1_java.motore;

public abstract class Motore {
    
    public Motore(int cilindrata, int numeroCilindri) {
        potenza = (int)(cilindrata / numeroCilindri * coefficiente());
    }
    
    public final int potenza;
    
    abstract protected float coefficiente();
}
