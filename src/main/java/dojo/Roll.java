package dojo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by maurizio.pietrantuon on 18/03/2019.
 */
public class Roll {
    private List<Integer> dices = new ArrayList<>(5);

    public Roll(int value1, int value2, int value3, int value4, int value5) {
        dices.add(value1);
        dices.add(value2);
        dices.add(value3);
        dices.add(value4);
        dices.add(value5);
    }

    public Stream<Integer> getOnes() {
        return dices.stream().filter(i -> i == 1);
    }
}
