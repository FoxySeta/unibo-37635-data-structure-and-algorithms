package m2.c1_java.animali_astratta;

import java.time.Year;

public class Tacchino extends Animale {

    public Tacchino(String n) {
        super(n);
    }
    
    public Tacchino(String n, Year a) {
        super(n, a);
    }

    @Override
    public String verso() {
        return "Glo glo";
    }

    @Override
    public int zampe() {
        return 2;
    }
    
}
