package m2.c1_java.impiegato;

import java.time.LocalDate;

/**
 * Creare una classe Persona con le variabili di istanza: nome (stringa) e data
 * di nascita (vedi java.time e java.util.Date). 
 * Creare una sottoclasse Impiegato che ha le seguenti variabili di istanza:
 * nome e data di nascita (ereditati) e stipendio. 
 * Definire costruttori e metodi set e get per le variabili di istanza, per
 * entrambe le classi Persona e Impiegato. 
 * Costruire una sottoclasse di Impiegato, chiamata Stagista, che contiene due
 * variabili di istanza entrambe di tipo intero: numeroPresenze, che registra
 * il numero di ore di presenza, e numeroIdentificativoStage.
 * Definire costruttore e metodi set e get per le variabili di istanza. 
 * Implementare una classe ImpiegatiDemo e nel metodo main() creare tre oggetti
 * di tipo Impiegato, di cui almeno uno stagista, e memorizzarli in un array. 
 * Aggiungere un metodo cercaGiovane che prende in input un vettore di
 * impiegati e ritorna l’impiegato più giovane. Invocare il metodo sul vettore
 * precedente e stampare le informazioni relative all’impiegato trovato.
 *
 * Università di Bologna
 * Corso di laurea in Informatica
 * 37635 - Algoritmi e strutture di dati
 * 06/03/2021
 *
 * @author Stefano Volpe #969766
*/
public class ImpiegatiDemo {

    public static void main(String args[]) {
        Impiegato[] impiegati = {
            new Impiegato("Tizio", LocalDate.of(1984, 02, 11), 1200),
            new Stagista("Caio", LocalDate.of(2001, 03, 01), 400, 1),
            new Impiegato("Sempronio", LocalDate.of(1990, 9, 22), 1300)
        };
        System.out.println(Impiegato.cercaGiovane(impiegati).toString());
    }
}
