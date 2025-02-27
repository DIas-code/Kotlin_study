fun main() {
    var isActive: Boolean = false
    if (!isActive){
        println("Hello World!")
    }
    else{
       println("No Hello World!")
    }
    var txt: String = when (isActive) {
        true -> "true"
        else -> "false"
    }
    println(txt)
}