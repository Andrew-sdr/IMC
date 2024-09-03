package com.example.imc

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class ResultadoActivity : AppCompatActivity() {

    private lateinit var titleDensidadeCorporal: TextView
    private lateinit var textViewHeaderDensidadeCorporal: TextView
    private lateinit var textViewResultadoDensidadeCorporal: TextView
    private lateinit var textViewPeso: TextView
    private lateinit var textViewAltura: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado2)

        // Inicializando os componentes com findViewById
        titleDensidadeCorporal = findViewById(R.id.titleDensidadeCorporal)
        textViewHeaderDensidadeCorporal = findViewById(R.id.textViewHeaderDensidadeCorporal)
        textViewResultadoDensidadeCorporal = findViewById(R.id.textViewResultadoDensidadeCorporal)
        textViewPeso = findViewById(R.id.textViewPeso)
        textViewAltura = findViewById(R.id.textViewAltura)

        // Obtendo o objeto IMC passado pela Intent
        val imc = intent.getParcelableExtra<IMC>("value")

        // Configurando os textos dos componentes da UI
        titleDensidadeCorporal.text = imc?.nome.toString()
        textViewHeaderDensidadeCorporal.text = imc?.calcular()
        textViewResultadoDensidadeCorporal.text ="Seu IMC ${imc?.imc.toString()}"
        textViewPeso.text = "Seu Peso ${imc?.peso.toString()}"
        textViewAltura.text = "Sua Altura ${imc?.altura.toString()}"
    }
}