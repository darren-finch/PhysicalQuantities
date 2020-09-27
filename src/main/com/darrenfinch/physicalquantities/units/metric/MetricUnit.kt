package com.darrenfinch.physicalquantities.units.metric

import com.darrenfinch.physicalquantities.units.MeasurementUnit
import com.darrenfinch.physicalquantities.units.metric.prefixes.MetricPrefix

abstract class MetricUnit : MeasurementUnit {
    lateinit var prefix: MetricPrefix
}