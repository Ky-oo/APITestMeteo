package Habits;

import java.util.ArrayList;

public class ShortCourt {

    private ArrayList<String> shortCourt;

    public ShortCourt(){
        shortCourt = new ArrayList<>();
        shortCourt.add("Short");
        shortCourt.add("Pentacourt");
        shortCourt.add("Short trouée");
        shortCourt.add("Kilt");
        shortCourt.add("Short de bain");
        shortCourt.add("Short en jean");
        shortCourt.add("Short en toile");
        shortCourt.add("Short de sport");
    }

    public ArrayList<String> getShortCourt() {
        return shortCourt;
    }
}
