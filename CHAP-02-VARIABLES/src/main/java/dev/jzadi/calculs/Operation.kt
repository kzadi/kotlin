package dev.jzadi.calculs

import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

/**
 * Fichier Operation, créée le 31/10/2022 à 15:42
 *
 * @author Joachim Zadi
 * @version 1.0 du 31/10/2022
 */

fun main() {
    val addition = 1 + 2;
    println("addition = $addition")

    val soustraction = 5.12 - 2
    println("soustraction = $soustraction ")

    val multiplication = 5 * 2.1
    println("multiplication = $multiplication")

    val division = 5 / 2.0
    println("division = $division")

    val modulo = 5 % 2
    println("modulo = $modulo")

    var nombre = 5;
    nombre = nombre + 1
    println("nombre = $nombre")

    nombre += 2
    println("nombre = $nombre")

    nombre++
    println("nombre = $nombre")

    // NB : Cette syntaxe fonctionne avec tous les opérateurs que nous avons vus jusqu’à maintenant !

    // QUELQUES FONCTIONS MATHEMATIQUES

    val absolue = abs(-55);         // -> Cette fonction retourne la valeur absolue d’un nombre
    println("absolue = $absolue")

    val entierSup= ceil(52.41)      // -> Cette fonction arrondit un nombre décimal à l’entier supérieur
    println("entierSup = $entierSup")

    val entierInf= floor(52.41)
    println("entierInf = $entierInf")   // -> Cette fonction arrondir à l’entier inférieur

    val racineCarree = sqrt(3.1)
    println("racineCarree = $racineCarree")
}