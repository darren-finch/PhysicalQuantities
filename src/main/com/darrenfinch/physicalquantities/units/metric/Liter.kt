package com.darrenfinch.physicalquantities.units.metric

import com.darrenfinch.physicalquantities.unittypes.UnitType
import com.darrenfinch.physicalquantities.unittypes.Volume

class Liter : MetricUnit() {
    override fun getUnitType(): UnitType {
        return Volume()
    }
    override fun toString(): String {
        return "liter"
    }
}