package com.michaeltier.bmicalculator

enum class MeasurementSystem(val bmiConstant: Double) {
    METRIC(10000.0),
    IMPERIAL(703.0);
}

class MainViewModel {

    fun calculateBMI(height: Double, weight: Double, measurementSystem: MeasurementSystem) =
        (weight / (height * height)) * measurementSystem.bmiConstant
}