package com.darrenfinch.physicalquantities

import com.darrenfinch.physicalquantities.units.imperial.*
import com.darrenfinch.physicalquantities.units.uscustomary.*
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
    fun convert_returnsCorrectValue_when_conversionIsUSCustomaryToUSCustomary() {
        val testPhysicalQuantity = PhysicalQuantity(12.0, USInch())
        val expectedPhysicalQuantity = PhysicalQuantity(1.0, USFoot())
        val actualPhysicalQuantity = testPhysicalQuantity.convert(USFoot())

        assertEquals(expectedPhysicalQuantity, actualPhysicalQuantity)

        val testPhysicalQuantity2 = PhysicalQuantity(1.0, USMile())
        val expectedPhysicalQuantity2 = PhysicalQuantity(5280.0, USFoot())
        val actualPhysicalQuantity2 = testPhysicalQuantity2.convert(USFoot())

        assertEquals(expectedPhysicalQuantity2, actualPhysicalQuantity2)

        val testPhysicalQuantity3 = PhysicalQuantity(2.5, USFoot())
        val expectedPhysicalQuantity3 = PhysicalQuantity(30.0, USInch())
        val actualPhysicalQuantity3 = testPhysicalQuantity3.convert(USInch())

        assertEquals(expectedPhysicalQuantity3, actualPhysicalQuantity3)

        val testPhysicalQuantity4 = PhysicalQuantity(1000.0, USPound())
        val expectedPhysicalQuantity4 = PhysicalQuantity(0.5, USTon())
        val actualPhysicalQuantity4 = testPhysicalQuantity4.convert(USTon())

        assertEquals(expectedPhysicalQuantity4, actualPhysicalQuantity4)

        val testPhysicalQuantity5 = PhysicalQuantity(16.0, USOunce())
        val expectedPhysicalQuantity5 = PhysicalQuantity(1.0, USPound())
        val actualPhysicalQuantity5 = testPhysicalQuantity5.convert(USPound())

        assertEquals(expectedPhysicalQuantity5, actualPhysicalQuantity5)

        val testPhysicalQuantity6 = PhysicalQuantity(16.0, USCup())
        val expectedPhysicalQuantity6 = PhysicalQuantity(1.0, USGallon())
        val actualPhysicalQuantity6 = testPhysicalQuantity6.convert(USGallon())

        assertEquals(expectedPhysicalQuantity6, actualPhysicalQuantity6)

        val testPhysicalQuantity7 = PhysicalQuantity(3.0, USInch())
        val expectedPhysicalQuantity7 = PhysicalQuantity(0.25, USFoot())
        val actualPhysicalQuantity7 = testPhysicalQuantity7.convert(USFoot())

        assertEquals(expectedPhysicalQuantity7, actualPhysicalQuantity7)
    }

    @Test
    fun convert_returnsCorrectValue_when_conversionIsImperialToImperial() {
        val testPhysicalQuantity = PhysicalQuantity(12.0, ImperialInch())
        val expectedPhysicalQuantity = PhysicalQuantity(1.0, ImperialFoot())
        val actualPhysicalQuantity = testPhysicalQuantity.convert(ImperialFoot())

        assertEquals(expectedPhysicalQuantity, actualPhysicalQuantity)

        val testPhysicalQuantity2 = PhysicalQuantity(1.0, ImperialMile())
        val expectedPhysicalQuantity2 = PhysicalQuantity(5280.0, ImperialFoot())
        val actualPhysicalQuantity2 = testPhysicalQuantity2.convert(ImperialFoot())

        assertEquals(expectedPhysicalQuantity2, actualPhysicalQuantity2)

        val testPhysicalQuantity3 = PhysicalQuantity(2.5, ImperialFoot())
        val expectedPhysicalQuantity3 = PhysicalQuantity(30.0, ImperialInch())
        val actualPhysicalQuantity3 = testPhysicalQuantity3.convert(ImperialInch())

        assertEquals(expectedPhysicalQuantity3, actualPhysicalQuantity3)

        val testPhysicalQuantity4 = PhysicalQuantity(1.0, ImperialTon())
        val expectedPhysicalQuantity4 = PhysicalQuantity(160.0, ImperialStone())
        val actualPhysicalQuantity4 = testPhysicalQuantity4.convert(ImperialStone())

        assertEquals(expectedPhysicalQuantity4, actualPhysicalQuantity4)

        val testPhysicalQuantity5 = PhysicalQuantity(16.0, ImperialOunce())
        val expectedPhysicalQuantity5 = PhysicalQuantity(1.0, ImperialPound())
        val actualPhysicalQuantity5 = testPhysicalQuantity5.convert(ImperialPound())

        assertEquals(expectedPhysicalQuantity5, actualPhysicalQuantity5)

        val testPhysicalQuantity6 = PhysicalQuantity(16.0, ImperialPint())
        val expectedPhysicalQuantity6 = PhysicalQuantity(2.0, ImperialGallon())
        val actualPhysicalQuantity6 = testPhysicalQuantity6.convert(ImperialGallon())

        assertEquals(expectedPhysicalQuantity6, actualPhysicalQuantity6)

        val testPhysicalQuantity7 = PhysicalQuantity(5.0, ImperialPint())
        val expectedPhysicalQuantity7 = PhysicalQuantity(100.0, ImperialFluidOunce())
        val actualPhysicalQuantity7 = testPhysicalQuantity7.convert(ImperialFluidOunce())

        assertEquals(expectedPhysicalQuantity7, actualPhysicalQuantity7)
    }

    @Test
    fun convert_returnsCorrectValue_when_conversionIsImperialToMetric() {
        val testPhysicalQuantity = PhysicalQuantity(12.0, ImperialInch())
        val expectedPhysicalQuantity = PhysicalQuantity(0.3048, Meter())
        val actualPhysicalQuantity = testPhysicalQuantity.convert(Meter())

        assertEquals(expectedPhysicalQuantity.quantity, actualPhysicalQuantity.quantity, 0.1)

        val testPhysicalQuantity2 = PhysicalQuantity(100.0, ImperialStone())
        val expectedPhysicalQuantity2 = PhysicalQuantity(635.029, Gram(Kilo()))
        val actualPhysicalQuantity2 = testPhysicalQuantity2.convert(Gram(Kilo()))

        assertEquals(expectedPhysicalQuantity2.quantity, actualPhysicalQuantity2.quantity, 0.1)

        val testPhysicalQuantity3 = PhysicalQuantity(3.5, ImperialQuart())
        val expectedPhysicalQuantity3 = PhysicalQuantity(39.7783, Liter(Deci()))
        val actualPhysicalQuantity3 = testPhysicalQuantity3.convert(Liter(Deci()))

        assertEquals(expectedPhysicalQuantity3.quantity, actualPhysicalQuantity3.quantity, 0.1)
    }

    @Test
    fun convert_returnsCorrectValue_when_conversionIsImperialToUSCustomary() {
        val testPhysicalQuantity = PhysicalQuantity(12.0, ImperialInch())
        val expectedPhysicalQuantity = PhysicalQuantity(1.0, USFoot())
        val actualPhysicalQuantity = testPhysicalQuantity.convert(USFoot())

        assertEquals(expectedPhysicalQuantity.quantity, actualPhysicalQuantity.quantity, 0.1)

        val testPhysicalQuantity2 = PhysicalQuantity(1.5, ImperialTon())
        val expectedPhysicalQuantity2 = PhysicalQuantity(1.68, USTon())
        val actualPhysicalQuantity2 = testPhysicalQuantity2.convert(USTon())

        assertEquals(expectedPhysicalQuantity2.quantity, actualPhysicalQuantity2.quantity, 0.1)

        val testPhysicalQuantity3 = PhysicalQuantity(100.0, ImperialFluidOunce())
        val expectedPhysicalQuantity3 = PhysicalQuantity(3.00237, USQuart())
        val actualPhysicalQuantity3 = testPhysicalQuantity3.convert(USQuart())

        assertEquals(expectedPhysicalQuantity3.quantity, actualPhysicalQuantity3.quantity, 0.1)
    }

    @Test
    fun convert_returnsCorrectValue_when_conversionIsUSCustomaryToImperial() {
        val testPhysicalQuantity = PhysicalQuantity(3.0, USFoot())
        val expectedPhysicalQuantity = PhysicalQuantity(1.0, ImperialYard())
        val actualPhysicalQuantity = testPhysicalQuantity.convert(ImperialYard())

        assertEquals(expectedPhysicalQuantity.quantity, actualPhysicalQuantity.quantity, 0.1)

        val testPhysicalQuantity2 = PhysicalQuantity(7.0, USPound())
        val expectedPhysicalQuantity2 = PhysicalQuantity(0.5, ImperialStone())
        val actualPhysicalQuantity2 = testPhysicalQuantity2.convert(ImperialStone())

        assertEquals(expectedPhysicalQuantity2.quantity, actualPhysicalQuantity2.quantity, 0.1)

        val testPhysicalQuantity3 = PhysicalQuantity(2.0, USTablespoon())
        val expectedPhysicalQuantity3 = PhysicalQuantity(0.0260211, ImperialQuart())
        val actualPhysicalQuantity3 = testPhysicalQuantity3.convert(ImperialQuart())

        assertEquals(expectedPhysicalQuantity3.quantity, actualPhysicalQuantity3.quantity, 0.1)
    }

    @Test
    fun convert_returnsCorrectValue_when_conversionIsUSCustomaryToMetric() {
        val testPhysicalQuantity = PhysicalQuantity(2.0, USCup())
        val expectedPhysicalQuantity = PhysicalQuantity(0.48, Liter())
        val actualPhysicalQuantity = testPhysicalQuantity.convert(Liter())

        assertEquals(expectedPhysicalQuantity, actualPhysicalQuantity)

        val testPhysicalQuantity2 = PhysicalQuantity(2.0, USCup())
        val expectedPhysicalQuantity2 = PhysicalQuantity(480.0, Liter(Milli()))
        val actualPhysicalQuantity2 = testPhysicalQuantity2.convert(Liter(Milli()))

        assertEquals(expectedPhysicalQuantity2, actualPhysicalQuantity2)

        val testPhysicalQuantity3 = PhysicalQuantity(1.0, USTon())
        val expectedPhysicalQuantity3 = PhysicalQuantity(907.1850, Gram(Kilo()))
        val actualPhysicalQuantity3 = testPhysicalQuantity3.convert(Gram(Kilo()))

        assertEquals(expectedPhysicalQuantity3.quantity, actualPhysicalQuantity3.quantity, 0.1)

        val testPhysicalQuantity4 = PhysicalQuantity(2.0, Meter(Kilo()))
        val expectedPhysicalQuantity4 = PhysicalQuantity(1.24274, USMile())
        val actualPhysicalQuantity4 = testPhysicalQuantity4.convert(USMile())

        assertEquals(expectedPhysicalQuantity4.quantity, actualPhysicalQuantity4.quantity, 0.1)

        val testPhysicalQuantity5 = PhysicalQuantity(2.0, Meter(Kilo()))
        val expectedPhysicalQuantity5 = PhysicalQuantity(1.24274, USMile())
        val actualPhysicalQuantity5 = testPhysicalQuantity5.convert(USMile())

        assertEquals(expectedPhysicalQuantity5.quantity, actualPhysicalQuantity5.quantity, 0.1)
    }

    @Test
    fun convert_returnsCorrectValue_when_conversionIsMetricToUSCustomary() {
        val testPhysicalQuantity4 = PhysicalQuantity(2.0, Meter(Kilo()))
        val expectedPhysicalQuantity4 = PhysicalQuantity(1.24274, USMile())
        val actualPhysicalQuantity4 = testPhysicalQuantity4.convert(USMile())

        assertEquals(expectedPhysicalQuantity4.quantity, actualPhysicalQuantity4.quantity, 0.1)

        val testPhysicalQuantity5 = PhysicalQuantity(1.0, Gram())
        val expectedPhysicalQuantity5 = PhysicalQuantity(0.035274, USOunce())
        val actualPhysicalQuantity5 = testPhysicalQuantity5.convert(USOunce())

        assertEquals(expectedPhysicalQuantity5.quantity, actualPhysicalQuantity5.quantity, 0.1)

        //Multiple conversions to the same physical quantity
        val testPhysicalQuantity6 = PhysicalQuantity(100.0, Gram())
       testPhysicalQuantity6.convert(Gram(Kilo()))

        val expectedPhysicalQuantity7 = PhysicalQuantity(0.220462, USPound())
        val actualPhysicalQuantity7 = testPhysicalQuantity6.convert(USPound())

        assertEquals(expectedPhysicalQuantity7.quantity, actualPhysicalQuantity7.quantity, 0.1)
    }

    @Test
    fun convert_returnsCorrectValue_when_conversionIsMetricToImperial() {
        val testPhysicalQuantity4 = PhysicalQuantity(20.1168, Meter())
        val expectedPhysicalQuantity4 = PhysicalQuantity(1.0, ImperialChain())
        val actualPhysicalQuantity4 = testPhysicalQuantity4.convert(ImperialChain())

        assertEquals(expectedPhysicalQuantity4.quantity, actualPhysicalQuantity4.quantity, 0.1)

        val testPhysicalQuantity5 = PhysicalQuantity(7.0, Gram(Kilo()))
        val expectedPhysicalQuantity5 = PhysicalQuantity(1.10231, ImperialStone())
        val actualPhysicalQuantity5 = testPhysicalQuantity5.convert(ImperialStone())

        assertEquals(expectedPhysicalQuantity5.quantity, actualPhysicalQuantity5.quantity, 0.1)

        //Multiple conversions to the same physical quantity
        val testPhysicalQuantity6 = PhysicalQuantity(1.0, Liter())
        testPhysicalQuantity6.convert(ImperialQuart())

        val expectedPhysicalQuantity7 = PhysicalQuantity(4.1666666989, USCup())
        val actualPhysicalQuantity7 = testPhysicalQuantity6.convert(USCup())

        assertEquals(expectedPhysicalQuantity7.quantity, actualPhysicalQuantity7.quantity, 0.1)
    }

    private fun assertEquals(expected: Double, actual: Double?, epsilon: Double, message: String? = null) {
        asserter.assertNotNull(null, actual)
        asserter.assertTrue({ messagePrefix(message) + "Expected <$expected>, actual <$actual>, should differ no more than <$epsilon>." },
                abs(expected - actual!!) <= epsilon)
    }

    private fun messagePrefix(message: String?) = if (message == null) "" else "$message. "
}