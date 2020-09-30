package com.darrenfinch.physicalquantities

import com.darrenfinch.physicalquantities.units.MeasurementUnit
import com.darrenfinch.physicalquantities.units.imperial.USCustomaryUnit
import com.darrenfinch.physicalquantities.units.metric.MetricUnit

class PhysicalQuantity(val quantity: Double, val unit: MeasurementUnit) {
    /**
     * Returns a new PhysicalQuantity with an updated unit.
     * This doesn't sound too complicated until you remember that you must also update the numerical quantity so the actual measurement remains the same.
     * For example, you have 1 yard. That's 36 inches or 3 feet. But there's more. What is that in miles? Or heck, what is it in meters, centimeters, or kilometers?
     * This function solves all of that by allowing you to simply provide your desired unit,
     * and it will return a new PhysicalQuantity with the new unit and the transformed quantity.
     * @param newUnit   The unit of the transformed PhysicalQuantity returned from this function.
     * @return  The new PhysicalQuantity with the new measurement unit and transformed quantity.
     */
    fun convert(newUnit: MeasurementUnit): PhysicalQuantity {
        var mutableQuantity = quantity
        if(unit.getMeasurementType().isCompatibleForConversionTo(newUnit.getMeasurementType())) {
            if(unit.getMeasurementSystem() != newUnit.getMeasurementSystem()) {
                mutableQuantity *= unit.getBaseUnitRatio()
                mutableQuantity *= unit.getTheBaseUnitRatioToConvertTo(newUnit.getMeasurementSystem())
                mutableQuantity /= newUnit.getBaseUnitRatio()
            }
            else {
                mutableQuantity *= unit.getBaseUnitRatio()
                mutableQuantity /= newUnit.getBaseUnitRatio()
            }
        }
        return PhysicalQuantity(mutableQuantity, newUnit)
    }

    override fun toString(): String {
        return "$quantity ${unit.getUnitAsString(plural = false, abbreviated = false)}"
    }

    override fun equals(other: Any?): Boolean {
        return if(other !is PhysicalQuantity) {
            false
        }
        else {
            quantity == other.quantity &&
                    unit == other.unit
        }
    }

    override fun hashCode(): Int {
        var result = quantity.hashCode()
        result = 31 * result + unit.hashCode()
        return result
    }
}