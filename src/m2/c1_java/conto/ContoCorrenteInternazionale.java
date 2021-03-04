package m2.c1_java.conto;

public class ContoCorrenteInternazionale extends MioContoCorrente {
    
    public ContoCorrenteInternazionale() {
        super();
        valuta = Valuta.EURO;
    }
    
    public ContoCorrenteInternazionale(double inizializzatore) {
        super(inizializzatore);
        valuta = Valuta.EURO;
    }
    
    public ContoCorrenteInternazionale(Valuta moneta) {
        super();
        valuta = moneta;
    }

    public ContoCorrenteInternazionale(double inizializzatore, Valuta moneta) {
        super(inizializzatore);
        valuta = moneta;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - valuta: " + valuta;
    }

    final Valuta valuta;

}
