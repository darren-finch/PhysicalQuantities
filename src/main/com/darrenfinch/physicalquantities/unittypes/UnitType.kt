package com.darrenfinch.physicalquantities.unittypes

interface UnitType {
    fun isCompatibleForConversionTo(otherUnitType: UnitType): Boolean
}
