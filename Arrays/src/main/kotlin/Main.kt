fun main() {
    val max = findMaxAndMin(arrayOf(1, 2, 34, -23, 41245315, 123123, 3, 5, 6, 7, 7, 8, 3, 3, 3, 3, 3), false)
    println("max = $max and min = ")
}

fun findMaxAndMin(nums: Array<Int>, searchMax: Boolean): Int {
    var max = nums[0]
    var min = nums[0]
    for (num in nums) {
        if (num > max) {
            max = num
        }
        if (num < min){
            min = num
        }
    }

    if (searchMax){
        return max
    }

    return min
}


//fun main() {
//    val names = arrayOf("John", "Stew", "Didi")
//    val mixedElements = arrayOf(1, 2, 3, 4, 5, 6, "nums", 'l', 3.2)
//    names[0] = "Dias"
//    println("first name = ${names[0]}")
//    println("Array size = ${names.size}")
//
//    for (i in mixedElements){
//        if (i is String){
//            println(i)
//        }
//    }
//}