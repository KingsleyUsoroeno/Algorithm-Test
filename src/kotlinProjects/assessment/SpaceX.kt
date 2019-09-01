package kotlinProjects.assessment

fun main(args: Array<String>) {

    val fareWallet = FareWallet()
    val firstTrip = fareWallet.takeTrip(3000, "Abuja", "Moon", "falcon 9")
    val secondTrip = fareWallet.takeTrip(3000, "Moon", "Spock", "falcon 1")
    val thirdTrip = fareWallet.takeTrip(3000, "Spock", "ISS", "falcon 9")
    println(thirdTrip)
}