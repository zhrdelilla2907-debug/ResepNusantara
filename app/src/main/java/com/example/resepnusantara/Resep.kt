package com.example.resepnusantara

data class Resep(
    val name: String,
    val category: String,
    val description: String,
    val ingredients: String,
    val steps: String,
    val imageResId: Int
)