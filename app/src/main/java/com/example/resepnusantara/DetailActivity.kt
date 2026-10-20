package com.example.resepnusantara

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName: TextView = findViewById(R.id.tvDetailName)
        val tvCategory: TextView = findViewById(R.id.tvDetailCategory)
        val tvIngredients: TextView = findViewById(R.id.tvDetailIngredients)
        val tvSteps: TextView = findViewById(R.id.tvDetailSteps)
        val imgDetail: ImageView = findViewById(R.id.imgDetail)

        // Menerima data yang dikirim dari MainActivity
        val name = intent.getStringExtra("EXTRA_NAME")
        val category = intent.getStringExtra("EXTRA_CATEGORY")
        val ingredients = intent.getStringExtra("EXTRA_INGREDIENTS")
        val steps = intent.getStringExtra("EXTRA_STEPS")
        val imageResId = intent.getIntExtra("EXTRA_IMAGE", R.mipmap.ic_launcher)

        tvName.text = name
        tvCategory.text = category
        tvIngredients.text = ingredients
        tvSteps.text = steps
        imgDetail.setImageResource(imageResId)
    }
}