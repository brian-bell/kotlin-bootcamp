package aquarium

fun main (args: Array<String>) {
    buildAquarium()
    makeFish()
}

fun buildAquarium() {
    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length} " +
        "Width: ${myAquarium.width} " +
        "Height: ${myAquarium.height}")

    myAquarium.height = 80;

    println("Height: ${myAquarium.height} cm")

    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(length = 80, width = 10, height = 30)
    println("Small Aquarium Volume: ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfFish = 2)
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color} \n Plecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}

fun feedFish(fish: FishAction) {
    fish.eat()
}