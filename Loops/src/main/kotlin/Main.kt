fun main() {
    var number: Int = 0
    val lastNumber: Int = 20
    var oddNumsCnt: Int = 0
    while (number <= lastNumber) {
//        ++number
        println(number)
        if (!isOdd(number)){
            continue
        }

        oddNumsCnt++
        println(number)
    }
    println("total odd nums = $oddNumsCnt")
}

fun isOdd(num: Int): Boolean{
    return num%2 != 0
}


//fun main() {
//    var num: Int = 0
//
//    while (num < 10) {
//        println(num)
//        num++
//    }
//}



//fun main() {
//    for (i in 1..10){
//        println("i = $i")
//    }

//    for (i in 1..<10){
//        println("i = $i")
//    }

//    for (i in 10 downTo 1   ){
//        println("i = $i")
//    }

//    for (i in 1..< 10 step 2){
//        println("i = $i")
//    }

//    for (i in 1..10){
//        println(i)
//    }
//}