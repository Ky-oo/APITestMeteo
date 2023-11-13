package Habits;

import java.util.ArrayList;

public class Veste {

    private ArrayList<String> vestes;

    public Veste(){
        vestes = new ArrayList<>();
        vestes.add("Parka");
        vestes.add("Veste sans manche");
        vestes.add("Veste de costume");
        vestes.add("Doudoune");
        vestes.add("Blouson en cuir");
        vestes.add("Manteau en laine");
        vestes.add("Veste en jean");
        vestes.add("Blazer");
    }

    public ArrayList<String> getVestes() {
        return vestes;
    }
}
