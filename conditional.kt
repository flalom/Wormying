//this is because there can be only a main functioon for each package, omly once separated are fine
package conditionals

import java.util.*

fun main(args: Array<String>) {
    val random = Random().nextInt(50) + 1

    when (random) {
        in 1..10 -> println("hello pippo how are you!?")
        in 11..20 -> println("random between 11 and 20")
        in 21..30 -> println("random is between 21 and 30")
        in 31..40 -> println("random is between 31 and 40")
    }

    var list = listOf("pippo", "pluto", "paperino", "pippolo", "ciccolo", "segolo")
    //strings can be treated as arrays
    // arrayOf --> this is not modificabel, the size is already established at the toîme this is created, there are intarrayof and doublearrayof, you can reaasign bla[x] = djs, or bla.set, array.size and array.contains
    //arrayListOf() --> this type is a little more flexible and it can be use in different istances
    println(list.isEmpty())
    //list are very similar to the arrays, arrayoflist list.add(1, "pippo"), the 1 is the position

    for ((index, value) in list.withIndex()) {
        println("$index,  $value")

    }
}