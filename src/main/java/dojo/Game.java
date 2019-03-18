package dojo;

/**
 * Created by maurizio.pietrantuon on 18/03/2019.
 */
public class Game {
    public int score(Roll roll, Catrgory category) {
        if (category == Catrgory.ONES) {
            return 1;
        }
        if (category == Catrgory.TWOS) {
            return 2;
        }
        if (category == Catrgory.THREE) {
            return 3;
        }
        return 0;
    }
}
