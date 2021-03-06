package m2.c1_java.animali_astratta;

import java.time.Year;

public abstract class Animale implements Comparable<Animale> {
    
    public Animale(String n) {
        nome = n;
        nascita = Year.now();
    }

    public Animale(String n, Year a) {
        nome = n;
        nascita = a;
    }
    
    @Override
    public String toString() {
        return nome + ": \"" + verso() + "!\", " +
               zampe() + " zampe, " + anni() + " anni";
    }

    @Override
    public int compareTo(Animale a) {
        return anni() - a.anni();
    }

    public int anni() {
        return Year.now().getValue() - nascita.getValue();
    }

    abstract public String verso();
    
    abstract public int zampe();

    private String nome;
    private Year nascita;
}
