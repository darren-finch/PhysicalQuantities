@file:Suppress("PrivatePropertyName")

package com.darrenfinch.physicalquantities

import com.darrenfinch.physicalquantities.units.UnitType
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class LengthTest {
    private var SUT = UnitType.Length

    @Test
    fun isCompatibleForConversionTo_returnsTrue_whenGivenLength() {
        assertTrue(SUT.isCompatibleForConversionTo(UnitType.Length))
    }

    @Test
    fun isCompatibleForConversionTo_returnsFalse_whenGivenMass() {
        assertFalse(SUT.isCompatibleForConversionTo(UnitType.Mass))
    }

    @Test
    fun isCompatibleForConversionTo_returnsFalse_whenGivenVolume() {
        assertFalse(SUT.isCompatibleForConversionTo(UnitType.LiquidVolume))
    }
}