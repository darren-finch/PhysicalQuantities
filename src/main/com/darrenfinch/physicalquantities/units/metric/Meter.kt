package com.darrenfinch.physicalquantities.units.metric

import com.darrenfinch.physicalquantities.unittypes.Length
import com.darrenfinch.physicalquantities.unittypes.UnitType

class Meter : MetricUnit() {
    override fun getUnitType(): UnitType {
        return Length()
    }
    override fun toString(): String {
        return "meter"
    }
}