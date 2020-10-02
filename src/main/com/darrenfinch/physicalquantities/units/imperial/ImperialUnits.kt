package com.darrenfinch.physicalquantities.units.imperial

import com.darrenfinch.physicalquantities.MeasurementSystem
import com.darrenfinch.physicalquantities.units.BaseUnit
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

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "gallon${if (plural) "s" else ""}"
    }
}
//endregion