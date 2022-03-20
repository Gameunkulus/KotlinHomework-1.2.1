
    val amount: Int = 100;
    val minComission: Int = 35;
    val standartComission: Double = 0.75;

public fun main() {
    val commision = if((amount * standartComission) > minComission) (amount * standartComission).toInt() else minComission
    println("Amount transfer: ${amount}.Amount commison: ${commision}")
}