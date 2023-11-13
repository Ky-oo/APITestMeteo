package Habits;

import java.util.ArrayList;

public class Pull {
    private ArrayList<String> pulls;

    public Pull(){
        pulls = new ArrayList<>();
        pulls.add("Pull col roulé");
        pulls.add("Pull épais");
        pulls.add("Pull sans manche");
        pulls.add("Gilet");
        pulls.add("Cardigan en laine");
        pulls.add("Pull en cachemire");
        pulls.add("Sweat à capuche");
        pulls.add("Pull à col en V");
    }

    public ArrayList<String> getPulls() {
        return pulls;
    }
}
