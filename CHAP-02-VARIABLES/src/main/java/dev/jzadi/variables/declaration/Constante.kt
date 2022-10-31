package dev.jzadi.variables.declaration

/**
 * Fichier Constante, créée le 31/10/2022 à 14:49
 *
 * @author Joachim Zadi
 * @version 1.0 du 31/10/2022
 */

/*
 * Parfois, il est nécessaire d’utiliser des variables dont la valeur ne doit pas
 * changer pendant toute la durée du programme.
 * Ces variables particulières sont appelées constantes.
 * Du point de vue de la syntaxe, la déclaration d’une constante est comparable à
 * la déclaration de variable en lecture seule, à ceci près qu’on ajoute le mot-clé supplémentaire : const.
 */

// Declaration d'une constante
const val CIVILITY: String = "Monsieur"

fun main() {
    println("CIVILITY = $CIVILITY")

    // NB : Une constante doit être initialisée avec une valeur dès sa déclaration.
    // Ce qui n’est pas le cas d’une variable en lecture seule.
}