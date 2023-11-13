package Habits;

import java.util.ArrayList;

public class Chaussure {

    private ArrayList<String> chaussures;

    public Chaussure() {
        chaussures = new ArrayList<>();
        chaussures.add("Tong");
        chaussures.add("Tn");
        chaussures.add("Mocassins");
        chaussures.add("Air force 1");
        chaussures.add("Claquette");
        chaussures.add("Bottes");
        chaussures.add("Sandales");
    }

    public ArrayList<String> getChaussures() {
        return chaussures;
    }
}
