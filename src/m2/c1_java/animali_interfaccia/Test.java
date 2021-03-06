package m2.c1_java.animali_interfaccia;

import java.time.Year;

/**
 * Definire il comportamento di un animale (verso e numero di zampe) tramite
 * un’interfaccia IAnimale. 
 * Modificare le classi precedenti per usare l’interfaccia IAnimale piuttosto
 * che la classe astratta Animale. 
 * Nota: la modellazione con classe astratta è più corretta e da preferire in
 * casi come questo.
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
    final IAnimale a1 = new Cane("Fuffi", Year.of(2012)),
           a2 = new Tacchino("Concetta");
    System.out.println(a1 + " - " + a2 + " = " + a1.compareTo(a2));
  }
}