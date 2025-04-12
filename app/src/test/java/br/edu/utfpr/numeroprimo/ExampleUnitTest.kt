package br.edu.utfpr.numeroprimo

import br.edu.utfpr.numeroprimo.Utils.Primo
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
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
        assertEquals(Primo(17), "é primo")
    }

    @Test
    fun VerificaPrimo4(){
        assertEquals(Primo(15), "não é primo")
    }
}