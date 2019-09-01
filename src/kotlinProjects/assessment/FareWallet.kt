package kotlinProjects.assessment

class FareWallet {

    private fun fare(places: String): String? {
        val fare = HashMap<String, String>()
        fare["ISS"] = "Earth"
        fare["Abuja"] = "Earth"
        fare["Moon"] = "Earth"
        fare["Spock"] = "Mars"

        return when (places) {
            places -> fare[places]
            else -> "no orbit"
        }
    }

    fun takeTrip(balance: Int, from: String, to: String, rocket: String): Int {

        var charges = 0
        val fromOrbit = fare(from)
        val toOrbit = fare(to)

        //Journey between	two	points	in	an	orbit on Falcon	1
        if (fromOrbit == toOrbit) {
            charges = 50
        }

        //Anytime you cross	from one orbit to another on Falcon	1
        if (fromOrbit != toOrbit) {
            charges = 250
        }

        //if he travels through falcon 9
        if (rocket == "falcon 9") {
            charges = charges.times(2)
        }

        //Royalty when landing	on man-made	stations (satellites) on any rocket
        if (to == "ISS") {
            charges = charges.plus(200)
        }

        return balance - charges
    }
}