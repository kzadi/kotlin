package dev.jzadi.controles

/**
 * Fichier IfElse, créée le 31/10/2022 à 17:18
 *
 * @author Joachim Zadi
 * @version 1.0 du 31/10/2022
 */

fun main() {

    // Instruction if standard
    var maChaine = "Bonjour"
    if (maChaine.length == 0) {
        println("La chaine est vide !!!")
    } else if (maChaine.length < 5) {
        println("La chaine est courte !!!")
    } else {
        println("LA chaine est longue")
    }

    // On peut utiliser le if...else comme une expression
    // NB : Notez que la branche else n'est pas facultative si l'instruction if est utilisée comme expression.
    maChaine = if (maChaine.isNotEmpty()) "Chaine non vide" else "Chaine vide"
    println("maChaine = ${maChaine}")
}