package Habits;

import java.util.ArrayList;

public class Tshirt {

    private ArrayList<String> tshirt;

    public Tshirt(){
        tshirt = new ArrayList<>();
        tshirt.add("Tshirt sans manche");
        tshirt.add("Tshirt manche longue");
        tshirt.add("Tshirt Lacoste");
        tshirt.add("T-shirt à rayures");
        tshirt.add("T-shirt graphique");
        tshirt.add("T-shirt à col en V");
        tshirt.add("T-shirt imprimé");
    }

    public ArrayList<String> getTshirt() {
        return tshirt;
    }
}
