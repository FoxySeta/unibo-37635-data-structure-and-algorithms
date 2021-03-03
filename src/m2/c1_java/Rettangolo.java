package m2.c1_java;

/**
 * • Esercizio: definire una classe Java per descrivere un
 *  rettangolo, che ha una larghezza e un’altezza (per
 *  semplicità, valori interi) e del quale si vuole poter
 *  calcolare perimetro e area.
 *
 * Università di Bologna
 * Corso di laurea in Informatica
 * 37635 - Algoritmi e strutture di dati
 * 03/03/2021
 *
 * @author Stefano Volpe #969766
*/
public class Rettangolo {

    /**
     * Costruisce un rettangolo date le dimensioni.
     *
     * @param l Base del rettangolo.
     * @param h Base del rettangolo.
     * @author Stefano Volpe #969766
     */
    public Rettangolo(int l, int h) {
        this.area = l * h;
        this.perimetro = (l + h) * 2;
    }

    /**
     * Restituisce il perimtero del rettangolo.
     *
     * @return Perimetro del rettangolo.
     */
    public int getPerimetro() {
        return this.perimetro;
    }

    /**
     * Restituisce l'area del rettangolo.
     * 
     * @return Area del rettangolo.
     */
    public int getArea() {
        return this.area;
    }

    /** Perimetro del rettangolo. */
    private int perimetro;
    /** Area del rettangolo. */
    private int area;
}