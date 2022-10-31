package dev.jzadi.variables.types

/**
 * Fichier TypesNullable, créée le 31/10/2022 à 15:28
 *
 * @author Joachim Zadi
 * @version 1.0 du 31/10/2022
 */

/*
 * Dans Kotlin, le système de type fait la distinction entre les références qui peuvent contenir null (références nullables)
 * et celles qui ne le peuvent pas (références non null).
 * Par exemple, une variable régulière de type String ne peut pas contenir null
 */
fun main() {

    var prenom: String = "Joachim"
    // prenom = null // -> COMPILATION NOK car les type sont non nullable par défaut

    // Pour autoriser les valeurs nulles, nous pouvons déclarer une variable en tant que nullable avec l'opérateur ? :
    // On parle d'opérateur' safe call
    var nom: String? = prenom
    // nom = null
    println("La longueur du nom est ${nom?.length}")    // N'appelle pas la methode length si le nom est null
    println("La longueur du nom est ${nom!!.length}")   // Appelle la methode length meme si le nom est null
}