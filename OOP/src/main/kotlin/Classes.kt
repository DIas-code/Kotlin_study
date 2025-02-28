class Car(brand: String, var model: String, var color: String, var doors: Int) {
    var brand: String = brand.trim()
    fun move() {
        println("The car $brand is moving")
    }

    fun stop() {
        println("The car $brand is stopping")
    }
}