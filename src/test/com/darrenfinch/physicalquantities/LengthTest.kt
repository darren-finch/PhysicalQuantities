@file:Suppress("PrivatePropertyName")

package com.darrenfinch.physicalquantities

import com.darrenfinch.physicalquantities.units.MeasurementType
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class LengthTest {
    private var SUT = MeasurementType.Length

    @Test
    fun isCompatibleForConversionTo_returnsTrue_whenGivenLength() {
        assertTrue(SUT.isCompatibleForConversionTo(MeasurementType.Length))
    }

    @Test
    fun isCompatibleForConversionTo_returnsFalse_whenGivenMass() {
        assertFalse(SUT.isCompatibleForConversionTo(MeasurementType.Mass))
    }

    @Test
    fun isCompatibleForConversionTo_returnsFalse_whenGivenVolume() {
        assertFalse(SUT.isCompatibleForConversionTo(MeasurementType.LiquidVolume))
    }
}