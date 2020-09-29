package com.darrenfinch.physicalquantities

import com.darrenfinch.physicalquantities.units.metric.*

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PhysicalQuantityTest {
    @Test
    fun convert_returnsCorrectValue_when_conversionIsMetricToMetric() {
        val testPhysicalQuantity = PhysicalQuantity(300.0, Gram())
        val expectedPhysicalQuantity = PhysicalQuantity(0.3, Gram(Kilo()))
        val actualPhysicalQuantity = testPhysicalQuantity.convert(Gram(Kilo()))

        assertEquals(expectedPhysicalQuantity, actualPhysicalQuantity)

        val testPhysicalQuantity2 = PhysicalQuantity(123.0, Meter(Milli()))
        val expectedPhysicalQuantity2 = PhysicalQuantity(0.123, Meter())
        val actualPhysicalQuantity2 = testPhysicalQuantity2.convert(Meter())

        assertEquals(expectedPhysicalQuantity2, actualPhysicalQuantity2)

        val testPhysicalQuantity3 = PhysicalQuantity(100.0, Liter(Centi()))
        val expectedPhysicalQuantity3 = PhysicalQuantity(0.1, Liter(Deca()))
        val actualPhysicalQuantity3 = testPhysicalQuantity3.convert(Liter(Deca()))

        assertEquals(expectedPhysicalQuantity3, actualPhysicalQuantity3)
    }
}