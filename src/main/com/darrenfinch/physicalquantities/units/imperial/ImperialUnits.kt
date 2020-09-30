package com.darrenfinch.physicalquantities.units.imperial

import com.darrenfinch.physicalquantities.MeasurementSystem
import com.darrenfinch.physicalquantities.units.MeasurementUnit
import com.darrenfinch.physicalquantities.units.MeasurementType

abstract class USCustomaryUnit : MeasurementUnit() {
    override fun getMeasurementSystem(): MeasurementSystem {
        return MeasurementSystem.USCustomary
    }
}

//region Length units
class Inch : USCustomaryUnit() {
    override fun getMeasurementType(): MeasurementType {
        return MeasurementType.Length
    }

    override fun getBaseUnitRatio(): Double {
        return 1.0
    }

    override fun getTheBaseUnitRatioToConvertTo(otherMeasurementSystem: MeasurementSystem): Double {
        return when(otherMeasurementSystem) {
            MeasurementSystem.Metric -> 0.0254
            else -> getBaseUnitRatio()
        }
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "inch${if (plural) "es" else ""}"
    }
}

class Foot : USCustomaryUnit() {
    override fun getMeasurementType(): MeasurementType {
        return MeasurementType.Length
    }

    override fun getBaseUnitRatio(): Double {
        return 12.0
    }

    override fun getTheBaseUnitRatioToConvertTo(otherMeasurementSystem: MeasurementSystem): Double {
        return when(otherMeasurementSystem) {
            MeasurementSystem.Metric -> 0.3048
            else -> getBaseUnitRatio()
        }
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return if (plural) "feet" else "foot"
    }
}

class Yard : USCustomaryUnit() {
    override fun getMeasurementType(): MeasurementType {
        return MeasurementType.Length
    }

    override fun getBaseUnitRatio(): Double {
        return 36.0
    }

    override fun getTheBaseUnitRatioToConvertTo(otherMeasurementSystem: MeasurementSystem): Double {
        return when(otherMeasurementSystem) {
            MeasurementSystem.Metric -> 0.9144
            else -> getBaseUnitRatio()
        }
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "yard${if (plural) "s" else ""}"
    }
}

class Mile : USCustomaryUnit() {
    override fun getMeasurementType(): MeasurementType {
        return MeasurementType.Length
    }

    override fun getBaseUnitRatio(): Double {
        return 63360.0
    }

    override fun getTheBaseUnitRatioToConvertTo(otherMeasurementSystem: MeasurementSystem): Double {
        return when(otherMeasurementSystem) {
            MeasurementSystem.Metric -> 1609.34
            else -> getBaseUnitRatio()
        }
    }


    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "mile${if (plural) "s" else ""}"
    }
}
//endregion

//region Mass
class Ounce : USCustomaryUnit() {
    override fun getMeasurementType(): MeasurementType {
        return MeasurementType.Mass
    }

    override fun getBaseUnitRatio(): Double {
        return 0.0625
    }

    override fun getTheBaseUnitRatioToConvertTo(otherMeasurementSystem: MeasurementSystem): Double {
        return when(otherMeasurementSystem) {
            MeasurementSystem.Metric -> 28.3495
            else -> getBaseUnitRatio()
        }
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "ounce${if (plural) "es" else ""}"
    }
}

class Pound : USCustomaryUnit() {
    override fun getMeasurementType(): MeasurementType {
        return MeasurementType.Mass
    }

    override fun getBaseUnitRatio(): Double {
        return 1.0
    }

    override fun getTheBaseUnitRatioToConvertTo(otherMeasurementSystem: MeasurementSystem): Double {
        return when(otherMeasurementSystem) {
            MeasurementSystem.Metric -> 453.592
            else -> getBaseUnitRatio()
        }
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "pound${if (plural) "s" else ""}"
    }
}

class Ton : USCustomaryUnit() {
    override fun getMeasurementType(): MeasurementType {
        return MeasurementType.Mass
    }

    override fun getBaseUnitRatio(): Double {
        return 2000.0
    }

    override fun getTheBaseUnitRatioToConvertTo(otherMeasurementSystem: MeasurementSystem): Double {
        return when(otherMeasurementSystem) {
            MeasurementSystem.Metric -> 907184.0
            else -> getBaseUnitRatio()
        }
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "ton${if (plural) "s" else ""}"
    }
}
//endregion

//region Liquid volume units
class Cup : USCustomaryUnit() {
    override fun getMeasurementType(): MeasurementType {
        return MeasurementType.LiquidVolume
    }

    override fun getBaseUnitRatio(): Double {
        return 1.0
    }

    override fun getTheBaseUnitRatioToConvertTo(otherMeasurementSystem: MeasurementSystem): Double {
        return when(otherMeasurementSystem) {
            MeasurementSystem.Metric -> 0.24
            else -> getBaseUnitRatio()
        }
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "cup${if (plural) "s" else ""}"
    }
}

class Teaspoon : USCustomaryUnit() {
    override fun getMeasurementType(): MeasurementType {
        return MeasurementType.LiquidVolume
    }

    override fun getBaseUnitRatio(): Double {
        return 0.02083
    }

    override fun getTheBaseUnitRatioToConvertTo(otherMeasurementSystem: MeasurementSystem): Double {
        return when(otherMeasurementSystem) {
            MeasurementSystem.Metric -> 0.0049
            else -> getBaseUnitRatio()
        }
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "teaspoon${if (plural) "s" else ""}"
    }
}

class Tablespoon : USCustomaryUnit() {
    override fun getMeasurementType(): MeasurementType {
        return MeasurementType.LiquidVolume
    }

    override fun getBaseUnitRatio(): Double {
        return 0.0625
    }

    override fun getTheBaseUnitRatioToConvertTo(otherMeasurementSystem: MeasurementSystem): Double {
        return when(otherMeasurementSystem) {
            MeasurementSystem.Metric -> 0.0147
            else -> getBaseUnitRatio()
        }
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "tablespoon${if (plural) "s" else ""}"
    }
}

class FluidOunce : USCustomaryUnit() {
    override fun getMeasurementType(): MeasurementType {
        return MeasurementType.LiquidVolume
    }

    override fun getBaseUnitRatio(): Double {
        return 0.125
    }

    override fun getTheBaseUnitRatioToConvertTo(otherMeasurementSystem: MeasurementSystem): Double {
        return when(otherMeasurementSystem) {
            MeasurementSystem.Metric -> 0.0295
            else -> getBaseUnitRatio()
        }
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "fluid ounce${if (plural) "s" else ""}"
    }
}

class Pint : USCustomaryUnit() {
    override fun getMeasurementType(): MeasurementType {
        return MeasurementType.LiquidVolume
    }

    override fun getBaseUnitRatio(): Double {
        return 2.0
    }

    override fun getTheBaseUnitRatioToConvertTo(otherMeasurementSystem: MeasurementSystem): Double {
        return when(otherMeasurementSystem) {
            MeasurementSystem.Metric -> 0.4731
            else -> getBaseUnitRatio()
        }
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "pint${if (plural) "s" else ""}"
    }
}

class Quart : USCustomaryUnit() {
    override fun getMeasurementType(): MeasurementType {
        return MeasurementType.LiquidVolume
    }

    override fun getBaseUnitRatio(): Double {
        return 4.0
    }

    override fun getTheBaseUnitRatioToConvertTo(otherMeasurementSystem: MeasurementSystem): Double {
        return when(otherMeasurementSystem) {
            MeasurementSystem.Metric -> 0.9463
            else -> getBaseUnitRatio()
        }
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "quart${if (plural) "s" else ""}"
    }
}

class Gallon : USCustomaryUnit() {
    override fun getMeasurementType(): MeasurementType {
        return MeasurementType.LiquidVolume
    }

    override fun getBaseUnitRatio(): Double {
        return 16.0
    }

    override fun getTheBaseUnitRatioToConvertTo(otherMeasurementSystem: MeasurementSystem): Double {
        return when(otherMeasurementSystem) {
            MeasurementSystem.Metric -> 3.7854
            else -> getBaseUnitRatio()
        }
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "gallon${if (plural) "s" else ""}"
    }
}
//endregion