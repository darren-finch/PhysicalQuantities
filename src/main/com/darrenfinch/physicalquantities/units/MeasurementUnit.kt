package com.darrenfinch.physicalquantities.units

interface MeasurementUnit {
    fun getUnitType(): UnitType
    fun getBaseUnitsConversionTable(): HashMap<UnitType, Double>

    /**
     * @param plural    Whether the unit is plural (e.g inches is the plural form of inch). Pass true if the quantity related to this unit is greater than one.
     * @return The correct string representation of this unit, accounting for the noun number.
     */
    fun getUnitAsString(plural: Boolean = false, abbreviated: Boolean = false): String
}