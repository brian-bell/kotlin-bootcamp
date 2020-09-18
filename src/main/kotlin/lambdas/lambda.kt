package lambdas

import java.util.*

fun main(args: Array<String>) {
    gamePlay(rollDice2)
}

// function with no name
val rollDice = { sides: Int -> if (sides == 0) 0 else Random().nextInt(sides) + 1 }
val rollDice2: (sides: Int) -> Int = { sides -> if (sides == 0) 0 else Random().nextInt(sides) + 1 }

val gamePlay: (roller: (Int) -> Int) -> Any = { roller -> println(roller(12)) }