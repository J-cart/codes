fun main() {

//    longestEvenWord()
//    arrayReduction()


}

fun longestEvenWord() {

    val sentence = "Time to write pleasna greatt code"

    val senList = sentence.split(" ")

    val wordCount = mutableListOf<Int>()

    for (c in senList) {
        wordCount.add(c.length)
    }

//    val highestIndex = wordCount.indexOf(wordCount.max())


    var count = 0
    wordCount.forEach {
        if (it > count && it % 2 == 0) {
            count = it
        }
    }
    println(senList.find {
        it.count() == count
    })
}

fun arrayReduction() {
    val myList = mutableListOf(1, 3, 4)
//    val newList = mutableListOf<Int>()
    for (i in myList.indices) {
        for (j in myList.indices) {
            val newOne = i + j
            myList.remove(j)
            myList.remove(i)
            myList.add(newOne)
        }
        // println(myList)
    }
    /*for (i in myList.indices) {
        val newOne = i + myList[i + 1]
        myList.remove(i + 1)
        myList.remove(i)
        myList.add(newOne)

    }*/
    println(myList)
}


//regionStage 2
class Customer() {
    var id: Int = 0
    var name: String = ""
    var emailAddress: String = ""

}

open class BankAccount() {
    var id: Int = 0
    var balance: Int = 0
    var owner: Customer = Customer()

    fun displayInfo(): String {
        return "Account ID: $id\n" +
                "Account Balance: $balance\n" +
                "Customer ID: ${owner.id}\n" +
                "Customer Name: ${owner.name}\n" +
                "Customer Email Address: ${owner.emailAddress}"

    }

    fun deposit(amount: Int) {
        balance += amount
    }

    fun withdraw(amount: Int) {
        if (balance == 0) {
            println("You currently have no balance to withdraw from, balance is $balance")
            return
        }

        if (amount > balance) {
            println("Amount exceeds your balance, balance is $balance")
            return
        }
        balance -= amount
        if (balance < 0) balance = 0
    }
}

class SavingsAccount : BankAccount() {
    var interestRate = 0
}

class CheckingAccount : BankAccount() {
    var overdraftLimit = 0
}

fun runTransactions() {
    //create customer
    val customerJoe = Customer()
    customerJoe.id = 123
    customerJoe.name = "Joe"
    customerJoe.emailAddress = "Joe@email.com"

    //create savings account
    val joeSavingsAccount = SavingsAccount()
    joeSavingsAccount.id = 122
    joeSavingsAccount.interestRate = 12
    joeSavingsAccount.owner = customerJoe

    //create checking account
    val joeCheckingAccount = CheckingAccount()
    joeCheckingAccount.id = 121
    joeCheckingAccount.overdraftLimit = 12000
    joeCheckingAccount.owner = customerJoe

    //deposit and check both account balance
    println("depositing ....")
    joeSavingsAccount.deposit(20_000)
    joeCheckingAccount.deposit(10_000)

    println("${customerJoe.name} Savings Account balance is ${joeSavingsAccount.balance}")
    println("${customerJoe.name} Checking Account balance is ${joeCheckingAccount.balance}")

    //withdraw and check both account balance
    println("withdrawing ....")
    joeSavingsAccount.withdraw(2_000)
    joeCheckingAccount.withdraw(11_000)

    println("${customerJoe.name} Savings Account balance is ${joeSavingsAccount.balance}")
    println("${customerJoe.name} Checking Account balance is ${joeCheckingAccount.balance}")

    //check account info
    println("${customerJoe.name} Savings Account info is ${joeSavingsAccount.displayInfo()}")
    println("${customerJoe.name} Checking Account info is ${joeCheckingAccount.displayInfo()}")
}
//endregion


//region previous stages
fun evenOrOdd(num: Int) {
    if (num % 2 == 0) {
        println("$num is a even number")
        return
    }
    println("$num is a odd number")

}

fun greaterOrEqual(num: Int) {
    if (num == 15) {
        println("$num is a even number")
        return
    }
    if (num > 15) {
        println("$num is a even number")
        return
    }
    println("$num is a odd number")

}

fun checkIfItsWeekday(day: Int) {
    if (day in 1..7) {
        when (day) {
            1 -> println("It's Monday")
            2 -> println("It's Tuesday")
            3 -> println("It's Wednesday")
            4 -> println("It's Thursday")
            5 -> println("It's Friday")
            6 -> println("It's Saturday")
            7 -> println("It's Sunday")
        }
        return
    }
    println("It's not a weekday")

}

fun checkGrade(grade: Int) {
    when (grade) {
        in 0..59 -> println("F")
        in 60..69 -> println("D")
        in 70..79 -> println("C")
        in 80..89 -> println("B")
        in 90..100 -> println("A")
        else -> println("It's not a proper grade")
    }
}

fun primeNumber(num: Int): Boolean {
    var isPrime = true
    for (i in 2..num / 2) {
        if (num % i == 0) {
            isPrime = false
            break
        }
    }
    return isPrime
}

fun simulateATM() {
    var balance = 0.0
    println("1. Deposit 2. Withdrawal 3. Check balance")
    val option = readln().toInt()

    when (option) {
        1 -> {
            println("Enter amount to deposit: ")
            val amount = readln().toFloat()
            balance += amount
        }

        2 -> {
            println("Enter amount to withdraw: ")
            val amount = readln().toFloat()
            balance -= amount
        }

        3 -> {
            println("available balance is %.2f".format(balance))
        }

        else -> println("Please input a valid option")
    }

}

fun generateRandoms() {
    val number = (1..100).random()
    println("Guess the number: ")
    when (number) {
        in 1..25 -> println("Number is higher than 1 and lower 25")
        in 26..50 -> println("Number is higher than 26 and lower 50")
        in 51..75 -> println("Number is higher than 51 and lower 75")
        else -> println("Number is higher than 75 and lower 100")
    }
    val input = readln().toInt()

    if (input == number) {
        println("You've guessed correctly, $input is  the answer")
    } else {
        println("incorrect, $number is  the answer")
    }
}

//endregion






















