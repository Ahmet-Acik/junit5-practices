package org.ahmet.junitpractices;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * This class demonstrates the use of JUnit 5 tags to group and selectively run tests.
 * Tags allow categorizing tests as "fast" or "slow" for selective execution.
 */
public class TaggedTests {

    // A fast test, typically quick to execute
    @Test
    @Tag("fast")
    public void fastTest1() {
        assertTrue(true, "Fast test 1 should pass");
    }

    // Another fast test
    @Test
    @Tag("fast")
    public void fastTest2() {
        assertTrue(true, "Fast test 2 should pass");
    }

    // A slow test, typically longer to execute
    @Test
    @Tag("slow")
    public void slowTest1() {
        assertTrue(true, "Slow test 1 should pass");
    }

    // Another slow test
    @Test
    @Tag("slow")
    public void slowTest2() {
        assertTrue(true, "Slow test 2 should pass");
    }
}