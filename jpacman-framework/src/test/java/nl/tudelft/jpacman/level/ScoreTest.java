package nl.tudelft.jpacman.level;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test suite to confirm that {@link Score} correctly stores and
 * accumulates points.
 */
class ScoreTest {

    /**
     * The score under test.
     */
    private Score score;

    /**
     * Resets the score under test.
     */
    @BeforeEach
    void setUp() {
        score = new Score(0);
    }

    /**
     * Asserts that a freshly created score starts at the given amount of
     * points.
     */
    @Test
    void testInitialPoints() {
        // TODO
    }

    /**
     * Asserts that adding points increases the total by that amount.
     */
    @Test
    void testAddPoints() {
        // TODO
    }

    /**
     * Asserts that adding points twice accumulates both amounts.
     */
    @Test
    void testAddPointsTwice() {
        // TODO
    }

    /**
     * Asserts that adding negative points decreases the total by that amount.
     */
    @Test
    void testAddNegativePoints() {
        // TODO
    }
}
