fun main() {
    val names = arrayOf("John", "Stew", "Didi")
    val mixedElements = arrayOf(1, 2, 3, 4, 5, 6, "nums", 'l', 3.2)
    names[0] = "Dias"
    println("first name = ${names[0]}")
    println("Array size = ${names.size}")

    for (i in mixedElements){
        if (i is String){
            println(i)
        }
    }
}