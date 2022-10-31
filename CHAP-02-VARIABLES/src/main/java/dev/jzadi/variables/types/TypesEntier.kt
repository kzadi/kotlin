package dev.jzadi.variables.types

/**
 * Fichier TypesEntier, créée le 31/10/2022 à 15:14
 *
 * @author Joachim Zadi
 * @version 1.0 du 31/10/2022
 */

/*
 * Avec Kotlin, les types entiers sont représentés par Byte, Short, Int, Long
 */
fun main() {

    /*
     * Les Octets sont des entiers signés codes sur 1 octet soit 8 bits
     */
    println("\n======Type Byte======\n")
    val byteMin: Byte = Byte.MIN_VALUE;
    println("byteMin = $byteMin")

    val byteMax = Byte.MAX_VALUE
    println("byteMax = $byteMax")

    /*
     * Les Shorts sont des entiers signés codes sur 2 octets soit 16 bits
     */
    println("\n======Type Short======\n")
    val shortMin: Short = Short.MIN_VALUE;
    println("shortMin = $shortMin")

    val shortMax = Short.MAX_VALUE
    println("shortMax = $shortMax")

    /*
     * Les Ints sont des entiers signés codes sur 4 octets soit 32 bits
     */
    println("\n======Type Int======\n")
    val intMin: Int = Int.MIN_VALUE;
    println("intMin = $intMin")

    val intMax = Int.MAX_VALUE
    println("intMax = $intMax")

    /*
     * Les Longs sont des entiers signés codes sur 8 octets soit 64 bits
     */
    println("\n======Type Long======\n")

    val unLong:Long = 1234567891011121314L

    val longMin: Long = Long.MIN_VALUE;
    println("longMin = $longMin")

    val longMax = Long.MAX_VALUE
    println("longMax = $longMax")

    // Formater des nombres
    val grandNombre: Int = 27_052
    println("grandNombre = $grandNombre")

    val tresGrandNombre: Double = 1_000_530_000_810.0
    println("tresGrandNombre = $tresGrandNombre")
}

// En plus des types entiers, Kotlin fournit les types suivants pour les nombres entiers non signés :

/*
 * UByte : un entier non signé de 8 bits, compris entre 0 et 255
 * UShort : un entier 16 bits non signé, compris entre 0 et 65535
 * UInt : un entier 32 bits non signé, compris entre 0 et 2^32 - 1
 * ULong : un entier 64 bits non signé, compris entre 0 et 2^64 - 1
   Les types non signés prennent en charge la plupart des opérations de leurs homologues signés.
*/