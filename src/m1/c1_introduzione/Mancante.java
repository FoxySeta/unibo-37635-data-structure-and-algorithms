package m1.c1_introduzione;

/**
 * ● È dato un array A[1..n-1] contenente una permutazione degli interi da 1 a n
 * (estremi inclusi) a cui è stato tolto un elemento; i valori in A possono
 * comparire in un ordine qualsiasi – Es: A = [1, 3, 4, 5] è una permutazione di
 * 1..5 a cui è stato tolto il numero 2 – Es: A = [7, 1, 3, 5, 4, 2] è una
 * permutazione di 1..7 a cui è stato tolto il numero 6 ● Scrivere un algoritmo
 * che dato l'array A[1..n-1], individua il valore nell'intervallo 1..n che non
 * compare in A.
 *
 * Università di Bologna
 * Corso di laurea in Informatica
 * 37635 - Algoritmi e strutture di dati
 * 23/02/2021
 *
 * @author Stefano Volpe #969766
 */
public class Mancante {

    /**
     * Testa la soluzione per il problema proposto.
     * 
     * @param args Vettore A per un'istanza del problema
     * @author Stefano Volpe #969766
     */
    public static void main(String[] args) {
        System.out.println(mancante(
            java.util.Arrays.stream(args)
            .<Integer>map(s -> Integer.parseInt(s)).toArray(Integer[]::new)
        ));
    }
    
    /**
     * Risolve il problema proposto. Opera in tempo O(<code>A.length</code>) e
     * in spazio O(1).
     * @param A Dati in ingresso. Rispettano le precondizioni del problema.
     * @return La soluzione all'istanza del problema.
     * @author Stefano Volpe #969766
     */
    public static Integer mancante(Integer[] A) {
        final Integer nm1 = A.length;
        Integer s = (nm1 + 1) * (nm1 + 2) / 2;
        for (Integer i = 0; i < nm1; ++i)
            s -= A[i];
        return s;
    }

}