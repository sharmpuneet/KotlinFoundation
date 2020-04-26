fun main(args: Array<String>) {
    val a = 2
    val b = 3

    if (a == b) {
        println("A does in fact equal b")
    }

    if (a != b) {
        println("A does not equal b")
    }

    val accountBalance = 100
    val price = 50

    if (accountBalance >= price) {
        println("You can buy this")
    } else {
        println("You cannot buy this")
    }

    val degrees = 70

    if (degrees >= 70) {
        println("This is some nice weather")
    } else if (degrees >= 50 && degrees < 70) {
        println("Get a Sweater")
    } else {
        println("Its Cold!!")
    }

    val isHungry = false
    val isBored = true

    if (isHungry || isBored) {
        println("Lets get Pizza")
    }

    val x = 3

    when (x) {
        1 -> println("x is equal to 1")
        2 -> println("x is equal to 2")
        else -> println("x is not equal to 1 or 2")
    }

    fun vaderIsFeeling(mood: String = "Angry") {
        if (mood == "Angry") {
            println("RUn for hill, Vader is $mood")
        } else {
            println("Whatever you do, don't make him angry")
        }
    }

    vaderIsFeeling("happy")

}