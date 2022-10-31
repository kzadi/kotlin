package dev.jzadi.controles

import java.util.*

/**
 * Fichier When, créée le 31/10/2022 à 17:51
 *
 * @author Joachim Zadi
 * @version 1.0 du 31/10/2022
 */

/*
 * Lorsqu'un argument est donné, l'instruction when correspond à l'argument
 * contre les branches dans l'ordre. La correspondance est effectuée à l'aide
 * de l'opérateur == qui effectue des vérifications nulles et compare les opérandes
 * à l'aide de la fonction equals. Le premier correspondant sera exécuté.
 */
fun main() {
    // Pour la lecture au clavier, on peut utiliser la methode readLine()
    // ou la classe Scanner de java.util
    print("Entrez le numero du jour : ")
    val numJour: Int? = readLine()?.toInt()

    val jourDeLaSemaine: String?;

    when (numJour) {
        1 -> jourDeLaSemaine = "Lundi"
        2 -> jourDeLaSemaine = "Mardi"
        3 -> jourDeLaSemaine = "Mercredi"
        4 -> jourDeLaSemaine = "Jeudi"
        5 -> jourDeLaSemaine = "Vendredi"
        6 -> jourDeLaSemaine = "Samedi"
        7 -> jourDeLaSemaine = "Dimanche"
        else -> jourDeLaSemaine = "Inconnu du System"
    }
    println("jourDeLaSemaine = ${jourDeLaSemaine}")

    // Utilisation du when en tant qu'expression
    val autreJourDeLaSemaine = when (numJour) {
        1 -> "Lundi"
        2 -> "Mardi"
        3 -> "Mercredi"
        4 -> "Jeudi"
        5 -> "Vendredi"
        6 -> "Samedi"
        7 -> "Dimanche"
        else -> "Inconnu du System"
    }
    println("jourDeLaSemaine = ${jourDeLaSemaine}")

    // L'instruction when connaît possède des options de correspondance plus avancées:
    val noms = listOf("Jean", "Sarah", "Tim", "Maggie")
    print("Veuillez effectuer une saisie : ")

    when (val saisie: Any? = Scanner(System.`in`).nextLine()) {
        in noms -> println("Le nom est dans la liste")
        !in 1..10 -> println("La valeur saisie n'est pas dans l'intervalle 1 à 10")
        is String -> println("La longueur de votre saisie est ${saisie.length}")
    }

    val saisie = Scanner(System.`in`).nextLine()
    when {
        saisie in noms -> println("Le nom est dans la liste")
        saisie.toInt() !in 1..10 -> println("La valeur saisie n'est pas dans l'intervalle 1 à 10")
        saisie is String -> println("La longueur de votre saisie est ${saisie.length}")
    }
}