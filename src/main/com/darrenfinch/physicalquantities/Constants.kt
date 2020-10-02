package com.darrenfinch.physicalquantities

import com.darrenfinch.physicalquantities.units.MeasurementUnit
import com.darrenfinch.physicalquantities.units.imperial.*
import com.darrenfinch.physicalquantities.units.metric.*

val baseUnitRatios = hashMapOf(Inch() to hashMapOf(MeasurementSystem.Metric to 0.0254), Pound() to hashMapOf(MeasurementSystem.Metric to 453.592), Cup() to hashMapOf(MeasurementSystem.Metric to 0.24), Meter() to hashMapOf(MeasurementSystem.USCustomary to 39.3701), Gram() to hashMapOf(MeasurementSystem.USCustomary to 0.00220462), Liter() to hashMapOf(MeasurementSystem.USCustomary to 4.1667))