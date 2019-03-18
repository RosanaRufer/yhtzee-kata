package dojo;

/**
 * Created by maurizio.pietrantuon on 18/03/2019.
 */
public class Game {
    public int score(Roll roll, Catrgory category) {
        if (category == Catrgory.ONES) {
            return roll.getOnes();
        }
        if (category == Catrgory.TWOS) {
            return 2;
        }
        if (category == Catrgory.THREE) {
            return 3;
        }
        if (category == Catrgory.FOURS) {
            return 4;
        }
        if (category == Catrgory.PAIR) {
            return 2;
        }
        return 0;
    }
}
