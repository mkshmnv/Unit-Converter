package converter

import kotlin.system.exitProcess

enum class Units {
    METERS,
    KILOMETERS,
    CENTIMETERS,
    MILLIMETERS,
    MILES,
    YARDS,
    FEET,
    INCHES
}

class UnitConverter {

    private var unit: Units?
    private var value: Double

    init {
        print("Enter a number and a measure of length: ")
        val (value, inputUnit) = readln().split(" ")

        unit = null
        this.value = value.toDouble()

        defineUnitMeasurement(inputUnit)
    }

    private fun defineUnitMeasurement(inputUnit: String) {
        when (inputUnit.lowercase()) {
            // Meters: the user can input "m", "meter", or "meters"
            "m" -> unit = Units.METERS
            "meter" -> unit = Units.METERS
            "meters" -> unit = Units.METERS

            // Kilometers: the user can input "km", "kilometer", or "kilometers".
            "km" -> unit = Units.KILOMETERS
            "kilometer" -> unit = Units.KILOMETERS
            "kilometers" -> unit = Units.KILOMETERS

            // Centimeters: the user can input "cm", "centimeter", or "centimeters".
            "cm" -> unit = Units.CENTIMETERS
            "centimeter" -> unit = Units.CENTIMETERS
            "centimeters" -> unit = Units.CENTIMETERS

            // Millimeters: the user can input "mm", "millimeter", or "millimeters".
            "mm" -> unit = Units.MILLIMETERS
            "millimeter" -> unit = Units.MILLIMETERS
            "millimeters" -> unit = Units.MILLIMETERS

            // Miles: the user can input "mi", "mile", or "miles".
            "mi" -> unit = Units.MILES
            "mile" -> unit = Units.MILES
            "miles" -> unit = Units.MILES

            // Yards: the user can input "yd", "yard", or "yards".
            "yd" -> unit = Units.YARDS
            "yard" -> unit = Units.YARDS
            "yards" -> unit = Units.YARDS

            // Feet: the user can input "ft", "foot", or "feet".
            "ft" -> unit = Units.FEET
            "foot" -> unit = Units.FEET
            "feet" -> unit = Units.FEET

            // Inches: the user can input "in", "inch", or "inches".
            "in" -> unit = Units.INCHES
            "inch" -> unit = Units.INCHES
            "inches" -> unit = Units.INCHES
            else -> {
                println("Wrong input. Unknown unit $inputUnit")
                exitProcess(0)
            }
        }
    }

    fun toMeters() {
        if (unit != null) {
            var calculateValue = 0.0
            var output = ""

            when (unit) {
                Units.METERS -> {
                    calculateValue = value * 1.0
                    output = value.toString()
                    output += if (value == 1.0) " meter" else " meters"
                }

                Units.KILOMETERS -> {
                    calculateValue = value * 1000
                    output = value.toString()
                    output += if (value == 1.0) " kilometer" else " kilometers"
                }

                Units.CENTIMETERS -> {
                    calculateValue = value * 0.01
                    output = value.toString()
                    output += if (value == 1.0) " centimeter" else " centimeters"
                }

                Units.MILLIMETERS -> {
                    calculateValue = value * 0.001
                    output = value.toString()
                    output += if (value == 1.0) " millimeter" else " millimeters"
                }

                Units.MILES -> {
                    calculateValue = value * 1609.35
                    output = value.toString()
                    output += if (value == 1.0) " mile" else " miles"
                }

                Units.YARDS -> {
                    calculateValue = value * 0.9144
                    output = value.toString()
                    output += if (value == 1.0) " yard" else " yards"
                }

                Units.FEET -> {
                    calculateValue = value * 0.3048
                    output = value.toString()
                    output += if (value == 1.0) " foot" else " feet"
                }

                Units.INCHES -> {
                    calculateValue = value * 0.0254
                    output = value.toString()
                    output += if (value == 1.0) " inch" else " inches"
                }
            }

        output += " is $calculateValue "
        output += if (calculateValue == 1.0) "meter" else "meters"
        println(output)

        }
    }
}