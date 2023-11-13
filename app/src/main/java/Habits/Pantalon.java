package Habits;

import java.util.ArrayList;

public class Pantalon {

    private ArrayList<String> pantalons;

    public Pantalon(){
        pantalons = new ArrayList<>();
        pantalons.add("Jean");
        pantalons.add("Jogging");
        pantalons.add("Jogging Lacost");
        pantalons.add("Pantalon patte d'éléph");
        pantalons.add("survêtement");
        pantalons.add("Pantalon en cuir");
        pantalons.add("Pantalon cargo");
    }

    public ArrayList<String> getPantalons() {
        return pantalons;
    }
}
