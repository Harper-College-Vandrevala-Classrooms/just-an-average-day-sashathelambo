package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testMaximumUsingForLoop() {
        int[] nums = {4, 2, 9, 6, 5};
        assertEquals(9, calculator.maximumUsingForLoop(nums));
    }

    @Test
    void testMinimumUsingForLoop() {
        int[] nums = {4, 2, 9, 6, 5};
        assertEquals(2, calculator.minimumUsingForLoop(nums));
    }

    @Test
    void testSumUsingForLoop() {
        int[] nums = {4, 2, 9, 6, 5};
        assertEquals(26, calculator.sumUsingForLoop(nums));
    }

    @Test
    void testAverageUsingForLoop() {
        int[] nums = {4, 2, 9, 6, 5};
        assertEquals(5.2, calculator.averageUsingForLoop(nums), 0.1);
    }

    @Test
    void testMaximumUsingStream() {
        int[] nums = {4, 2, 9, 6, 5};
        assertEquals(9, calculator.maximumUsingStream(nums));
    }

    @Test
    void testMinimumUsingStream() {
        int[] nums = {4, 2, 9, 6, 5};
        assertEquals(2, calculator.minimumUsingStream(nums));
    }

    @Test
    void testSumUsingStream() {
        int[] nums = {4, 2, 9, 6, 5};
        assertEquals(26, calculator.sumUsingStream(nums));
    }

    @Test
    void testAverageUsingStream() {
        int[] nums = {4, 2, 9, 6, 5};
        assertEquals(5.2, calculator.averageUsingStream(nums), 0.1);
    }
}
