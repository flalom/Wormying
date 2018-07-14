package lab


fun main(args: Array<String>) {
    var answer: String = ""
    while (answer != "y") {
        val generalvolume: Int = 1000
        var drops_counted = mutableListOf<Int>()

        // I would like to include all the counted values in s vector
        println("Hello how are you??? \n How many drops do you have to count? " +
                "Please insert an integer number")
        var countes: Int = readLine()!!.toInt()
        // maybe now that i defined the empty list ouside the scope of this loop, i can have a global effect.
        for (i : Int in 1..countes) {
            println("Please insert the NTS you have counted in the drop number $i")
            var answerar = readLine()!!.toInt()
            drops_counted.add(answerar)
        }

        println("The NTS counts you entered are here: ${drops_counted}. This is the average" +
                " ${drops_counted.sum()/drops_counted.size.toDouble()}" +
                "\nNow, please insert the drops volume ")
        var answer_nts = readLine()!!.toInt()

        println("How much volume of NTS do you have in your tube? Please enter the volume")
        var mls: Double = readLine()!!.toDouble()

        var calculation = drops_counted.sum()/drops_counted.size.toDouble() *
                (generalvolume / answer_nts) * mls

        println("What parasites concentration do you want? " +
                "(Expressed as NTS/µL)")
        var nts_concentration : Double = readLine()!!.toDouble()
        var medium_to_add : Double = calculation / (generalvolume * nts_concentration)

        if (medium_to_add >= mls) {
            println("Reach this medium final volume by adding ${medium_to_add - mls} mL of media")
        }
        else{
            println("Reach this medium final volume by removing ${(mls- medium_to_add)} mL from your inititial $mls mL" +
                    "\n your final volume will be ${mls -(mls- medium_to_add)} mL")
            }
        if ((mls - medium_to_add) > 800 || (mls - medium_to_add) < 1000) {

            println("You can use a P1000 pipette and pipette ${(mls - medium_to_add)/2} µL twice")
                    }

        println("The concentration is $calculation NTS/${generalvolume/1000} mL, @ ${nts_concentration} NTS/µL")

        println("Do you wnat to continue (y/n)")
        var answer = readLine()

        if (answer!!.toLowerCase() == "n") {
            break
        }
            else if (answer.toLowerCase() != "y") {
            println("You did not reply correcly, then you will continue")

        }
        }
}
