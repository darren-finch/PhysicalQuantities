package com.darrenfinch.physicalquantities.units

import com.darrenfinch.physicalquantities.MeasurementSystem

/**
 * The standard unit for a given measurement system and measurement type.
 * E.g, gram is the base unit for the metric measurement system and the mass measurement type.
 * All other units in the given measurement system and measurement type can convert to this base unit at any time.
 * E.g, kilogram has a base unit ratio of 1000, because there are 1000 grams in every kilogram.
 */
abstract class BaseUnit : MeasurementUnit() {
    /**
     * Returns the ratios to convert between this base unit of this measurement system and the base unit of the provided measurement system.
     * @param otherMeasurementSystem    The measurement system you want to convert to.
     */
    abstract fun getTheBaseUnitRatioToConvertTo(otherMeasurementSystem: MeasurementSystem): Double

    override fun getBaseUnitRatio(): Double {
        return 1.0 //We are the base unit, so the ratio is 1.0
    }
}