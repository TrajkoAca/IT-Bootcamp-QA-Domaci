package Nedelja7Sreda;

import java.util.ArrayList;

public class Recept {

    private String nazivRecepta;
    private int tezina;
    private ArrayList<SastojakRecepta> sastojci;


    public Recept(String nazivRecepta, int tezina, ArrayList<SastojakRecepta> sastojci) {
        this.nazivRecepta = nazivRecepta;
        this.tezina = tezina;
        this.sastojci = sastojci;
    }

    public String getNazivRecepta() {
        return nazivRecepta;
    }

    public void setNazivRecepta(String nazivRecepta) {
        this.nazivRecepta = nazivRecepta;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }

    public ArrayList<SastojakRecepta> getSastojci() {
        return sastojci;
    }

    public void setSastojci(ArrayList<SastojakRecepta> sastojci) {
        this.sastojci = sastojci;
    }

    public void dodajSastojak(SastojakRecepta sastojak) {
        sastojci.add(sastojak);
    }

    public void dodajSastojak(SastojakRecepta sastojak, int i) {
        this.sastojci.add(i, sastojak);
    }

    public boolean istiSastojci(SastojakRecepta sas1, SastojakRecepta sas2) {
        return sas1.getNaziv().equals(sas2.getNaziv()) && sas1.getCena() == sas2.getCena() && sas1.getKolicina() == sas2.getKolicina();
    }

    public void izbrisiSastojak(SastojakRecepta s) {
        for (int i = 0; i < sastojci.size(); i++) {
            SastojakRecepta trenutni = sastojci.get(i);
            if (istiSastojci(s, trenutni)) {
                sastojci.remove(i);
            }
        }
    }

    public String tezinaRecepta() {
        switch (tezina) {
            case 1:
                return "Pocetni nivo.";
            case 2:
                return ("Lak.");
            case 3:
                return "Srednje tezine.";
            case 4:
                return "Tezak.";
            case 5:
                return "Majstorski.";
        }
        return "";
    }

    public double ukupnaCenaRecepta() {
        double suma = 0;
        for (int i = 0; i < sastojci.size(); i++) {
            suma += suma + sastojci.get(i).ukupnaCena();
        }
        return suma;
    }

    @Override
    public String toString() {
        StringBuilder ispisRecepta = new StringBuilder();
        ispisRecepta.append(nazivRecepta).append(":\n");
        ispisRecepta.append("Tezina: ").append(tezinaRecepta()).append("\n");
        ispisRecepta.append("Sastojci: ").append("\n");
        for (int i = 0; i < sastojci.size(); i++) {
            ispisRecepta.append(sastojci.get(i).getNaziv()).append("\n");
        }
        return ispisRecepta.toString();
    }
}
