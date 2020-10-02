package com.darrenfinch.physicalquantities.units

import com.darrenfinch.physicalquantities.MeasurementSystem

abstract class MeasurementUnit {
    abstract fun getMeasurementType(): MeasurementType

    abstract fun getMeasurementSystem(): MeasurementSystem

    abstract fun getBaseUnitRatio(): Double

    /**
     * @param plural    Whether the unit is plural (e.g inches is the plural form of inch). Pass true if the quantity related to this unit is greater than one.
     * @return The correct string representation of this unit, accounting for the noun number.
     */
    abstract fun getUnitAsString(plural: Boolean = false, abbreviated: Boolean = false): String

    override fun equals(other: Any?): Boolean {
        return if(other !is MeasurementUnit) {
            false
        }
        else {
            getMeasurementType() == other.getMeasurementType() &&
                    getBaseUnitRatio() == other.getBaseUnitRatio()
        }
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }

    override fun toString(): String {
        return getUnitAsString()
    }
}