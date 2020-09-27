@file:Suppress("PrivatePropertyName")

package com.darrenfinch.physicalquantities

import com.darrenfinch.physicalquantities.unittypes.Length
import com.darrenfinch.physicalquantities.unittypes.Volume
import com.darrenfinch.physicalquantities.unittypes.Weight
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class LengthTest {
    private lateinit var SUT: Length

    @BeforeEach
    fun setUp() {
        SUT = Length()
    }

    @Test
    fun isCompatibleForConversionTo_returnsTrue_whenGivenLength() {
        assertTrue(SUT.isCompatibleForConversionTo(Length()))
    }

    @Test
    fun isCompatibleForConversionTo_returnsFalse_whenGivenWeight() {
        assertFalse(SUT.isCompatibleForConversionTo(Weight()))
    }

    @Test
    fun isCompatibleForConversionTo_returnsFalse_whenGivenVolume() {
        assertFalse(SUT.isCompatibleForConversionTo(Volume()))
    }
}