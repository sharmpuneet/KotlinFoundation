fun main(args: Array<String>) {
    val rebels = arrayListOf("Leiah", "Luke", " Han Solo", "Mon Mothma")
    val rebelVehicles = hashMapOf("Solo" to "Millennium Falcon", "Luke" to "Land Speeder", "Boba Fett" to "Rocket Pack")

    for (rebel in rebels) {
        println("Name: $rebel")
    }

    for ((character, vehicle) in rebelVehicles) {
        println("$character gets around in $vehicle")
    }

    var x = 10

    while (x > 0) {
        println(x)
        x--
    }
}