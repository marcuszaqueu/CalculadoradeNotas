package com.mz.calculadoradenotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mz.calculadoradenotas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btCalcular.setOnClickListener {
            val mensResultado = binding.resultado
            val nt1 = binding.nota1
            val nt2 = binding.nota2
            val nt3 = binding.nota3
            val nt4 = binding.nota4
            val faltas = binding.faltas
            val nota1 = Integer.parseInt(nt1.text.toString())
            val nota2 = Integer.parseInt(nt2.text.toString())
            val nota3 = Integer.parseInt(nt3.text.toString())
            val nota4 = Integer.parseInt(nt4.text.toString())
            val numFaltas = Integer.parseInt(faltas.text.toString())

            val media = (nota1 + nota2 + nota3 + nota4) / 4

            if(media >= 5 && numFaltas <= 20){
                mensResultado.setText("Aluno foi Aprovado \n Média final $media")
                mensResultado.setTextColor(getColor(R.color.green))
            }else if(numFaltas >20){
                mensResultado.setText("Aluno Reprovado por FALTAS \n Média Final $media")
                mensResultado.setTextColor(getColor(R.color.red))
            }else if (media < 5){
                mensResultado.setText("Aluno Reprovado por Notas \n Média Final $media")
                mensResultado.setTextColor(getColor(R.color.red))
            }
        }

    }
}