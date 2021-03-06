package m2.c1_java.motore;

public class Diesel extends Motore {
    
    public Diesel(int c, int n) {
        super(c, n);
    }

    @Override
    public float coefficiente() {
        return 0.2f;
    }

}
