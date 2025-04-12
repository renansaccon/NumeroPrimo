package br.edu.utfpr.numeroprimo.Utils

fun Primo(n: Int): String {
    if (n <= 1)
        return "não é primo"
    for (i in 2..n / 2) {
        if (n % i == 0)
            return "não é primo"
    }
    return "é primo"
}