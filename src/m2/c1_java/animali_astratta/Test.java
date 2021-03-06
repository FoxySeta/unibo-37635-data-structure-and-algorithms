package m2.c1_java.animali_astratta;

import java.time.Year;

/**
 * Implementare le classi Java necessarie a modellare questa situazione:
 * • Ogni animale fa un verso e ha un certo numero di zampe:
 *   • Il gatto ha 4 zampe e miagola
 *   • Il cane ha 4 zampe e abbaia
 *   • Il tacchino ha 2 zampe e goglotta
 * • Ogni esemplare di animale ha un nome e un anno di nascita. Per semplicità
 *   si tiene traccia solo degli anni e l’età si calcola come il numero di anni
 *   trascorsi dalla data corrente
 * Definire una classe astratta Animale e le sottoclassi concrete, implementando
 * opportunamente i metodi per recuperare: verso dell’animale (stringa), numero
 * di zampe (intero), ed età (intero). Sovrascrivere il metodo toString() per
 * combinare queste informazioni in una stringa.
 * Nota: vedi java.time e java.util.Date per gestire le date.
 * Implementare inoltre il metodo confronta(Animale a)che permette di
 * confrontare un animale con un altro (anche di specie diversa) in base alla
 * loro età in anni.
 * Creare infine una classe test nel cui metodo main() sono istanziati alcuni
 * animali e verificato il funzionamento dei metodi precedenti.
 *
 * Università di Bologna
 * Corso di laurea in Informatica
 * 37635 - Algoritmi e strutture di dati
 * 06/03/2021
 *
 * @author Stefano Volpe #969766
*/
public class Test {
  
    public static void main(String args[]) {
        final Animale a1 = new Cane("Fuffi", Year.of(2012)),
                      a2 = new Tacchino("Concetta");
        System.out.println(a1 + " - " + a2 + " = " + a1.compareTo(a2));
    }
}
