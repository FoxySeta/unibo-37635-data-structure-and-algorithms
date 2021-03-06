package m2.c1_java.impiegato;

import java.time.LocalDate;

public class Stagista extends Impiegato {
    
    public Stagista(String n, LocalDate d, float s, int id) {
        super(n, d, s);
        presenze = 0;
        stage = id;
    }
    
    public Stagista(String n, LocalDate d, float s, int id, int p) {
        super(n, d, s);
        presenze = p;
        stage = id;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + presenze + "h, #" + stage;
    }

    public int getPresenze() {
        return presenze;
    }
    
    public void setPresenze(int p) {
        presenze = p;
    }
    
    public int getStage() {
        return stage;
    }
    
    public void setStage(int id) {
        stage = id;
    }

    private int presenze, stage;
}
