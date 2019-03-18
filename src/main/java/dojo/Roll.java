package dojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by maurizio.pietrantuon on 18/03/2019.
 */
public class Roll {
    private HashMap<Integer, Integer> dices = new HashMap<>();

    public Roll(int value1, int value2, int value3, int value4, int value5) {
        addValue(value1);
        addValue(value2);
        addValue(value3);
        addValue(value4);
        addValue(value5);
    }

    private void addValue(int value1) {
        if(dices.containsKey(value1)){
            dices.put(value1, dices.get(value1)+1);
        } else {
            dices.put(value1, 1);
        }
    }

    public Integer getOnes() {
        return dices.get(1);
    }
}
