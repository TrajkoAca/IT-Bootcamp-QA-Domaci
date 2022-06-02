package Nedelja7Sreda;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        SastojakRecepta jaje = new SastojakRecepta("Jaje", 12.5);
        SastojakRecepta mleko = new SastojakRecepta("Mleko", 0.12);
        SastojakRecepta brasno = new SastojakRecepta("Brasno", 0.075);
        SastojakRecepta spagete = new SastojakRecepta("Spagete", 0.24);
        SastojakRecepta pavlakaZaKuvanje = new SastojakRecepta("Pavlaka za kuvanje", 0.36);
        SastojakRecepta beliLuk = new SastojakRecepta("Beli luk", 0.7);
        SastojakRecepta cureceMeso = new SastojakRecepta("Curece meso", 0.8);
        SastojakRecepta maslac = new SastojakRecepta("Maslac", 1.4);
        SastojakRecepta jaja = new SastojakRecepta("Jaja", 12.5);
        SastojakRecepta biber = new SastojakRecepta("Biber", 0.7);
        SastojakRecepta so = new SastojakRecepta("So", 0.08);

        ArrayList<SastojakRecepta> sastojci = new ArrayList<>();
        sastojci.add(pavlakaZaKuvanje);
        sastojci.add(spagete);
        sastojci.add(beliLuk);
        sastojci.add(cureceMeso);
        sastojci.add(maslac);
        sastojci.add(jaja);
        sastojci.add(biber);
        sastojci.add(so);
        sastojci.remove(so);
        Recept rec = new Recept("Bele spagete", 4, sastojci);
        System.out.println(rec);





    }
}
