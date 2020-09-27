package com.darrenfinch.physicalquantities.unittypes

class Length : UnitType {
    override fun isCompatibleForConversionTo(otherUnitType: UnitType): Boolean {
        return when(otherUnitType::class) {
            Length::class -> true
            Volume::class -> false
            Weight::class -> false
            else -> false
        }
    }
}