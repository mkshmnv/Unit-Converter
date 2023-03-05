package converter

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

fun main() {
    print("Enter a number and a measure: ")
    val (value, type) = readln().split(" ")

    when (unitDefinition(type)) {
        Units.MILLIMETERS -> // TODO MILLIMETERS
        Units.CENTIMETERS -> // TODO CENTIMETERS
        Units.METERS -> // TODO METERS
        Units.KILOMETERS -> kilometersToMeters(value.toInt())
        Units.MILES -> // TODO MILES
        Units.YARDS -> // TODO YARDS
        Units.FEET -> // TODO FEET
        Units.INCHES -> // TODO INCHES
        else -> println("Wrong input")
    }
}
fun unitDefinition(unitMeasurement: String) : Units {
    when (unitMeasurement.lowercase()) {
        // Meters: the user can input "m", "meter", or "meters"

        // Kilometers: the user can input "km", "kilometer", or "kilometers".
        "km" -> Units.KILOMETERS
        "kilometer" -> Units.KILOMETERS
        "kilometers" -> Units.KILOMETERS
    }
}

fun kilometersToMeters(value: Int) {
    println(
        if (value == 1) {
            "$value kilometer is 1000 meters"
        } else {
            "$value kilometers is ${value * 1000} meters"
        }
    )
}
