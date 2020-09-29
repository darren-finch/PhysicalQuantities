package com.darrenfinch.physicalquantities.units

enum class UnitType {
    Length,
    Mass,
    LiquidVolume,
    DryVolume;

    fun isCompatibleForConversionTo(otherUnitType: UnitType): Boolean {
        return this == otherUnitType
    }
}
