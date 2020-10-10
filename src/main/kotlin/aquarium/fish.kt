package aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    var size: Int = 0

    init {
        println("first init block")
    }

    constructor(): this(true, 9) {
        println("running secondary constructor")
    }

//    init {
//        if (friendly) {
//            size = volumeNeeded
//        } else {
//            volumeNeeded = volumeNeeded * 2
//        }
//    }

    init {
        println("constructed fihs of size $volumeNeeded final size ${this.size}")
    }
}

fun fishExample() {
    val fish = Fish(true, 20)
    println("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
}