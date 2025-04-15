package org.ahmet.junitpractices;

import org.junit.jupiter.api.Test;

interface ReusableTests {
    @Test
    default void commonTest() {
        System.out.println("Reusable test logic");
    }
}

class TestClass implements ReusableTests {
    // Inherits the commonTest method
}