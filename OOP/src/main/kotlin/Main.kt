fun main() {
    val diasAccount = Account("Dias")
    diasAccount.deposit(600)
    diasAccount.deposit(-800)
    diasAccount.withdraw(400)
    diasAccount.withdraw(-233)
    val asdAccount = Account("asd")
    asdAccount.deposit(123)
    asdAccount.withdraw(123)
    asdAccount.deposit(12312)
    println(asdAccount.calculateBalance())
}

class Account(val accountName: String) {
    private var balance: Int = 0
    private var transactions = mutableListOf<Int>()

    fun deposit(amount: Int) {
        if (amount > 0) {
            transactions.add(amount)
            this.balance += amount
            println("$amount was added. Balance now = $balance")
        } else {
            println("cannot deposit amount that equal or lower than 0")
        }
    }

    fun withdraw(withdrawal: Int) {
        if (-withdrawal < 0) {
            transactions.add(-withdrawal)
            this.balance += (-withdrawal)
            println("$withdrawal was with. Balance now = $balance")
        } else {
            println("cannot withdraw negative sums")
        }
    }

    fun calculateBalance(): Int {
        this.balance = 0
        for (transaction in transactions){
            this.balance += transaction
        }
        return this.balance
    }
}


//fun main() {
//    val listView = ListView(arrayOf("name1", "name2", "name3", "name4"))
//    listView.ListViewItem().displayItem(3)
//}


//fun main() {
//    val direction = Direction.valueOf("east".uppercase())
//
//    when(direction) {
//        Direction.EAST -> println("The direction is East")
//        Direction.NORTH -> println("The direction is NORTH")
//        Direction.SOUTH -> println("The direction is SOUTH")
//        Direction.WEST -> println("The direction is WEST")
//    }
//}
//
