package Spice

class SimpleSpice {
    val name: String = "curry";
    private val spiceLevel: String = "mild"

    val heat: Int
        get() {
            return when (spiceLevel) {
                "mild" -> 5
                else -> 0
            }
        }
}