package m2.c1_java.conto;

public class MioContoCorrente implements ContoCorrente {
    
    public MioContoCorrente() {
        saldo = 0.0;
    }

    public MioContoCorrente(double inizializzatore) {
        saldo = inizializzatore;
    }

    public String toString() {
        return super.toString() + " - saldo: " + saldo;
    }

	@Override
	public double versa(double versamento) {
		if ((saldo += versamento) < 0.0)
            saldo = 0.0;
        return saldo;
	}

	@Override
	public double prelieva(double prelievo) {
		if ((saldo -= prelievo) < 0.0)
            saldo = 0.0;
        return saldo;
	}
    
    private double saldo;

}
