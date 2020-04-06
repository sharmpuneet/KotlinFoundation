fun main(args: Array<String>) {
    val str = "May the force be with you"

    // Escaped String

    var str1 = "My dad said the funniest thing he said \"A joke\""
    var strBackSlashNewLine = "I will jump \n high"
    var strBackSlashTab = "I will jump \t high"
    var strBackSlash = "I will jump \bhigh"
    var strCarriageReturn = "I will see\r you later"
    var strSingleQuotation = "I will see\' you later"
    var strBackSlashDouble = "I will see\\ you later"
    var strDollar = "I will see\$ you later"

    println(str)
    println(str1)
    println(strBackSlashNewLine)
    println(strBackSlashTab)
    println(strBackSlash)
    println(strCarriageReturn)
    println(strSingleQuotation)
    println(strBackSlashDouble)
    println(strDollar)

    // Raw String

    val rawCrawl = """ |A long time ago, 
        |in a galaxy
        |far, far, away...
        |BUMM.. BUMM""".trimMargin()

    println(rawCrawl)

    for (char in str) {
        println(char)
    }

    val testStr = "May the force be with all of us"

    //Compare Strings
    println(testStr.contentEquals("long time"))

    // If a string contains a particular character sequence
    println(testStr.contains("may", true))

    val upperCase = testStr.toUpperCase()
    val lowerCase = testStr.toLowerCase()

    println(upperCase)
    println(lowerCase)

    val num = 6
    val strNum = num.toString()
    println(strNum)

    val subSequence = str.subSequence(4, 13)
    println(subSequence)

    // String templates
    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    val age = 27

    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle and is age $age")
    println("Lukes full name $luke has ${luke.length}")
}