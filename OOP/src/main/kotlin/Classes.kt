class Car(brand: String, var model: String, var color: String, var doors: Int) {
    var brand: String = brand.trim()
    fun move() {
        println("The car $brand is moving")
    }

    fun stop() {
        println("The car $brand is stopping")
    }
}

class User(var name: String, var lastname: String, var age: Int) {
    init {
        println("User: $name was created")
    }
}

class Calculator() {
    companion object{
        fun sum (a: Int, b:Int): Int{
            return a+b
        }
    }
}

object Database {
    init {
        println("DB created")
    }
}