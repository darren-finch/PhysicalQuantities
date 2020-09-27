package com.darrenfinch.physicalquantities.units

import com.darrenfinch.physicalquantities.unittypes.UnitType

interface MeasurementUnit {
    fun getUnitType(): UnitType
    override fun toString(): String
}