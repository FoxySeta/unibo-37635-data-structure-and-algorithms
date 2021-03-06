package m2.c1_java.animali_interfaccia;

import java.time.Year;

public class Tacchino implements IAnimale {

    public Tacchino(String n) {
        nome = n;
        nascita = Year.now();
    }
    
    public Tacchino(String n, Year a) {
        nome = n;
        nascita = a;
    }

    @Override
    public String toString() {
        return nome + ": \"" + verso() + "!\", " +
               zampe() + " zampe, " + anni() + " anni";
    }

    @Override
    public int compareTo(IAnimale a) {
        return anni() - a.anni();
    }

    public int anni() {
        return Year.now().getValue() - nascita.getValue();
    }

    @Override
    public String verso() {
        return "Glo glo";
    }

    @Override
    public int zampe() {
        return 2;
    }
    
    private String nome;
    private Year nascita;
}
