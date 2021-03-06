package m2.c1_java.impiegato;

import java.time.LocalDate;

public class Impiegato extends Persona {
    
    public Impiegato(String n, LocalDate d, float s) {
        super(n, d);
        stipendio = s;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + stipendio + "$";
    }
    
    public float getStipendio() {
        return stipendio;
    }
    
    public void setStipendio(float s) {
        stipendio = s;
    }

    public static Impiegato cercaGiovane(Impiegato[] impiegati) {
        if (impiegati.length == 0)
            return null;
        Impiegato res = impiegati[0];
        for (int i = 1; i < impiegati.length; ++i)
            if (impiegati[i].getNascita().compareTo(res.getNascita()) > 0)
                res = impiegati[i];
        return res;
    }

    private float stipendio;    
}
