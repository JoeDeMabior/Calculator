package com.joe.calculator

/**
 * Created by Joe on 10/21/2020.
 *
 * Utility class for calculator to perform the actual calculations.
 */
class Calculator {

    // Available operations
    enum class Operator {
        ADDITION, SUBTRACTION, DIVISION, MULTIPLICATION
    }

    /**
     * Addition operation.
     */
    fun add(firstOperand: Double, secondOperand: Double) = firstOperand + secondOperand

    /**
     * Subtraction operation.
     */
    fun subtract(firstOperand: Double, secondOperand: Double) = firstOperand - secondOperand

    /**
     * Division operation.
     */
    fun divide(firstOperand: Double, secondOperand: Double) = firstOperand / secondOperand

    /**
     * Multiplication operation.
     */
    fun multiply(firstOperand: Double, secondOperand: Double) = firstOperand * secondOperand
}