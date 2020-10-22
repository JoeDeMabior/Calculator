package com.joe.calculator

import androidx.test.filters.SmallTest
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
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
}