package dojo;

import org.junit.Before;
import org.junit.Test;

public class Tests {
    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void ones() {
        Roll roll = new Roll(1, 2, 3, 4, 5);
        assert (game.score(roll, Catrgory.ONES) == 1);
    }

    @Test
    public void twos() {
        Roll roll = new Roll(1, 2, 3, 4, 5);
        assert (game.score(roll, Catrgory.TWOS) == 2);
    }

    @Test
    public void threes() throws Exception {
        Roll roll = new Roll(1, 2, 3, 4, 5);
        assert (game.score(roll, Catrgory.ONES) == 1);
    }
}
