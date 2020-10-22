package com.joe.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var calculator: Calculator

    private lateinit var operandOne: EditText
    private lateinit var operandTwo: EditText

    private lateinit var add: Button
    private lateinit var subtract: Button
    private lateinit var multiply: Button
    private lateinit var divide: Button

    private lateinit var resultValue: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

        setListeners()
    }

    /**
     * Initialize the calculator class and all the views.
     */
    private fun initViews() {
        calculator = Calculator()
        operandOne = findViewById(R.id.first_operand)
        operandTwo = findViewById(R.id.second_operand)
        add = findViewById(R.id.addition_operator)
        subtract = findViewById(R.id.subtraction_operator)
        multiply = findViewById(R.id.multiplication_operator)
        divide = findViewById(R.id.division_operator)
        resultValue = findViewById(R.id.operation_result)
    }

    /**
     * Detect clicks on the views
     */
    private fun setListeners() {
        add.setOnClickListener { compute(Calculator.Operator.ADDITION) }
        subtract.setOnClickListener { compute(Calculator.Operator.SUBTRACTION) }
        multiply.setOnClickListener { compute(Calculator.Operator.MULTIPLICATION) }
        divide.setOnClickListener { compute(Calculator.Operator.DIVISION) }
    }

    /**
     * Carry out various operations on numbers entered.
     */
    private fun compute(operator: Calculator.Operator) {
        val firstNumber: Double
        val secondNumber: Double

        try {
            firstNumber = operandOne.text.toString().toDouble()
            secondNumber = operandTwo.text.toString().toDouble()
        } catch (exception: NumberFormatException) {
            resultValue.text = getString(R.string.computation_error)
            return
        }

        val result: String?

        result = when (operator) {
            Calculator.Operator.ADDITION -> calculator.add(firstNumber, secondNumber).toString()
            Calculator.Operator.SUBTRACTION -> calculator.subtract(firstNumber, secondNumber).toString()
            Calculator.Operator.MULTIPLICATION -> calculator.multiply(firstNumber, secondNumber).toString()
            Calculator.Operator.DIVISION -> calculator.divide(firstNumber, secondNumber).toString()
        }

        resultValue.text = result
    }
}