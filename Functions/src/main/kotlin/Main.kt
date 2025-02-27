fun main() {
    sum(1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 6)
//    println(sum(5, 6, 7, 10, 8, 7, 3))

    //    println(getMax(1, 2))
    //    greetingSomeone(hello = returnGreeting(), name = "dias")
}

fun sum(vararg numbers: Int){
    numbers.forEach { println(it) } }

//fun getMax(x: Int, y: Int): Int {
//    val max: Int = if (x > y) x else y
//    return max
//}
//
//fun greetingSomeone(name: String = "Dias", hello: String = "Hello") {
//    println("$hello $name")
//}
//
//fun returnGreeting():String {
//    return "Hello Dias"
//}