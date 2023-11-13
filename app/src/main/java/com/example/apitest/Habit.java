package com.example.apitest;

import java.util.Random;

import Habits.Chaussure;
import Habits.Pantalon;
import Habits.Pull;
import Habits.ShortCourt;
import Habits.Tshirt;
import Habits.Veste;

public class Habit {

    private String chaussure = "pas besoin";
    private String tshirt = "pas besoin";
    private String shortCourt = "pas besoin";
    private String pantalon = "pas besoin";
    private String pull = "pas besoin";
    private String veste = "pas besoin";


    public String getChaussure() {
        return chaussure;
    }

    public String getPantalon() {
        return pantalon;
    }

    public String getPull() {
        return pull;
    }

    public String getShortCourt() {
        return shortCourt;
    }

    public String getTshirt() {
        return tshirt;
    }

    public String getVeste() {
        return veste;
    }

    public String randomChaussure(){
        Chaussure chaussure1 = new Chaussure();
        Random random = new Random();
        int randomIndex = random.nextInt(chaussure1.getChaussures().size());
        chaussure = chaussure1.getChaussures().get(randomIndex);

        return chaussure;
    }

    public String randomTshirt(){
        Tshirt tshirt1 = new Tshirt();
        Random random = new Random();
        int randomIndex = random.nextInt(tshirt1.getTshirt().size());
        tshirt = tshirt1.getTshirt().get(randomIndex);

        return tshirt;
    }

    public String randomShortCourt(){
        ShortCourt shortCourt1 = new ShortCourt();
        Random random = new Random();
        int randomIndex = random.nextInt(shortCourt1.getShortCourt().size());
        shortCourt = shortCourt1.getShortCourt().get(randomIndex);

        return shortCourt;
    }

    public String randomPantalon(){
        Pantalon pantalon1 = new Pantalon();        Random random = new Random();
        int randomIndex = random.nextInt(pantalon1.getPantalons().size());
        pantalon = pantalon1.getPantalons().get(randomIndex);
        return pantalon;
    }

    public String randomPull(){
        Pull pull1 = new Pull();
        Random random = new Random();
        int randomIndex = random.nextInt(pull1.getPulls().size());
        pull = pull1.getPulls().get(randomIndex);
        return pull;
    }

    public String randomVeste(){
        Veste veste1 = new Veste();
        Random random = new Random();
        int randomIndex = random.nextInt(veste1.getVestes().size());
        veste = veste1.getVestes().get(randomIndex);
        return veste;
    }

    public void habitEnFonctionTemperature(Double temperatureActuel) {

        if (temperatureActuel >= 25) {

            this.tshirt = randomTshirt();
            this.shortCourt = randomShortCourt();
            this.chaussure = randomChaussure();
            this.pull = "pas besoin";
            this.veste = "pas besoin";
            this.pantalon = "pas besoin";

        } else if (temperatureActuel >= 15 && temperatureActuel <= 25) {

            this.tshirt = randomTshirt();
            this.pull = randomPull();
            this.pantalon = randomPantalon();
            this.chaussure = randomChaussure();
            this.shortCourt = "pas besoin";
            this.veste = "pas besoin";

        } else {
            this.tshirt = randomTshirt();
            this.pull = randomPull();
            this.veste = randomVeste();
            this.pantalon = randomPantalon();
            this.chaussure = randomChaussure();

        }

    }

}
