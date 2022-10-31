package dev.jzadi.variables.types

/**
 * Fichier TypeBoolean, créée le 31/10/2022 à 14:54
 *
 * @author Joachim Zadi
 * @version 1.0 du 31/10/2022
 */

fun main() {
    /*
     * Le type Boolean représente des objets booléens qui peuvent avoir deux valeurs : true et false.
     * Le type Boolean a une contrepartie nullable Boolean? qui a aussi la valeur nulle.
     *
     * Les opérations intégrées sur les booléens incluent :
     *      || – disjonction (OU logique)
     *      && – conjonction (ET logique)
     *      ! – négation (NON logique)
     */
    val monBooleanVrai: Boolean = true
    val monBooleanFaux: Boolean = false
    val monBooleanNullable: Boolean? = null

    println(monBooleanVrai || monBooleanFaux)
    println(monBooleanVrai && monBooleanFaux)
    println(!monBooleanVrai)
}