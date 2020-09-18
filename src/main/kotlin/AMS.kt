import java.util.*

fun main(args: Array<String>) {
    //feedTheFish()
    println(fitMoreFish(10.0, listOf(3,3,3)))
    println(fitMoreFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(fitMoreFish(9.0, listOf(1,1,3), 3))
    println(fitMoreFish(10.0, listOf(), 7, true))

    repeat(times = 4) { println("foo") }
}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = getDirtySensorReading()) : Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun getDirtySensorReading() = 20

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    if (shouldChangeWater(day)) {
        println("Change the water today")
    }
    swim(speed = "slow", time = 50)

    dirtyProcessor()
}

fun swim(time: Int, speed: String = "fast") {
    println("swimming $speed for $time")
}

fun randomDay(): String {
    val week = listOf("Mon", "Tues", "Weds", "Thurs", "Fri", "Sat", "Sun")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    return when (day) {
        "Mon" -> "flakes"
        "Weds" -> "redworms"
        "Thurs" -> "granules"
        "Fri" -> "mosquitos"
        "Sun" -> "plankton"
        else -> "fasting"
    }
}

fun fitMoreFish(
    tankSizeGallons: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true) : Boolean {
    return currentFish.sum().plus(fishSize) <= tankSizeGallons.times(if (hasDecorations) 0.8 else 1.0)
}

var dirty = 20
val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor() {
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)
    dirty = updateDirty(dirty, { dirty -> dirty + 50 })
}