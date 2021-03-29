package m1.c2_ordinamento;

/**
 * ● Il problema della bandiera nazionale. Supponiamo di avere un array A[1..n]
 * di elementi che possono assumere solo tre valori: bianco, verde e rosso.
 * Ordinare l'array in modo che tutti gli elementi verdi siano a sinistra,
 * quelli bianchi al centro e quelli rossi a destra. ● L'algoritmo DEVE
 * richiedere tempo O(n) e memoria aggiuntiva O(1). Può confrontare ed
 * eventualmente scambiare tra loro elementi, e NON DEVE fare uso di ulteriori
 * array di appoggio, né usare contatori per tenere traccia del numero di
 * elementi di un certo colore ● L'algoritmo DEVE richiedere una singola
 * scansione dell'array.
 *
 * Università di Bologna Corso di laurea in Informatica 37635 - Algoritmi e
 * strutture di dati 23/02/2021
 *
 * @author Stefano Volpe #969766
 */
public class Bandiera {

  /**
   * Testa la soluzione per il problema proposto.
   *
   * @param args Sequenza di nomi di istanze di {@link Colore}.
   * @author Stefano Volpe #969766
   */
  public static void main(String[] args) throws IllegalArgumentException {
    Colore[] colori = new Colore[args.length];
    for (int i = 0; i < args.length; ++i)
      colori[i] = Colore.valueOf(args[i]);
    bandiera(colori);
    for (Colore c : colori)
      System.out.println(c);
  }

  /**
   * Risolve il problema proposto. Rispetta i vincoli di efficienza richiesti.
   * 
   * @param v Dati in ingresso.
   * @author Stefano Volpe #969766
   */
  public static void bandiera(Colore[] v) {
    int verdebianco = 0, biancorosso = v.length - 1;
    for (int i = 0; i < biancorosso;)
      switch (v[i]) {
      case VERDE:
        Colore t = v[i];
        v[i++] = v[verdebianco];
        v[verdebianco++] = t;
        break;
      case BIANCO:
        ++i;
        break;
      case ROSSO:
        Colore u = v[i];
        v[i] = v[biancorosso];
        v[biancorosso--] = u;
      }
  }

}

enum Colore {
  VERDE, BIANCO, ROSSO
}
