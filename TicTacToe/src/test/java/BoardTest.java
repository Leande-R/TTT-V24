import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ttt.Board;

public class BoardTest {
    private Board board;

    @Before
    public void setUp() {
        board = new Board();
    }

    @Test
    public void testIsCellEmpty() {
        assertTrue(board.isCellEmpty(0, 0));
        board.place(0, 0, 'X');
        assertFalse(board.isCellEmpty(0, 0));
    }

    @Test
    public void testPlace() {
        board.place(1, 1, 'O');
        assertFalse(board.isCellEmpty(1, 1));
        assertEquals('O', board.cells[1][1]);
    }

    @Test
    public void testClear() {
        board.place(0, 0, 'X');
        board.clear();
        assertTrue(board.isCellEmpty(0, 0));
    }

    @Test
    public void testPrint() {
        // Da dies die Konsole ausgibt, kann man es nicht einfach testen,
        // aber man kann überprüfen, ob keine Ausnahme ausgelöst wird.
        board.print();
    }
}
