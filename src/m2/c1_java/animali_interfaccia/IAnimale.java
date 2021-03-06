package m2.c1_java.animali_interfaccia;

public interface IAnimale extends Comparable<IAnimale> {

    public String verso();
    
    public int zampe();

    public int anni();
}
