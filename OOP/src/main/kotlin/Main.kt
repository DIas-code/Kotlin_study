
fun main() {
    val car1 = Car("    Toyota", "Land Cruiser", "White", 4)

    println("brand = ${car1.brand}")
    println("model = ${car1.model}")
    println("color = ${car1.color}")
    println("doors = ${car1.doors}")

    car1.move()
    car1.stop()

    println()

    val car2 = Car("Lexus ", "RX350", "White", 5)

    println("brand = ${car2.brand}")
    println("model = ${car2.model}")
    println("color = ${car2.color}")
    println("doors = ${car2.doors}")

    car2.move()
    car2.stop()
}

class Car(brand: String, var model: String, var color: String, var doors: Int) {
    var brand: String = brand.trim()
    fun move() {
        println("The car $brand is moving")
    }

    fun stop() {
        println("The car $brand is stopping")
    }
}