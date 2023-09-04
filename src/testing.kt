import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.math.PI


//fun main(){
//   val maxNumber = maxOfInt(23,4)
//    println(maxNumber)
//}


//fun maxOfInt(a:Int, b:Int): Int {
//    if (a > b) {
//        return a
//    } else {
//        return b
//    }
//}

//fun main(){
//    val myFirstDice = Object(6)
//    val mySecondDice = Object(6)
//   println("first dice rolled ${myFirstDice.roll()} and second dice rolled ${mySecondDice.roll()}")
//}
//
//class Object(val numSides : Int){
//    fun roll(): Int{
//        return (1..numSides).random()
//    }
//}


fun main() {
    println("////////////////////")

    /*val sum = { i: Int, j: Int ->
        i + j
    }

    val jump = fun(x: Int, y: Int) = x + y

    val love: ItemsWithCategories.(String) -> String = { this.name + it }


    val just = items[2].love("test ongoing")
    println(just)


    println(jump(2, 9))

    fun name(list: (Int, Int) -> Int) {
        println(list(3, 7))
    }
    println("///////////////////////////")
    name(sum)
    println(sum(2, 4))
*/


//    questions.forEach { q, a ->
//        println("$q")
//        val ans = readLine()
//        if (ans == a)
//            println("correct $q == $ans / $a")
//        else println("WRONG ------ ans == > $a")
//    }

    val dateFormat = SimpleDateFormat("yy-MM-dd hh:mm")
    val calendar = Calendar.getInstance()
    println("${calendar.time}")
    

    val new = dateFormat.format(calendar.time)
    val new2 = dateFormat.format(System.currentTimeMillis())
    val text = dateFormat.parse("2022-02-11 21:45")


    println("new = $new") //==> 22-11-24 05:43
    println("new2 = $new2") //==> 22-11-24 05:43
    println(" text = $text") //==> Fri Feb 11 21:45:00 WAT 2022
    println(text.toString().split(" "))


    println("///////////////////////////////////////")
    val date = "2021-12-16T16:42:00.000Z"  //"2022-02-11 21:45"
    val format =
        DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")//DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
    val localDate = LocalDateTime.parse(date, format)

    val dateFormatter = DateTimeFormatter.ofPattern("EEE, MMM d, yyyy 'at' hh:mm a", Locale.getDefault())
    println(localDate.format(dateFormatter)) // ==> Thu, Dec 16, 2021 at 04:42 PM

//println("${calendar.time}".split(" "))


    println("///////////////////////////////////////")
    /*val num = "hello-world 200 60%"

    val start = num.indexOf("2")
    val end = num.indexOf("%") + 1
    val name = num.substring(start, end)
    println(num.split(" ")[1])

    println("${num.substring(0, end)} 2")
    println(num)
    println(name)*/
    println("/////////////TIME///////////")
    /* hello("bellooojsjkfns")



     val data = getData2()

     for(i in data){
         println(i)
     }*/
/////////////////////////////////////////
//    for(i in 1..4){
//        val a = "".repeat(4-i)
//        val b = "#".repeat(i)
//        println("$a$b")
//println("//////////////////////////////////////////////////////////////////")
//        for(i in 1..4) {
//            val numOfSpaces = 4 - i
//            val spaceString = " ".repeat(numOfSpaces)
//            val specialCarcterString = "#".repeat(i)
//            println("$spaceString$specialCarcterString")
//        }
//    }


}

open class hello() {
    //    init {
//        println(name)
//    }
    open var name: String = " "
    open var newName = name

    open fun readAndChangeDisplayName() {
        println(newName)
    }


}


class NewTesting : hello() {
    override fun readAndChangeDisplayName() {
        super.readAndChangeDisplayName()
        hello().name = "new gen"// this doesnt change the value in the parent class
        name = "testing new gen"
        println(name)
        println("${hello().name} ijok")
    }

    fun change() {
        name = " jgojhp;;;"
    }


}

fun elementExists(element: Int, array: List<Int>): Boolean = element in array

enum class sort(val displayName: String) {
    NEW("new"),
    OLD("old"),
    CATEGORY("category")
}


data class ItemsWithCategories(
    val id: Int? = null,
    val name: String = "",
    val category: Int? = null
) {
    fun love(cupid: (ItemsWithCategories) -> Unit) {
    }

}

val items = ArrayList<ItemsWithCategories>()

fun getData(): ArrayList<ItemsWithCategories> {
    return items.apply {
        add(ItemsWithCategories(1, "itemMilly1", 1))
        add(ItemsWithCategories(2, "itemMilly1", 1))
        add(ItemsWithCategories(3, "itemMilly1", 1))
        add(ItemsWithCategories(3, "itemMilly1", 1))
        add(ItemsWithCategories(4, "itemMilly1", 2))
        add(ItemsWithCategories(5, "itemMilly2", 2))
        add(ItemsWithCategories(6, "itemMilly2", 2))
        add(ItemsWithCategories(7, "itemMilly2", 3))
        add(ItemsWithCategories(8, "itemMilly2", 3))
        add(ItemsWithCategories(9, "itemMilly3", 3))
        add(ItemsWithCategories(10, "itemMilly3", 3))
        add(ItemsWithCategories(11, "itemMilly3", 3))
        add(ItemsWithCategories(12, "itemMilly3", 3))
        add(ItemsWithCategories(13, "itemMilly4", 4))
        add(ItemsWithCategories(14, "itemMilly4", 4))
        add(ItemsWithCategories(15, "itemMilly4", 4))
        add(ItemsWithCategories(16, "itemMilly4", 4))
        add(ItemsWithCategories(17, "itemMilly5", 4))
        add(ItemsWithCategories(18, "itemMilly5", 4))
        add(ItemsWithCategories(19, "itemMilly5", 4))
        add(ItemsWithCategories(20, "itemMilly5", 4))
        add(ItemsWithCategories(21, "itemMilly6", 1))
        add(ItemsWithCategories(22, "itemMilly6", 2))
        add(ItemsWithCategories(23, "itemMilly6", 3))
        add(ItemsWithCategories(24, "itemMilly6", 3))
    }
}


fun questions() {
    val questions = mutableMapOf<String, String>(
        "what is your name?" to "unknown",
        "class ?" to "ion know",
        "Hobby?" to "dunno",
        "young?" to "yh",
        "smart?" to "prettymuch",
        "ambitious?" to "notsure",
        "geek?" to "no",
        "coding?" to "yes"
    )
    val keys = questions.keys.toList()
    val values = questions.values.toList()
//    for((q,a) in questions){
//        println("$q")
//        val ans = readLine()
//        if (ans == a){
//            println("correct ")
//            continue //"continue doesn't work in a for each .. atleast in this scenario ..i'm not sure about other scenarios"
//        }
//        else println("WRONG ------ ans == > $a")
//
//    }
    for (i in keys.indices) {
        println(keys[i])
        val ans = readLine()
        if (ans == values[i]) {
            println("correct $i == $ans / ${values[i]}")
        } else println("WRONG ------ ans == > ${values[i]}")
    }
}


class Circle {
    var radius: Double
    var color: String
    var circ = "2*pi*r  area = pi*r*r ,"

    constructor() {
        this.radius = 1.0
        this.color = "Red"
    }

    constructor(_radius: Double) : this() {
        this.radius = _radius
    }

    constructor(_radius: Double, _color: String) : this() {
        this.radius = _radius
        this.color = _color
    }

    fun getDescription(): String = "Radius: $radius, Color: $color"
    fun getArea(): Double = PI * radius * radius
    fun getCircumference(): Double = 2 * PI * radius
    fun getColors(): String = "Color: $color"

    /*val circle = Circle()
    val circle2 = Circle(2.0)
    val circle3 = Circle(2.0, "blue")
    println("Circle 1:")
    println("area: ${circle.getArea()}")
    println("circumference: ${circle.getCircumference()}")
    println("description:${circle.getDescription()}")
    println("color:${circle.getColors()}")

    println(" ")
    println("Circle 2:")
    println("area: ${circle2.getArea()}")
    println("circumference: ${circle2.getCircumference()}")
    println("description:${circle2.getDescription()}")
    println("color:${circle2.getColors()}")

    println(" ")
    println("Circle 3:")
    println("area: ${circle3.getArea()}")
    println("circumference: ${circle3.getCircumference()}")
    println("description:${circle3.getDescription()}")
    println("color:${circle3.getColors()}")
*/
}
















































