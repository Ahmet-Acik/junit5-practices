package org.ahmet.junitpractices;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

class TimeoutExampleTest {

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    void testWithTimeout() throws InterruptedException {
        Thread.sleep(500); // Passes as it completes within 1 second
    }
}