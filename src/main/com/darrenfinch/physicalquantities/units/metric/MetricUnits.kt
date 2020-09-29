package com.darrenfinch.physicalquantities.units.metric

import com.darrenfinch.physicalquantities.units.MeasurementUnit
import com.darrenfinch.physicalquantities.units.UnitType

abstract class MetricUnit(var prefix: MetricPrefix) : MeasurementUnit {
    override fun equals(other: Any?): Boolean {
        return if(other !is MetricUnit) {
            false
        }
        else {
            prefix == other.prefix
        }
    }

    override fun hashCode(): Int {
        return prefix.hashCode()
    }
}

class Meter(prefix: MetricPrefix = NullPrefix()) : MetricUnit(prefix) {
    override fun getBaseUnitsConversionTable(): HashMap<UnitType, Double> {
        return hashMapOf(UnitType.Length to prefix.getBaseUnitRatio())
    }

    override fun getUnitType(): UnitType {
        return UnitType.Length
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "${prefix}meter${if (plural) "s" else ""}"
    }
}

class Gram(prefix: MetricPrefix = NullPrefix()) : MetricUnit(prefix) {
    override fun getBaseUnitsConversionTable(): HashMap<UnitType, Double> {
        return hashMapOf(UnitType.Mass to prefix.getBaseUnitRatio())
    }

    override fun getUnitType(): UnitType {
        return UnitType.Mass
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "${prefix}gram${if (plural) "s" else ""}"
    }
}

class Liter(prefix: MetricPrefix = NullPrefix()) : MetricUnit(prefix) {
    override fun getBaseUnitsConversionTable(): HashMap<UnitType, Double> {
        return hashMapOf(UnitType.LiquidVolume to prefix.getBaseUnitRatio())
    }

    override fun getUnitType(): UnitType {
        return UnitType.LiquidVolume
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "${prefix}liter${if (plural) "s" else ""}"
    }
}
