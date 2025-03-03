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


enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 15),
    WEST("west", 40);

    fun printData() {
        println("Direction=$direction and Distance=$distance")
    }
}

class ListView(val items: Array<String>) {
    inner class ListViewItem() {
        fun displayItem(position: Int) {
            println(items[position])
        }
    }
}
