package Spice

fun main(args: Array<String>) {
    val spices = listOf(
        Spice(name = "curry"),
        Spice(name = "cayenne", spiceLevel = "medium"),
        Spice(name = "ghost pepper", spiceLevel = "hot")
    )

    val spicySpices = spices.filter { s -> s.heat > 5 }
    spicySpices.forEach { s -> println("${s.name} is Spicy!") }

    makeSalt()
}

fun makeSalt() = Spice(name="salt", spiceLevel = "none")