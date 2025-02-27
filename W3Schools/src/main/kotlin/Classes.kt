class Car(var brand: String, var model: String, var year: Int) {
    fun drive(){
        println("Wrooom!")
        println("$brand, $model, $year")
    }

    fun speed(maxSpeed: Int){
        println(maxSpeed)
    }
}

fun main() {
    val c1 = Car("Ford", "Mustang", 1969)
    val c2 = Car("BMW", "X5", 1999)
    val c3 = Car("Tesla", "Model S", 2020)
    c1.drive()
    c1.speed(200)
    var x: String = "Hello"
    var y: String = "Hello2"
    print(y.compareTo(x))
}