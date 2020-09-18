package filters

fun main(args: Array<String>) {
    spicesExample()
}

fun eagerExample() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    val eager = decorations.filter { it[0] == 'p' }
    println(eager)

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println(filtered)
    println(filtered.toList())
}

fun spicesExample() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    println(spices.filter { it.contains("curry") }.sortedBy { it.length })
    println(spices.filter { it[0] == 'c' && it[it.length-1] == 'e'})
    println(spices.asSequence().filter { it[0] == 'c' && it[it.length-1] == 'e'})
    println(spices.subList(0, 2).filter { it[0] == 'c' })
}