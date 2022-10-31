package dev.jzadi.variables.types

import java.util.Arrays

/**
 * Fichier TypeArray, créée le 31/10/2022 à 16:15
 *
 * @author Joachim Zadi
 * @version 1.0 du 31/10/2022
 */

fun main() {
    // Tableaux génériques

    // Les tableaux génériques dans Kotlin sont représentés par Array<T>.
    // Pour créer un tableau vide, utilisez la fonction de fabrique emptyArray<T>()
    val tableauVide = emptyArray<String>();
    println("tableauVide = ${tableauVide.contentToString()}")

    // Pour créer un tableau avec une taille et des valeurs initiales données, utilisez le constructeur
    val tabInitialise = Array<String>(size = 5, init = { index -> "Item #$index" })
    println("tabInitialise = ${tabInitialise.contentToString()}")

    val taille = tabInitialise.size;
    println("taille = ${taille}")

    // Access en lecture
    println(tabInitialise.get(2))
    println(tabInitialise[2])

    // Access en écriture
    tabInitialise.set(2, "Nouvelle valeur en 2")
    println(tabInitialise[2])

    tabInitialise[2] = "Autre valeur en 2"
    println(tabInitialise[2])

    // Création de Tableaux de primitifs
    // Ces types n'héritent pas de Array<T> pour éviter le boxing,
    // cependant, ils ont les mêmes attributs et méthodes.
    var tabBoolean: BooleanArray = booleanArrayOf(true, false)
    println("tabBoolean = ${tabBoolean.contentToString()}")
    tabBoolean = BooleanArray(2)
    println("tabBoolean = ${tabBoolean.contentToString()}")

    var tabByte: ByteArray = byteArrayOf(1, 2, 3, 4)
    println("tabByte = ${tabByte.contentToString()}")

    tabByte = ByteArray(4)
    println("tabByte = ${tabByte.contentToString()}")

    var tabChar: CharArray = charArrayOf('a', 'b', 'c')
    println("tabChar = ${tabChar.contentToString()}")
    tabChar = CharArray(3)
    println("tabChar = ${tabChar.contentToString()}")

    var tabDouble: DoubleArray = doubleArrayOf(1.2, 5.0)
    println("tabDouble = ${tabDouble.contentToString()}")
    tabDouble=DoubleArray(3)
    println("tabDouble = ${tabDouble.contentToString()}")

    var tabFloat: FloatArray = floatArrayOf(1.2f, 5.0F)

    var tabInt: IntArray = intArrayOf(1, 2, 3)
    var tabLong: LongArray = longArrayOf(1, 2, 3)
    var tabShort: ShortArray = shortArrayOf(1, 2, 3)

    // On peut aussi créer un tableau avec la factory arrayOf()
    var tabA = arrayOf(1, 2, 3)
    println("tabA = ${tabA.contentToString()}")

    tabA = Array(5) { i -> i * 2 }
    println("tabA = ${tabA.contentToString()}")

    // On peut Créer un tableau non initialisé
    val tabB = arrayOfNulls<Int>(5)
    println("tabB = ${tabB.contentToString()}")

}