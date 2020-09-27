package com.darrenfinch.physicalquantities.unittypes

class Volume : UnitType {
    override fun isCompatibleForConversionTo(otherUnitType: UnitType): Boolean {
        return when(otherUnitType::class) {
            Length::class -> false
            Volume::class -> true
            Weight::class -> true
            else -> false
        }
    }
}