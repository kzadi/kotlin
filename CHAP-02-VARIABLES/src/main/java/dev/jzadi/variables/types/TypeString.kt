package dev.jzadi.variables.types

/**
 * Fichier TypeString, créée le 31/10/2022 à 15:45
 *
 * @author Joachim Zadi
 * @version 1.0 du 31/10/2022
 */

fun main() {
    // Dans Kotlin, les chaînes sont définies entre des guillemets doubles et
    // comparées avec l'opérateur == qui vérifie leur égalité structurelle

    val nom = "Joachim"
    val age = 53

    println("String template simple : $nom a $age ans")
    println("String template complexe : ${nom} a ${age} ans")
    println("$nom.length est égal ${nom.length}")

    // Pour inclure un signe dollar littéral dans une chaîne, échappez-le à l'aide d'une barre oblique inverse
    println("\$nom contient $nom")

    val str1 = "Hello, World!"
    val str2 = "Hello," + " World!"
    println(str1 == str2) // --> true

    // L'égalité référentielle est vérifiée avec l'opérateur ===

    // Utilisation des row string
    val str3 = """
        |Bonjour 
        |tout le monde
    """.trimMargin()
    println("str3 = $str3")

    val str4 = """
        #Bonjour 
        #tout le monde
    """.trimMargin("#")
    println("str4 = $str4")

    val str5 = """
        Bonjour
        tout le monde
    """.trimIndent()
    println("str5 = $str5")

    println(str3 == str4)   // --> true
    println(str3 === str4)  // --> true
    println(str4 === str5)  // --> false

    val prix = """
        ${'$'}9.99
        """.trimIndent()
    println("prix = ${prix}")
}