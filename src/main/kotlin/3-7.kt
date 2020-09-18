fun main(args: Array<String>) {
    var fortune: String = "";
    while (!fortune.contains("Try again")) {
        fortune = getFortune(getBirthday())
        println("Your fortune is: $fortune")
    }
}

fun getFortune(birthday: Int): String {
    return when {
        birthday.rem(3) == 0 -> "Bad fortune :("
        birthday.rem(2) == 0 -> "Great fortune!"
        else -> "Try again some other time."
    }
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun eagerExample() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    val eager = decorations.filter { it[0] == 'p' }
    println(eager)

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println(filtered)
    println(filtered.toList())
}