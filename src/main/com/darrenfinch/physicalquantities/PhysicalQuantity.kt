package com.darrenfinch.physicalquantities

import com.darrenfinch.physicalquantities.units.MeasurementUnit

class PhysicalQuantity(val quantity: Double, val measurementUnit: MeasurementUnit) {
    /**
     * Returns a new PhysicalQuantity with an updated unit.
     * This doesn't sound too complicated until you remember that you must also update the numerical quantity so the actual measurement remains the same.
     * For example, you have 1 yard. That's 36 inches or 3 feet. But there's more. What is that in miles? Or heck, what is it in meters, centimeters, or kilometers?
     * This function solves all of that by allowing you to simply provide your desired unit,
     * and it will return a new PhysicalQuantity with the new unit and the transformed quantity.
     * @param newUnit   The unit of the transformed PhysicalQuantity returned from this function.
     * @return  The new PhysicalQuantity with the new measurement unit and transformed quantity.
     */
    fun convert(newUnit: MeasurementUnit): PhysicalQuantity {
        //TODO(): Change quantity to reflect the same measurement, but expressed in the new measurement unit.

        // Here is the algorithm for conversion.
        // Step 1: For each type of unit, create an array of ratios between each unit and the base unit.
        // For instance, in the volume type of unit, the base unit is Cup. Every volume unit will know the ratio between itself and the base unit.

        // Step 2: Figure out the desired type of unit conversion (for now, Imperial to Imperial, Imperial to Metric, Metric to Metric, Metric to Imperial)

        // Step 3: Perform the correct routine for each type of conversion:
        // For Imperial to Imperial conversion:
        //  Step 1: After insuring that the conversion is possible, get ratio of the original unit to the base unit.
        //  Step 2: Figure out if the original unit is smaller or bigger than the base unit.
        //  Step 3: Multiply or divide the original quantity by this ratio to convert the original unit to the base unit.
        //  Step 4: Get ratio of the new unit to the base unit.
        //  Step 5: Repeat steps 3-4 for the updated quantity and new unit to get the final quantity.
        //
        //  E.g: Convert 2 pint to tablespoons.
        //  1. 1 pint = 2 cups.
        //  2. Pint is larger than the base unit, so we should multiply.
        //  3. 2 * 2 = 4 cups
        //  4. 1 tablespoon = 0.0625 cups
        //  5. Tablespoon is smaller than the base unit, so we should divide.
        //  6. 4 / 0.0625 = 64 tablespoons
        //  Algorithm complete!

        // For Imperial to Metric conversion:
        //  Step 1: Insure conversion is possible.
        //  Step 2: By methods described previously, convert original unit to its base unit.
        //  Step 3: Get ratio of the imperial base unit to the equivalent metric base unit.

        return PhysicalQuantity(quantity, measurementUnit)
    }
}