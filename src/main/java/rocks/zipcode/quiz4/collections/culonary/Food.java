package rocks.zipcode.quiz4.collections.culonary;

import rocks.zipcode.quiz4.collections.WordCounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food implements Spice {

    ArrayList<Food> mp = new ArrayList<>();
    public List<Spice> getAllSpices() {
        ArrayList<Spice> lst = new ArrayList<>(mp);
        return lst;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {

        return null;
    }

    public void applySpice(Spice spice) {

    }
}
