package converter

fun main() {
    print("Enter a number and a measure: ")
    val (value, type) = readln().split(" ")

    when (type.lowercase()) {
        "km" -> kilometersToMeters(value.toInt())
        "kilometer" -> kilometersToMeters(value.toInt())
        "kilometers" -> kilometersToMeters(value.toInt())
        else -> println("Wrong input")
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
