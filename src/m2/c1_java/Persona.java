package m2.c1_java;

/**
 * Rappresenta una cittadinanza.
 *
 * @author Stefano Volpe #969766
 */
enum Cittadinanza {
    Italiana,
    EU,
    ExtraEU;
}

/**
 * • Implementare in Java una classe Persona, caratterizzata
 *   da: nome, cognome e cittadinanza, dove la cittadinanza
 *   può essere scelta tra ‘Italiana’, ‘EU’, ‘ExtraEU’.
 * • La cittadinanza deve essere implementata tramite
 *   l’enumerazione Cittadinanza.
 * • La classe Persona implementa due metodi
 * • costruttore
 * • getInfo(): ritorna una stringa di informazioni, ad es.
 *   “Mi chiamo Mario Rossi e ho cittadinanza EU”
 *
 * Università di Bologna
 * Corso di laurea in Informatica
 * 37635 - Algoritmi e strutture di dati
 * 03/03/2021
 *
 * @author Stefano Volpe #969766
*/
public class Persona {

    /**
     * Costruisce una Persona prendendone in ingresso i campi.
     *
     * @param nome
     * @param cittadinanza
     * @author Stefano Volpe #969766
     */
    public Persona(String nome, Cittadinanza cittadinanza) {
        this.nome = nome;
        this.cittadinanza = cittadinanza;
    }
    
    /**
     * Costruisce una Persona usando un valore di cittadinanza predefinito.
     *
     * @param nome
     * @author Stefano Volpe #969766
     */
    public Persona(String nome) {
        this.nome = nome;
        cittadinanza = Cittadinanza.Italiana;
    }

    /**
     * Descrive questa istanza di Persona.
     * 
     * @return Rappresentazione sotto forma di String dell'istanza.
     * @author Stefano Volpe #969766
     */
    public String getInfo() {
        return "Mi chiamo " + nome + " e ho cittadinanza " + cittadinanza;
    }

    /**
     * Testa la classe.
     *
     * @param args Non considerati dal metodo.
     * @author Stefano Volpe #969766
     */
    public static void main(String[] args) {
        System.out.println(
            (new Persona("Mario Rossi")).getInfo()
        );
    }

    /** Nome e cognome. */
    private String nome;
    /** Cittadinanza della Persona. */
    private Cittadinanza cittadinanza;

}