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
        assert (game.score(roll, Catrgory.THREE) == 3);
    }

    @Test
    public void fours() throws Exception {
        Roll roll = new Roll(1, 2, 3, 4, 5);
        assert (game.score(roll, Catrgory.FOURS) == 4);
    }

    @Test
    public void multiple_ones() throws Exception {
        Roll roll = new Roll(1, 1, 3, 4, 5);
        assert (game.score(roll, Catrgory.ONES) == 2);
    }

    @Test
    public void pair() throws Exception {
        Roll roll = new Roll(1, 1, 3, 4, 5);
        assert (game.score(roll, Catrgory.PAIR) == 2);
    }
}
