package com.darrenfinch.physicalquantities.units.imperial

import com.darrenfinch.physicalquantities.units.MeasurementUnit
import com.darrenfinch.physicalquantities.units.UnitType

interface ImperialUnit : MeasurementUnit

//region Length units
class Inch : ImperialUnit {
    override fun getUnitType(): UnitType {
        return UnitType.Length
    }

    override fun getBaseUnitsConversionTable(): HashMap<UnitType, Double> {
        //Inch is the base unit for imperial length units
        return hashMapOf(UnitType.Length to 1.0)
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "inch${if (plural) "es" else ""}"
    }
}

class Foot : ImperialUnit {
    override fun getUnitType(): UnitType {
        return UnitType.Length
    }

    override fun getBaseUnitsConversionTable(): HashMap<UnitType, Double> {
        return hashMapOf(UnitType.Length to 12.0)
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return if (plural) "feet" else "foot"
    }
}

class Yard : ImperialUnit {
    override fun getUnitType(): UnitType {
        return UnitType.Length
    }

    override fun getBaseUnitsConversionTable(): HashMap<UnitType, Double> {
        return hashMapOf(UnitType.Length to 36.0)
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "yard${if (plural) "s" else ""}"
    }
}

class Mile : ImperialUnit {
    override fun getUnitType(): UnitType {
        return UnitType.Length
    }

    override fun getBaseUnitsConversionTable(): HashMap<UnitType, Double> {
        return hashMapOf(UnitType.Length to 63360.0)
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "mile${if (plural) "s" else ""}"
    }
}
//endregion

//region Mass
class Ounce : ImperialUnit {
    override fun getUnitType(): UnitType {
        return UnitType.Mass
    }

    override fun getBaseUnitsConversionTable(): HashMap<UnitType, Double> {
        return hashMapOf(UnitType.Mass to 63360.0)
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "mile${if (plural) "s" else ""}"
    }
}

class Pound : ImperialUnit {
    override fun getUnitType(): UnitType {
        return UnitType.Mass
    }

    override fun getBaseUnitsConversionTable(): HashMap<UnitType, Double> {
        return hashMapOf(UnitType.Mass to 63360.0)
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "mile${if (plural) "s" else ""}"
    }
}

class Ton : ImperialUnit {
    override fun getUnitType(): UnitType {
        return UnitType.Mass
    }

    override fun getBaseUnitsConversionTable(): HashMap<UnitType, Double> {
        return hashMapOf(UnitType.Mass to 63360.0)
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "mile${if (plural) "s" else ""}"
    }
}
//endregion

//region Liquid volume units
class Cup : ImperialUnit {
    override fun getUnitType(): UnitType {
        return UnitType.LiquidVolume
    }

    override fun getBaseUnitsConversionTable(): HashMap<UnitType, Double> {
        return hashMapOf(UnitType.LiquidVolume to 1.0)
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "cup${if (plural) "s" else ""}"
    }
}

class Teaspoon : ImperialUnit {
    override fun getUnitType(): UnitType {
        return UnitType.LiquidVolume
    }

    override fun getBaseUnitsConversionTable(): HashMap<UnitType, Double> {
        return hashMapOf(UnitType.LiquidVolume to 1.0)
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "teaspoon${if (plural) "s" else ""}"
    }
}

class Tablespoon : ImperialUnit {
    override fun getUnitType(): UnitType {
        return UnitType.LiquidVolume
    }

    override fun getBaseUnitsConversionTable(): HashMap<UnitType, Double> {
        return hashMapOf(UnitType.LiquidVolume to 1.0)
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "tablespoon${if (plural) "s" else ""}"
    }
}

class Pint : ImperialUnit {
    override fun getUnitType(): UnitType {
        return UnitType.LiquidVolume
    }

    override fun getBaseUnitsConversionTable(): HashMap<UnitType, Double> {
        return hashMapOf(UnitType.LiquidVolume to 2.0)
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "pint${if (plural) "s" else ""}"
    }
}

class Quart : ImperialUnit {
    override fun getUnitType(): UnitType {
        return UnitType.LiquidVolume
    }

    override fun getBaseUnitsConversionTable(): HashMap<UnitType, Double> {
        return hashMapOf(UnitType.LiquidVolume to 4.0)
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "quart${if (plural) "s" else ""}"
    }
}

class Gallon : ImperialUnit {
    override fun getUnitType(): UnitType {
        return UnitType.LiquidVolume
    }

    override fun getBaseUnitsConversionTable(): HashMap<UnitType, Double> {
        return hashMapOf(UnitType.LiquidVolume to 16.0)
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "gallon${if (plural) "s" else ""}"
    }
}

class Barrel : ImperialUnit {
    override fun getUnitType(): UnitType {
        return UnitType.LiquidVolume
    }

    override fun getBaseUnitsConversionTable(): HashMap<UnitType, Double> {
        return hashMapOf(UnitType.LiquidVolume to 504.0)
    }

    override fun getUnitAsString(plural: Boolean, abbreviated: Boolean): String {
        return "barrel${if (plural) "s" else ""}"
    }
}
//endregion