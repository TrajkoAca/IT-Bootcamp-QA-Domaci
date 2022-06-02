package Nedelja7Sreda;

import java.util.ArrayList;

public class SastojakRecepta extends Sastojak{

    private double kolicina;

    public SastojakRecepta(String naziv, double cena, double kolicina) {
        super(naziv, cena);
        this.kolicina = kolicina;
    }

    public SastojakRecepta(String naziv, double kolicina) {
        super(naziv);
        this.kolicina = kolicina;
    }

    public SastojakRecepta(String naziv) {
        super(naziv);
    }

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }

    public double ukupnaCena () {
        return super.getCena() * this.kolicina;
    }

}
