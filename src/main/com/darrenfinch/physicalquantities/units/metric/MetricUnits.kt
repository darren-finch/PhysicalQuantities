package com.darrenfinch.physicalquantities.units.metric

import com.darrenfinch.physicalquantities.MeasurementSystem
import com.darrenfinch.physicalquantities.units.MeasurementUnit
import com.darrenfinch.physicalquantities.units.MeasurementType

abstract class MetricUnit(var prefix: MetricPrefix) : MeasurementUnit() {
    override fun getBaseUnitRatio(): Double {
        return prefix.getBaseUnitRatio()
    }

    override fun getMeasurementSystem(): MeasurementSystem {
        return MeasurementSystem.Metric
    }

    override fun equals(other: Any?): Boolean {
        return if(other !is MetricUnit) {
            false
        }
        else {
            return super.equals(other) && prefix == other.prefix
        }
    }

    override fun hashCode(): Int {
        return prefix.hashCode()
    }
}

class Meter(prefix: MetricPrefix = NullPrefix()) : MetricUnit(prefix) {

    override fun getMeasurementType(): MeasurementType {
        return MeasurementType.Length
    }

    override fun getTheBaseUnitRatioToConvertTo(otherMeasurementSystem: MeasurementSystem): Double {
        return when(otherMeasurementSystem) {
            MeasurementSystem.USCustomary -> 39.3701
            else -> getBaseUnitRatio()
        }
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "${prefix}meter${if (plural) "s" else ""}"
    }
}

class Gram(prefix: MetricPrefix = NullPrefix()) : MetricUnit(prefix) {

    override fun getMeasurementType(): MeasurementType {
        return MeasurementType.Mass
    }

    override fun getTheBaseUnitRatioToConvertTo(otherMeasurementSystem: MeasurementSystem): Double {
        return when(otherMeasurementSystem) {
            MeasurementSystem.USCustomary -> 0.0352
            else -> getBaseUnitRatio()
        }
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "${prefix}gram${if (plural) "s" else ""}"
    }
}

class Liter(prefix: MetricPrefix = NullPrefix()) : MetricUnit(prefix) {

    override fun getMeasurementType(): MeasurementType {
        return MeasurementType.LiquidVolume
    }

    override fun getTheBaseUnitRatioToConvertTo(otherMeasurementSystem: MeasurementSystem): Double {
        return when(otherMeasurementSystem) {
            MeasurementSystem.USCustomary -> 4.1667
            else -> getBaseUnitRatio()
        }
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "${prefix}liter${if (plural) "s" else ""}"
    }
}
