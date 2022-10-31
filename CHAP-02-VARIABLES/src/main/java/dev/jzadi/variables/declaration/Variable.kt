package dev.jzadi.variables.declaration

/**
 * Fichier Variable, créée le 31/10/2022 à 14:44
 *
 * @author Joachim Zadi
 * @version 1.0 du 31/10/2022
 */

/*
 * Pour declarer une variable, Kotlin utilise le mot cle var pour les variables mutables
 * et le mot clé val pour les variables immutables
 *
 * KOTLIN EST UN LANGAGE A TYPAGE STATIC
 */
fun main() {
    // Declaration de variable mutable
    var age: Int

    // Assignation ou initialisation
    age = 53
    println("age = $age")

    // Declaration suivie d'une assignation
    var prenom: String = "Joachim"
    println("prenom = $prenom")

    // Toute variable declarer peut être modifier en valeur de meme type
    // age = "53" // --> NE COMPILE PAS
    age = 35
    prenom = "Ange"
    println("Je me m'appelle $prenom et j'ai $age ans")

    // Outre les variables déclarées avec le mot-clé var et dont il est
    // possible de changer la valeur à tout moment, il existe les variables en lecture seule.
    // Elles ne peuvent prendre qu’une seule valeur.
    // Une fois cette valeur affectée, il n’est plus possible de la changer.
    val maValeur: String
    maValeur = "Joachim"
    println("maValeur = $maValeur")

    // Toute tentative de modification entrainera une erreur de compilation
    // maConstante = "Patricia" // -> NE COMPILE PAS

    // On peut inferer le type d'un variable de façon generale
    val nom = "Zadi";
    println("nom = $nom")
}