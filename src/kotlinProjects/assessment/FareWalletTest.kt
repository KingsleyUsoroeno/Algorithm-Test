package kotlinProjects.assessment

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class FareWalletTest {

    private lateinit var fareWallet: FareWallet

    @Before
    fun setUp() {
        fareWallet = FareWallet()
    }

    @Test
    fun firstTrip() {
        val cost = fareWallet.takeTrip(3000, "Abuja", "Moon", "falcon 9")
        assertEquals(2900, cost)
    }

    @Test
    fun secondTrip() {
        val cost = fareWallet.takeTrip(3000, "Moon", "Spock", "falcon 1")
        assertEquals(2750, cost)
    }

    @Test
    fun thirdTrip() {
        val cost = fareWallet.takeTrip(3000, "Spock", "ISS", "falcon 9")
        assertEquals(2300, cost)
    }


}