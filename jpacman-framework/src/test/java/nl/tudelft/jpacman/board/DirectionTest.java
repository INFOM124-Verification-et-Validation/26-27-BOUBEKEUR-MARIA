package nl.tudelft.jpacman.board;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectionTest {
    @Test
    void northTest() {
        assertEquals(0, Direction.NORTH.getDeltaX());
        assertEquals(-1, Direction.NORTH.getDeltaY());
    }
    @Test
    void southTest() {
        assertEquals(0, Direction.SOUTH.getDeltaX());
        assertEquals(1, Direction.SOUTH.getDeltaY());
    }
    @Test
    void westTest() {
        assertEquals(-1, Direction.WEST.getDeltaX());
        assertEquals(0, Direction.WEST.getDeltaY());
    }
    @Test
    void eastTest() {
        assertEquals(1, Direction.EAST.getDeltaX());
        assertEquals(0, Direction.EAST.getDeltaY());
    }



}
