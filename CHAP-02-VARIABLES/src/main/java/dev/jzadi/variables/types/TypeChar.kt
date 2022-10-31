package dev.jzadi.variables.types

/**
 * Fichier TypeChar, créée le 31/10/2022 à 15:07
 *
 * @author Joachim Zadi
 * @version 1.0 du 31/10/2022
 */

fun main() {
    /*
     * Les caractères sont représentés par le type Char.
     * Les caractères littéraux sont déclarés entre guillemets simples : '1'.
     * Les caractères spéciaux commencent par une barre oblique inverse \.
     * Les séquences d'échappement suivantes sont prises en charge :
     *      \t – tab
     *      \b – backspace
     *      \n – new line (LF)
     *      \r – carriage return (CR)
     *      \' – single quotation mark
     *      \" – double quotation mark
     *      \\ – backslash
     *      \$ – dollar sign
     */

    val lettre:Char = 'c'
    println("lettre = $lettre")
    println('\n')       // Imprime un caractère de nouvelle ligne supplémentaire
    println('\uFF00')   // Pour encoder tout autre caractère, utilisez la syntaxe de séquence d'échappement Unicode : '\uFF00'.
}