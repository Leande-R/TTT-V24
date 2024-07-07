import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ttt.TicTacToe;

public class TicTacToeTest {
    private TicTacToe game;

    @Before
    public void setUp() {
        game = new TicTacToe();
    }

    @Test
    public void testSwitchCurrentPlayer() {
        assertEquals('X', game.currentPlayer.getMarker());
        game.switchCurrentPlayer();
        assertEquals('O', game.currentPlayer.getMarker());
    }
    @Test
    public void testStartGameAndMakeMove() {
    }
}
