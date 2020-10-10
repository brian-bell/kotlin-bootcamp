package Spice

class Spice (val name: String, private val spiceLevel: String = "mild") {

    val heat: Int
        get() {
            return when (spiceLevel) {
                "hot" -> 10
                "medium" -> 7
                "mild" -> 5
                else -> 0
            }
        }

    init {
        println("New Spice Name: ${name}, Heat: ${heat}")
    }
}