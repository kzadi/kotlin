package dev.jzadi.variables.types

/**
 * Classe TypesFlottant, créée le 31/10/2022 à 15:19
 *
 * @author Joachim Zadi
 * @version 1.0 du 31/10/2022
 */

fun main() {
    /*
     * Les Float sont des nombres décimaux signés codes sur 4 octets soit 32 bits
     */
    println("\n======Type Float======\n")
    val floatMin: Float = Float.MIN_VALUE;
    println("floatMin = $floatMin")

    val floatMax = Float.MAX_VALUE
    println("floatMax = $floatMax")

    val unFloat: Float = 1.2F

    /*
     * Les Double sont des nombres décimaux signés codes sur 8 octets soit 64 bits
     */
    println("\n======Type Double======\n")

    val doubleMin: Double = Double.MIN_VALUE
    println("doubleMin = $doubleMin")

    val doubleMax = Double.MAX_VALUE
    println("doubleMax = $doubleMax")
}