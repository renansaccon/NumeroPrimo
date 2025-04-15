package br.edu.utfpr.numeroprimo

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import br.edu.utfpr.numeroprimo.Utils.Primo
import br.edu.utfpr.numeroprimo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btCalcular.setOnClickListener {
            val num1 = binding.etNumero1.text.toString().toIntOrNull()
            val num2 = binding.etNumero2.text.toString().toIntOrNull()

            if (num1 != null && num2 != null) {
                val soma = num1 + num2
                val primoValor = Primo(soma)

                val valor = "O número $soma $primoValor"


                AlertDialog.Builder(this)
                    .setTitle("Resultado")
                    .setMessage(valor)
                    .setPositiveButton("Fechar", null)
                    .show()
            } else {
                binding.etNumero1.error = if (num1 == null) "Número inválido" else null
                binding.etNumero2.error = if (num2 == null) "Número inválido" else null
            }
        }
    }
}

