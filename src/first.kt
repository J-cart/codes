import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.*


/*fun main() {
    val border = "`-._,-'"
    val name = "Joseph"
    val timesToRepeat = 4
    printBorder(border, timesToRepeat)
    println("  Happy Birthday, ${name}!")
    printBorder(border, timesToRepeat)
}*/

/*fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}*/

/*fun main() {
    val diceRange = 1..6
    val randomNumber = diceRange.random()
    println(randomNumber)
    for(i in diceRange){
        println(i)

    val myFirstDice = Dice()

    println(myFirstDice.sides)
    myFirstDice.roll()
    myFirstDice.color = "yellow"
    println("sides of myFirstDice:${myFirstDice.sides}")
    println("color of myFirstDice:${myFirstDice.color}")
}*/

/*
class Dice {
    var sides = 6
    var color = "red"
    fun roll(){
        val randomNumber = (1..6).random()
        println(randomNumber)
    }
}
*/

fun main() {
    times()
    println("Working Path: " + System.getProperty("user.dir"))
    /* button 1, button 2....
    button 1 is set to val minus
    button 2 is set to val plus.......
     */
    /* plus(525)
     println(filter())

     val text1 = "Eanfbiee"
     val text2 = "ae"

     println("text check")
     println(text1.contains(text2, true))

     val list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17)
     val list2 = "bsbdfsoppfspfps-timjoseph"
     println(list2.takeLast(9))

     doFibonacci(0, 1, 6)

     println("-------------java --")
     anything.sample()*/


//    firstFifty()
//    fibonacci(6)
//    println(fib1(10))
//    println(Main.date2DayTime(Date.from(Instant.now())))
    someRandomDate()
    dateRangeForDay()
    val newString = "294930303"
    println(newString.toInt())


}

fun times() {
    val systemTime = System.currentTimeMillis()
    val systemTimeFormatter1 = SimpleDateFormat("EEE, yyyy-MM-dd hh:mm a").format(systemTime)
    println("system1 = $systemTimeFormatter1") //==>Thu, 2022-11-24 06:02 PM
    println("///////////////////////////////////////////////////////////////////////")


    val systemTimeFormatter2 = SimpleDateFormat("yyyy-MM-dd HH:mm a ").format(systemTime)
    println("system2 = $systemTimeFormatter2") //==>2022-11-24 18:02 PM
    println("///////////////////////////////////////////////////////////////////////")


    val systemTimeFormatter3 = SimpleDateFormat("EEE, dd-MM, hh:mm a ").format(systemTime)
    println("system3 = $systemTimeFormatter3") //==>Thu, 24-11, 06:02 PM
    println("///////////////////////////////////////////////////////////////////////")


    val systemTimeFormatter4 = SimpleDateFormat(" hh:mm a").format(systemTime)
    println("system4 = $systemTimeFormatter4") //==>06:02 PM
    println("///////////////////////////////////////////////////////////////////////")


}

fun plus(num: Int) {

    for (i in 1..100) {
        if (num % i == 0) println(i) else continue
    }
}

val list = listOf<String>()
fun filter(): List<ItemsWithCategories> {
    return getData().filter { items ->
        list.any {
            items.name == it
        }
    }
}

fun doFibonacci(aTerm: Int, bTerm: Int, count: Int) {
    var a = aTerm
    var b = bTerm
    var c = 1


    if (count <= 1) {
        println(a)
        return
    }

    for (i in 1..count) {
        c = a + b
        a = b
        b = c
        println("---round $i-------")
        println("a-> $a")
        println("b-> $b")
        println("c-> $c")
        println("------------------")

    }


}

fun firstFifty() {

    var sum = 0
    var number = 1
    for (i in (1..50)) {
        sum += number
        number += 2

    }

    println("sum ==$sum")
}

fun fibonacci(num: Int) {
    var term1 = 0
    var term2 = 1

    for (i in 1..num) {
        println(term1)
        val sum = term1 + term2
        term1 = term2
        term2 = sum

    }

}

fun fib1(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1
    return fib1(n - 1) + fib1(n - 2)
}


object Main {
    private val yyyy_MM_dd_HH_mm = SimpleDateFormat(
        "yyyy-MM-dd HH:mm", Locale.getDefault()
    )
    private val HHmm = SimpleDateFormat(
        "HH:mm",
        Locale.getDefault()
    ) /*from w  w  w .  j a  v  a  2s .  co m*/
    private val MM_dd_HHmm = SimpleDateFormat(
        "MM-dd HH:mm", Locale.getDefault()
    )

    fun date2DayTime(oldTime: Date?): String {
        val newTime = Date()
        try {
            val cal = Calendar.getInstance()
            cal.time = newTime
            val oldCal = Calendar.getInstance()
            oldCal.time = oldTime
            val oldYear = oldCal[Calendar.YEAR]
            val year = cal[Calendar.YEAR]
            println(cal.get(Calendar.HOUR_OF_DAY))
            println(cal.get(Calendar.YEAR))
            val oldDay = oldCal[Calendar.DAY_OF_YEAR]
            val day = cal[Calendar.DAY_OF_YEAR]
            if (oldYear == year) {
                return when (oldDay - day) {
                    -1 -> {
                        "yesterday " + HHmm.format(oldTime)
                    }

                    0 -> {
                        "today " + HHmm.format(oldTime)
                    }

                    1 -> {
                        "tomorrow " + HHmm.format(oldTime)
                    }

                    else -> {
                        MM_dd_HHmm.format(oldTime)
                    }
                }
            }
        } catch (e: Exception) {
        }
        return yyyy_MM_dd_HH_mm.format(oldTime)
    }
}


fun someRandomDate() {
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    val currentDateTime = LocalDateTime.now().format(formatter)
    val calender = Calendar.getInstance()


    val curYear = calender[Calendar.YEAR]
    val curDayOfYear = calender[Calendar.DAY_OF_YEAR]
    val curDayOfMonth = calender[Calendar.DAY_OF_MONTH]
    val curDate = calender[Calendar.DATE]
    val random = calender[Calendar.WEDNESDAY]

    println("year: $curYear")
    println("day of year: $curDayOfYear")
    println("day of month: $curDayOfMonth")
    println("current date: $curDate ")
    println("random:$random")
    println("Local Date: " + LocalDate.now())
    println("Local Date Time: " + LocalDateTime.now())
    println(LocalDate.parse("2023-03-27", formatter).format(DateTimeFormatter.ofPattern("EEEE, yyyy-MM-dd")))
    println(LocalDateTime.of(LocalDate.of(2023, 3, 27), LocalTime.now()))
    println(Date().time)
    println(SimpleDateFormat("yyyy-MM-dd").format(Date().time))

    /**
     *   println(SimpleDateFormat("yyyy-MM-dd").format(Date().time)) -->
     *   one way which formats Date() to get you full info {DateTimeFormatter.ofPattern(..) doesn't work}
     *
     *   println(LocalDateTime.parse("2023-03-27", formatter).format(DateTimeFormatter.ofPattern("EEEE, yyyy-MM-dd")))-->
     *   this doesn't work for LocalDateTime but works for LocalDate...not sure as to why, I'll come back to it anyways
     *
     *
     *
     *
     *
     * */


}

fun dateRangeForDay() {
    val currDate = LocalDate.now()//LocalDate.parse("2023-03-27")
    val prevDate = LocalDate.parse("2023-03-20")
    println("news: " + (currDate.dayOfMonth - prevDate.dayOfMonth))

    when (currDate.dayOfMonth - prevDate.dayOfMonth) {
        7 -> {
            //a week ago
            println("a week ago")
        }

        1 -> {
            //yesterday
            println("yesterday")
        }

        0 -> {
            //today
            println("today")
        }

        else -> {
            println("Some Time Ago")
        }
    }
}

fun String.isNotEmptyAction(action: (String) -> Unit) {
    if (this.trim().isNotEmpty()) {
        action(this)
        return
    }
}







