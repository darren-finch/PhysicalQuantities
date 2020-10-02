package com.darrenfinch.physicalquantities

import com.darrenfinch.physicalquantities.units.MeasurementType
import com.darrenfinch.physicalquantities.units.MeasurementUnit
import com.darrenfinch.physicalquantities.units.imperial.*
import com.darrenfinch.physicalquantities.units.metric.*

enum class MeasurementSystem {
    USCustomary,
    Imperial,
    Metric;

    fun getBaseUnitFor(measurementSystem: MeasurementSystem, measurementType: MeasurementType): MeasurementUnit {
        return when (measurementType) {
            MeasurementType.Length -> {
                when(measurementSystem) {
                    USCustomary -> Inch()
                    else -> Meter()
                }
            }
            MeasurementType.Mass -> {
                when(measurementSystem) {
                    USCustomary -> Pound()
                    else -> Gram()
                }
            }
            MeasurementType.LiquidVolume -> {
                when(measurementSystem) {
                    USCustomary -> Cup()
                    else -> Liter()
                }
            }
        }
    }
}