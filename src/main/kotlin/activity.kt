import java.util.stream.DoubleStream

fun main(args: Array<String>) {
    println(whatShouldIDoToday(getUserMood()))
}

fun getUserMood() : String {
    print("What's your current mood? ")
    return readLine()!!
}
fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24): String {
    return when {
        doWalking(mood, weather) -> "go for a walk"
        doCooking(mood) -> "cook"
        doNapping(mood) -> "take a nap"
        doStayInBed(mood, weather, temperature) -> "stay in bed"
        doSwimming(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun doWalking(mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun doCooking(mood: String) = mood == "hungry"
fun doNapping(mood: String) = mood == "tired"
fun doStayInBed(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun doSwimming(temperature: Int) = temperature > 35
