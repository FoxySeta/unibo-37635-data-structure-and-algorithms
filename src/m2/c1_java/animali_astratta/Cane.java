package m2.c1_java.animali_astratta;

import java.time.Year;

public class Cane extends Animale {

    public Cane(String n) {
        super(n);
    }
    
    public Cane(String n, Year a) {
        super(n, a);
    }

    @Override
    public String verso() {
        return "Bau";
    }

    @Override
    public int zampe() {
        return 4;
    }
    
}
