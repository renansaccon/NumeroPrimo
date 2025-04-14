package br.edu.utfpr.numeroprimo

import br.edu.utfpr.numeroprimo.Utils.Primo
import org.junit.Test

import org.junit.Assert.*

class MainCalculaTeste {
    @Test
    fun VerificaPrimo1() {
        assertEquals(Primo(7), "é primo")
    }

    @Test
    fun VerificaPrimo2(){
        assertEquals(Primo(13),"é primo")
    }

    @Test
    fun VerificaPrimo3(){
        assertEquals(Primo(17), "não é primo")
    }

    @Test
    fun VerificaPrimo4(){
        assertEquals(Primo(15), "não é primo")
    }
}