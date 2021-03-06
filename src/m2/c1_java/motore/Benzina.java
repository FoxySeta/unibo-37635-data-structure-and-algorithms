package m2.c1_java.motore;

public class Benzina extends Motore {
    
    public Benzina(int c, int n) {
        super(c, n);
    }

    @Override
    public float coefficiente() {
        return 0.1f;
    }

}
