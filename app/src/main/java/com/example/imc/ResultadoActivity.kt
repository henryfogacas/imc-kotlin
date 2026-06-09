package com.example.imc

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadoActivity : AppCompatActivity() {

    private lateinit var titleDensidadeCorporal: TextView
    private lateinit var textViewHeaderDensidadeCorporal: TextView
    private lateinit var textViewResultadoDensidadeCorporal: TextView
    private lateinit var textViewPeso: TextView
    private lateinit var textViewAltura: TextView
    private lateinit var btnFecharResultados: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado2)

        titleDensidadeCorporal = findViewById(R.id.titleDensidadeCorporal)
        textViewHeaderDensidadeCorporal = findViewById(R.id.textViewHeaderDensidadeCorporal)
        textViewResultadoDensidadeCorporal = findViewById(R.id.textViewResultadoDensidadeCorporal)
        textViewPeso = findViewById(R.id.textViewPeso)
        textViewAltura = findViewById(R.id.textViewAltura)
        btnFecharResultados = findViewById(R.id.btnFecharResultados)

        val imc = intent.getParcelableExtra<IMC>("value")

        val classificacao = imc?.calcular()

        titleDensidadeCorporal.text = imc?.nome.toString()
        textViewHeaderDensidadeCorporal.text = classificacao

        // IMC arredondado para 2 casas decimais (ex.: "Seu IMC 19,54")
        textViewResultadoDensidadeCorporal.text =
            getString(R.string.labelResultadoImc, imc?.imcFormatado())

        // Demais informações usadas no cálculo: peso e altura
        textViewPeso.text = getString(R.string.labelResultadoPeso, imc?.peso.toString())
        textViewAltura.text = getString(R.string.labelResultadoAltura, imc?.altura.toString())

        btnFecharResultados.setOnClickListener {
            finish()
        }
    }
}
