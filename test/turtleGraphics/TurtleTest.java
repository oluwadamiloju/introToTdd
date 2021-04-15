package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

public class TurtleTest {
    Pen pen;
    Pen secondPen;
    Turtle ijapa;

    @BeforeEach
    void startAllTestsWithThis() {
        pen = new Pen();
        secondPen = new Pen();
        ijapa = new Turtle(pen);
    }

    @Test
    void  turtleHasAPenTest() {
        assertNotNull(ijapa.getPen());
        assertEquals(pen, ijapa.getPen());
        assertNotEquals(secondPen, ijapa.getPen());
    }

    @Test
    void turtleCanMovePenUp() {
        //when
        ijapa.movePenUp();

        assertTrue(ijapa.isPenUp());
    }

    @Test
    void turtleCanMovePenDown() {
        assertTrue(ijapa.isPenUp());
        //when
        ijapa.movePenDown();
        //assert
        assertFalse(ijapa.isPenUp());
    }

    @Test
    void turtleCanTurnRightWhileFacingEast() {
        //given
        assertSame(EAST, ijapa.getCurrentDirection());

        //when
        ijapa.turnRight();

        //assert
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingSouth() {
        //given
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());

        //when
        ijapa.turnRight();

        //assert
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingWest() {
        //given
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());

        //when
        ijapa.turnRight();

        //assert
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingNorth() {
        //given
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());

        //when
        ijapa.turnRight();

        //assert
        assertSame(EAST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanMoveForwardFacingEast() {
        assertSame(EAST, ijapa.getCurrentDirection());
        //when
        ijapa.moveForwardBy(5);

        //assert
        assertEquals(new Position(0,5), ijapa.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardFacingSouth() {
        //given
        ijapa.moveForwardBy(5);
        assertEquals(new Position(0, 5), ijapa.getCurrentPosition());

        //when
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.moveForwardBy(5);

        //assert
        assertEquals(new Position(5, 5), ijapa.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardFacingWest() {
        //given
        ijapa.moveForwardBy(5);
        assertEquals(new Position(0, 5), ijapa.getCurrentPosition());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.moveForwardBy(5);
        assertEquals(new Position(5, 5), ijapa.getCurrentPosition());

        //when
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.moveForwardBy(3);

        //assert
        assertEquals(new Position(5, 2), ijapa.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardFacingNorth() {
        //given
        ijapa.moveForwardBy(5);
        assertEquals(new Position(0, 5), ijapa.getCurrentPosition());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.moveForwardBy(5);
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.moveForwardBy(3);
        assertEquals(new Position(5, 2), ijapa.getCurrentPosition());

        //when
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.moveForwardBy(5);

        //assert
        assertEquals(new Position(0, 2), ijapa.getCurrentPosition());
    }
}
