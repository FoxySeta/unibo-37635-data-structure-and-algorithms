package m2.c1_java.motore;

public class Metano extends Motore {
    
    public Metano(int c, int n) {
        super(c, n);
    }

    @Override
    public float coefficiente() {
        return 0.2f; // = 0.8 * 0.25
    }

}
