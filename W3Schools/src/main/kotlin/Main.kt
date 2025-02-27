fun main() {
    println("Hello World!")

    var name: String = "Dias"
    val birthyear: Short = 1975
    name = "Aziza"
    println("Hello $name, were you born in $birthyear")

    var x: Int = 100 + 50
    var sum1: Int = x + 50
    val sum2: Int = sum1 + 50
    x %= 3
    println("$x, $sum1, $sum2")

    var txt1: String = "Dias Hello"
    val txt2: String = "Compare"
    println(txt1[0] + "" + txt1[7])
    println(txt1.length)
    println(txt1.uppercase())
    println(txt1.lowercase())
    println(txt1.compareTo(txt2))

    txt1 = "Please locate where 'locate' occurs!"
    println(txt1.indexOf("locate"))


    val day = 7

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

//    var i: Int = 0
//    while (i < 5) {
//        println(i)
//        i++
//    }
//    println(i)
//    i = 0
//    do {
//        println(i)
//        i++
//    }
//    while (i < 5)
//    println(i)
//
//
//    x = 0
//    while (x > 0) {
//        println(x)
//        x--
//    }
//
//
//    var y = 0
//    do {
//        println("y=$y")
//        y--
//    } while (y > 0)

    for (chars in 'a'..'x') {
        println(chars)
    }
}