package com.darrenfinch.physicalquantities

import com.darrenfinch.physicalquantities.units.imperial.*
import com.darrenfinch.physicalquantities.units.metric.*

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.abs
import kotlin.test.asserter

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

    @Test
    fun convert_returnsCorrectValue_when_conversionIsImperialToImperial() {
        val testPhysicalQuantity = PhysicalQuantity(12.0, Inch())
        val expectedPhysicalQuantity = PhysicalQuantity(1.0, Foot())
        val actualPhysicalQuantity = testPhysicalQuantity.convert(Foot())

        assertEquals(expectedPhysicalQuantity, actualPhysicalQuantity)

        val testPhysicalQuantity2 = PhysicalQuantity(1.0, Mile())
        val expectedPhysicalQuantity2 = PhysicalQuantity(5280.0, Foot())
        val actualPhysicalQuantity2 = testPhysicalQuantity2.convert(Foot())

        assertEquals(expectedPhysicalQuantity2, actualPhysicalQuantity2)

        val testPhysicalQuantity3 = PhysicalQuantity(2.5, Foot())
        val expectedPhysicalQuantity3 = PhysicalQuantity(30.0, Inch())
        val actualPhysicalQuantity3 = testPhysicalQuantity3.convert(Inch())

        assertEquals(expectedPhysicalQuantity3, actualPhysicalQuantity3)

        val testPhysicalQuantity4 = PhysicalQuantity(1000.0, Pound())
        val expectedPhysicalQuantity4 = PhysicalQuantity(0.5, Ton())
        val actualPhysicalQuantity4 = testPhysicalQuantity4.convert(Ton())

        assertEquals(expectedPhysicalQuantity4, actualPhysicalQuantity4)

        val testPhysicalQuantity5 = PhysicalQuantity(16.0, Ounce())
        val expectedPhysicalQuantity5 = PhysicalQuantity(1.0, Pound())
        val actualPhysicalQuantity5 = testPhysicalQuantity5.convert(Pound())

        assertEquals(expectedPhysicalQuantity5, actualPhysicalQuantity5)

        val testPhysicalQuantity6 = PhysicalQuantity(16.0, Cup())
        val expectedPhysicalQuantity6 = PhysicalQuantity(1.0, Gallon())
        val actualPhysicalQuantity6 = testPhysicalQuantity6.convert(Gallon())

        assertEquals(expectedPhysicalQuantity6, actualPhysicalQuantity6)

        val testPhysicalQuantity7 = PhysicalQuantity(3.0, Inch())
        val expectedPhysicalQuantity7 = PhysicalQuantity(0.25, Foot())
        val actualPhysicalQuantity7 = testPhysicalQuantity7.convert(Foot())

        assertEquals(expectedPhysicalQuantity7, actualPhysicalQuantity7)
    }

    @Test
    fun convert_returnsCorrectValue_when_conversionIsImperialToMetric() {
        val testPhysicalQuantity = PhysicalQuantity(2.0, Cup())
        val expectedPhysicalQuantity = PhysicalQuantity(0.48, Liter())
        val actualPhysicalQuantity = testPhysicalQuantity.convert(Liter())

        assertEquals(expectedPhysicalQuantity, actualPhysicalQuantity)

        val testPhysicalQuantity2 = PhysicalQuantity(2.0, Cup())
        val expectedPhysicalQuantity2 = PhysicalQuantity(480.0, Liter(Milli()))
        val actualPhysicalQuantity2 = testPhysicalQuantity2.convert(Liter(Milli()))

        assertEquals(expectedPhysicalQuantity2, actualPhysicalQuantity2)

        val testPhysicalQuantity3 = PhysicalQuantity(1.0, Ton())
        val expectedPhysicalQuantity3 = PhysicalQuantity(907.1850, Gram(Kilo()))
        val actualPhysicalQuantity3 = testPhysicalQuantity3.convert(Gram(Kilo()))

        assertEquals(expectedPhysicalQuantity3.quantity, actualPhysicalQuantity3.quantity, 0.1)

        val testPhysicalQuantity4 = PhysicalQuantity(2.0, Meter(Kilo()))
        val expectedPhysicalQuantity4 = PhysicalQuantity(1.24274, Mile())
        val actualPhysicalQuantity4 = testPhysicalQuantity4.convert(Mile())

        assertEquals(expectedPhysicalQuantity4.quantity, actualPhysicalQuantity4.quantity, 0.1)

        val testPhysicalQuantity5 = PhysicalQuantity(2.0, Meter(Kilo()))
        val expectedPhysicalQuantity5 = PhysicalQuantity(1.24274, Mile())
        val actualPhysicalQuantity5 = testPhysicalQuantity5.convert(Mile())

        assertEquals(expectedPhysicalQuantity5.quantity, actualPhysicalQuantity5.quantity, 0.1)
    }

    @Test
    fun convert_returnsCorrectValue_when_conversionIsMetricToImperial() {
        val testPhysicalQuantity4 = PhysicalQuantity(2.0, Meter(Kilo()))
        val expectedPhysicalQuantity4 = PhysicalQuantity(1.24274, Mile())
        val actualPhysicalQuantity4 = testPhysicalQuantity4.convert(Mile())

        assertEquals(expectedPhysicalQuantity4.quantity, actualPhysicalQuantity4.quantity, 0.1)

        val testPhysicalQuantity5 = PhysicalQuantity(1.0, Gram())
        val expectedPhysicalQuantity5 = PhysicalQuantity(0.035274, Ounce())
        val actualPhysicalQuantity5 = testPhysicalQuantity5.convert(Ounce())

        assertEquals(expectedPhysicalQuantity5.quantity, actualPhysicalQuantity5.quantity, 0.1)

        //Multiple conversions to the same physical quantity
        val testPhysicalQuantity6 = PhysicalQuantity(100.0, Gram())
       testPhysicalQuantity6.convert(Gram(Kilo()))

        val expectedPhysicalQuantity7 = PhysicalQuantity(0.220462, Pound())
        val actualPhysicalQuantity7 = testPhysicalQuantity6.convert(Pound())

        assertEquals(expectedPhysicalQuantity7.quantity, actualPhysicalQuantity7.quantity, 0.1)
    }

    private fun assertEquals(expected: Double, actual: Double?, epsilon: Double, message: String? = null) {
        asserter.assertNotNull(null, actual)
        asserter.assertTrue({ messagePrefix(message) + "Expected <$expected>, actual <$actual>, should differ no more than <$epsilon>." },
                abs(expected - actual!!) <= epsilon)
    }

    private fun messagePrefix(message: String?) = if (message == null) "" else "$message. "
}