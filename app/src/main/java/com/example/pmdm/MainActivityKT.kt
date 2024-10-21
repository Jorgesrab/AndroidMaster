package com.example.pmdm // Reemplaza con el nombre de tu paquete

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.androidmaster.R

class MainActivityKT : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Crea un ImageView
        val imageView = ImageView(this)
        // Establece la imagen del ImageView (reemplaza con tu recurso de imagen)
        imageView.setImageResource(R.drawable.olla)
        // Establece el tipo de escalado para que la imagen se ajuste al tamaño del ImageView
        imageView.scaleType = ImageView.ScaleType.FIT_XY
        // Define los parámetros de diseño para que el ImageView ocupe toda la pantalla
        imageView.layoutParams = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.MATCH_PARENT,
            FrameLayout.LayoutParams.MATCH_PARENT
        )

        // Crea un TextView
        val textView = TextView(this)
        // Establece el texto del TextView
        textView.text = "Soy Android"
        // Establece el tamaño del texto
        textView.textSize = 30f
        // Centra el texto horizontalmente
        textView.gravity = Gravity.CENTER
        // Establece el color del texto a rojo
        textView.setTextColor(Color.parseColor("#ff0000"))
        // Establece el estilo del texto a negrita
        textView.setTypeface(null, Typeface.BOLD)
        // Define los parámetros de diseño para que el TextView ocupe toda la pantalla
        textView.layoutParams = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.MATCH_PARENT,
            FrameLayout.LayoutParams.MATCH_PARENT
        )

        // Crea un FrameLayout
        val frameLayout = FrameLayout(this)
        // Define los parámetros de diseño para que el FrameLayout ocupe toda la pantalla
        frameLayout.layoutParams = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.MATCH_PARENT,
            FrameLayout.LayoutParams.MATCH_PARENT
        )

        // Agrega el ImageView al FrameLayout
        frameLayout.addView(imageView)
        // Agrega el TextView al FrameLayout (se dibujará encima del ImageView)
        frameLayout.addView(textView)

        // Establece el FrameLayout como la vista de contenido de la actividad
        setContentView(frameLayout)
    }
}