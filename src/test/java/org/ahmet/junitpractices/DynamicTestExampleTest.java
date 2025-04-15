package org.ahmet.junitpractices;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.IntStream;
import java.util.stream.Stream;

class DynamicTestExampleTest {

    @TestFactory
    Stream<DynamicTest> dynamicTests() {
        return IntStream.range(1, 5)
                .mapToObj(i -> DynamicTest.dynamicTest("Test " + i, () -> {
                    System.out.println("Running dynamic test: " + i);
                }));
    }
}