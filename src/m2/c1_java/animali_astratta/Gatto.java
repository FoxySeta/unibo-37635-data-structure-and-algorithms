package m2.c1_java.animali_astratta;

import java.time.Year;

public class Gatto extends Animale {

    public Gatto(String n) {
        super(n);
    }
    
    public Gatto(String n, Year a) {
        super(n, a);
    }

    @Override
    public String verso() {
        return "Miao";
    }

    @Override
    public int zampe() {
        return 4;
    }
    
}
