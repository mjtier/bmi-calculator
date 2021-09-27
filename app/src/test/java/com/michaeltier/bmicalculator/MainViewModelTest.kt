package com.michaeltier.bmicalculator

import org.junit.Assert.*

import org.junit.Test
import java.lang.Math.abs

class MainViewModelTest {

    private val viewModel = MainViewModel()

    /*
     Fluent method for double comparison
     */
    infix fun Double.eq(other: Double) = abs(this - other) < 0.001

    @Test
    fun calculateBmi_metric_isCorrect() {

        //viewModel.calculateBMI()

    }

    @Test
    fun calculateBmi_imperial_isCorrect() {
        val bmi: Double = viewModel.calculateBMI(
            height = 66.0,
            weight = 160.0,
            measurementSystem = MeasurementSystem.IMPERIAL
        )
        assertTrue(25.82185 eq bmi)
    }
}