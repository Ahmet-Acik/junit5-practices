package org.ahmet.junitpractices;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedTestExample {

    @Nested
    class InnerTestGroup1 {
        @Test
        void test1() {
            System.out.println("InnerTestGroup1 - Test1");
        }
    }

    @Nested
    class InnerTestGroup2 {
        @Test
        void test2() {
            System.out.println("InnerTestGroup2 - Test2");
        }
    }
}