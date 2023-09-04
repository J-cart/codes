import java.util.*


fun main() {
    practiceQuestions()
}

fun main1() {

    /*for(i in 2000..3200){
         if(i%7==0){
             println(i)
         }
         else{
             //println(".")
             continue
         }
     }*/
    /*
       val stray = Bit("tolu", "broh", 33)
       val point = stray.fN
       println(point)

   }
   class Bit(name: String, ln: String, amt: Int) {
           var fN= name +" "+ ln
   }
   */


    val num = arrayOf(-2, -1, 0, 1, 2)

    println(std(3, num))
    println("==================================================================")
    new()


    println(Random().nextInt(5))
    println(kotlin.random.Random.nextInt(5))
    println(num.size)
    println(num.lastIndex)
    println(num.indices)

    println("==================================================================")


    val arr = arrayListOf(22, 4, 3, 22, 3, 5, 6, 7, 22, 3)

    GFG.findDuplicates(arr.toIntArray(), arr.size)
}

/*fun div(all : Array<Int>): Int {
    var sum = 0
    for (i in all){
        sum += i
    }
    return sum / 5
}

*/


fun std(thres: Int, arr: Array<Int>): String {
    for (i in arr) {

        if (arr[thres - 1] <= 0) {
            return "YES"
        } else {
            return "NO"
        }
    }
    return ""
}


fun new() {
    val list1 = getData()
    val list2 = mutableListOf<Int>(2, 4, 5, 66)

    val newList = mutableListOf<ItemsWithCategories>()

    for (i in list2) {
        for (j in list1) {
            if (i == j.id) {
                newList.add(j)
            }

        }
    }

    println(newList)

}

object GFG {

    // Function to find the Duplicates,
    // if duplicate occurs 2 times or
    // more than 2 times in
    // array so, it will print duplicate
    // value only once at output
    internal fun findDuplicates(
        arr: IntArray, len: Int
    ) {

        // initialize ifPresent as false
        var ifPresent = false

        // ArrayList to store the output
        val al = ArrayList<Int>()

        for (i in 0 until len - 1) {
            for (j in i + 1 until len) {
                if (arr[i] == arr[j]) {
                    // checking if element is
                    // present in the ArrayList
                    // or not if present then break
                    if (al.contains(arr[i])) {
                        break
                    } else {
                        al.add(arr[i])
                        ifPresent = true
                    }// if element is not present in the
                    // ArrayList then add it to ArrayList
                    // and make ifPresent at true
                }
            }
        }

        // if duplicates is present
        // then print ArrayList
        if (ifPresent) {

            print(al + " ")
        } else {
            print(
                "No duplicates present in arrays"
            )
        }
    }


}

fun practiceQuestions() {
    val questions = mutableMapOf<String, String>(
        "what is your name?" to "unknown",
        "class ?" to "ion know",
        "Hobby?" to "dunno",
        "young?" to "yh",
    )
    val values = questions.values.toList()

    /**------------key- value(key-value)----------------------------------------------------------------------------------------------------*/


    val que = mutableMapOf<String, Map<String, List<String>>>(
        "what is your name?" to mapOf("unknown" to values.shuffled()),
        "class ?" to mapOf("ion know" to values.shuffled()),
        "Hobby?" to mapOf("dunno" to values.shuffled()),
        "young?" to mapOf("yh" to values.shuffled()),
        "smart?" to mapOf("prettymuch" to values.shuffled()),
        "ambitious?" to mapOf("not sure" to values.shuffled()),
        "geek?" to mapOf("no" to values.shuffled()),
        "coding?" to mapOf("yes" to values.shuffled())
    )

    val keyQuestions = que.keys.toList()
    val answerValues = que.values.toList()

    for (i in keyQuestions.indices) {
        println(keyQuestions[i])
        // readLine()
        val newKeys = answerValues[i].keys.toList()
        val newAnswer = newKeys[0] // these are the new keys
        val newValues =
            answerValues[i].values.toList()[0]// these are the options available(add them to the radio button)
        println(newAnswer)
        println(newValues)
        println("-------------------")

    }

}




