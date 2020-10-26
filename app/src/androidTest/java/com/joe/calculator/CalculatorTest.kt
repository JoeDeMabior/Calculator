package com.joe.calculator

import androidx.test.filters.SmallTest
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.Matchers.closeTo
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Created by Joe on 10/22/2020.
 */
@RunWith(JUnit4::class)
@SmallTest
class CalculatorTest {

    private lateinit var calculator: Calculator

    /**
     * Set up the environment for testing.
     */
    @Before
    fun setUp() {
        calculator = Calculator()
    }

    /**
     * Test for simple addition.
     */
    @Test
    fun add() {
        val result = calculator.add(1.0, 1.0)
        assertThat(result, `is`(equalTo(2.0)))
    }

    @Test
    fun addTwoNumbersNegative() {
        val result = calculator.add(-1.0, 2.0)
        assertThat(result, `is`(equalTo(1.0)))
    }

    @Test
    fun addTwoNumbersFloat() {
        val result = calculator.add(1.111, 1.111)
        assertThat(result, `is`(closeTo(2.222, 0.01)))
    }

    @Test
    fun subTwoNumbers() {
        val result = calculator.subtract(1.0, 1.0)
        assertThat(result, `is`(equalTo(0.0)))
    }

    @Test
    fun subWorksWithNegativeResult() {
        val result = calculator.subtract(1.0, 17.0)
        assertThat(result, `is`(equalTo(-16.0)))
    }

    @Test
    fun multiplyTwoNumbers() {
        val result = calculator.multiply(32.0, 2.0)
        assertThat(result, `is`(equalTo(64.0)))
    }

    @Test
    fun divideTwoNumbers() {
        val result = calculator.divide(32.0, 2.0)
        assertThat(result, `is`(equalTo(16.0)))
    }

    @Test
    fun divideTwoNumbersZero() {
        val result = calculator.divide(32.0, 0.0)
        assertThat(result, `is`(equalTo(Double.POSITIVE_INFINITY)))
    }
}