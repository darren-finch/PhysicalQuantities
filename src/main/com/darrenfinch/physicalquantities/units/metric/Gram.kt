package com.darrenfinch.physicalquantities.units.metric

import com.darrenfinch.physicalquantities.units.MeasurementUnit
import com.darrenfinch.physicalquantities.units.metric.prefixes.MetricPrefix
import com.darrenfinch.physicalquantities.unittypes.UnitType
import com.darrenfinch.physicalquantities.unittypes.Weight

class Gram : MetricUnit() {
    override fun getUnitType(): UnitType {
        return Weight()
    }
    override fun toString(): String {
        return "gram"
    }
}