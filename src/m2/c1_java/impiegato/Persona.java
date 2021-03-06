package m2.c1_java.impiegato;

import java.time.LocalDate;

public class Persona {
    
    public Persona(String n, LocalDate d) {
        nome = n;
        nascita = d;
    }
    
    @Override
    public String toString() {
        return nome + ", " + nascita;
    }

    public String getNome()  {
        return nome;
    }
    
    public void setNome(String n) {
        nome = n;
    }

    public LocalDate getNascita() {
        return nascita;
    }

    public void setNascita(LocalDate d) {
        nascita = d;
    }

    private String nome;
    private LocalDate nascita;
}
