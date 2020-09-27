@file:Suppress("PrivatePropertyName")

package com.darrenfinch.physicalquantities

import com.darrenfinch.physicalquantities.unittypes.Length
import com.darrenfinch.physicalquantities.unittypes.Volume
import com.darrenfinch.physicalquantities.unittypes.Weight
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class VolumeTest {
    private lateinit var SUT: Volume

    @BeforeEach
    fun setUp() {
        SUT = Volume()
    }

    @Test
    fun isCompatibleForConversionTo_returnsTrue_whenGivenVolume() {
        assertTrue(SUT.isCompatibleForConversionTo(Volume()))
    }

    @Test
    fun isCompatibleForConversionTo_returnsTrue_whenGivenWeight() {
        assertTrue(SUT.isCompatibleForConversionTo(Weight()))
    }

    @Test
    fun isCompatibleForConversionTo_returnsFalse_whenGivenLength() {
        assertFalse(SUT.isCompatibleForConversionTo(Length()))
    }
}