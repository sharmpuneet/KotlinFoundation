fun main(args: Array<String>) {

    // Immutable
    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")
    println(imperials)
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.first())
    println(imperials.last())
    println(imperials.contains("Luke"))

    // Mutable

    val rebels = arrayListOf("Leiah", "Luke", " Han Solo", "Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0, "Lando")
    println(rebels)
    println(rebels.indexOf("Luke"))
    println(rebels.remove("Han Solo"))
    println(rebels)

    // Map Immutable

    val rebelVehiclesMap = mapOf("Solo" to "Millennium Falcon", "Luke" to "Land Speeder")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Luke"))
    println(rebelVehiclesMap.getOrDefault("Leiah", "This ship does not exist"))
    println(rebelVehiclesMap.values)

    // Map Mutable

    val rebelVehicles = hashMapOf("Solo" to "Millennium Falcon", "Luke" to "Land Speeder", "Boba Fett" to "Rocket Pack")
    rebelVehicles["Luke"] = "XWing"
    rebelVehicles.put("Leiah", "Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)
    rebelVehicles.clear()
    println(rebelVehicles.isEmpty())


}