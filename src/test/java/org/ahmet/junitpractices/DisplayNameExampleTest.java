package org.ahmet.junitpractices;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DisplayNameExampleTest {

    @Test
    @DisplayName("Test addition of two numbers")
    void additionTest() {
        assertEquals(4, 2 + 2);
    }
}