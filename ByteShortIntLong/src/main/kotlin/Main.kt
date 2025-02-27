//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var number: Int = 22

    val maxIntValue: Int = Int.MAX_VALUE
    val minIntValue: Int = Int.MIN_VALUE
    println("MinInt=$minIntValue, MaxInt=$maxIntValue")

    number = 2147483647

    val myMaxByte: Byte = Byte.MAX_VALUE
    val myMinByte: Byte = Byte.MIN_VALUE
    println("MinByte=$myMinByte, MaxByte=$myMaxByte")

    val myMaxShort: Short = Short.MAX_VALUE
    val myMinShort: Short = Short.MIN_VALUE
    println("MinShort=$myMinShort, MaxShort=$myMaxShort")

    val myMaxLong: Long = Long.MAX_VALUE
    val myMinLong: Long = Long.MIN_VALUE
    println("MaxLong = $myMaxLong, MinLong = $myMinLong")


    val myNumber = 28L
    println(myNumber    )
}