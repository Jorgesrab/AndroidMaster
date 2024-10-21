package com.example.pmdm

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidmaster.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val imageView = findViewById<ImageView>(R.id.imagenOlla)
        imageView.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);

        val width = imageView.measuredWidth
        val height = imageView.measuredHeight

        // Para mandar un aviso usamos la clase Toast.
        Toast.makeText(this, "Ancho: " + width + " Alto: " + height, Toast.LENGTH_SHORT).show()
    }
}