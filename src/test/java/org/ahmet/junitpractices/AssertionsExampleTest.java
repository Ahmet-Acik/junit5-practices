package org.ahmet.junitpractices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertionsExampleTest {

    @Test
    void testAssertions() {
        assertAll("Grouped Assertions",
            () -> assertEquals(4, 2 + 2),
            () -> assertTrue(5 > 1),
            () -> assertThrows(ArithmeticException.class, () -> {
                int result = 1 / 0;
            })
        );
    }
}