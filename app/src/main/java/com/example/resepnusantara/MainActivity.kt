package com.example.resepnusantara

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listResep = listOf(
            Resep(
                name = "Rendang Padang",
                category = "Makanan Utama",
                description = "Daging sapi empuk dengan bumbu rempah khas Minang yang kaya rasa.",
                ingredients = "1. 500 gram daging rendang, potong 1 cm\n2. 1 bungkus Sajiku Rendang\n3. 200 ml santan kental perasan pertama" +
                        "\n4. 500 ml santan perasan kedua.",
                steps = "1. Siapkan bahan-bahan yang dibutuhkan.\n2. Aduk rata daging dengan Sajiku Rendang. Masukkan santan perasan kedua." +
                        "\n3. Aduk rata, masak di atas api besar 20 menit.\n" +
                        "Masukkan santan kental, aduk rata, masak di atas api sedang, sekitar 10 menit.\n4. " +
                        "Tambah 10 menit pemasakan lagi supaya keluar minyaknya\n" +
                        "Angkat dan sajikan. Pas banget dengan nasi panas dan tahan disimpan untuk 3 hari ke depan..",
                imageResId = R.drawable.rendang1
            ),
            Resep(
                name = "Nasi Goreng Spesial",
                category = "Makanan Utama",
                description = "Nasi goreng lezat dengan suwiran ayam dan telur mata sapi.",
                ingredients = "Nasi putih, ayam, telur, kecap manis, bawang merah, cabai.",
                steps = "1. Tumis bumbu...\n2. Masukkan nasi dan ayam...\n3. Aduk rata dan sajikan.",
                imageResId = R.drawable.nasigoreng
            ),
            Resep(
                name = "Soto Ayam",
                category = "Makanan Berkuah",
                description = "Soto ayam kuah kuning segar dengan suwiran ayam dan koya.",
                ingredients = "Ayam, kol, tauge, bihun, bumbu kuah kuning.",
                steps = "1. Rebus ayam...\n2. Tumis bumbu kuah...\n3. Campurkan dan sajikan hangat.",
                imageResId = R.drawable.sotoayam
            ),
            Resep(
                name = "Sayur Asem",
                category = "Makanan Berkuah",
                description = "Sayur segar dengan kuah asam manis gurih yang menyegarkan khas Sunda/Jawa.",
                ingredients = "Jagung manis, labu siam, kacang panjang, melinjo, asam jawa, bumbu halus.",
                steps = "1. Rebus air dan bumbu halus...\n2. Masukkan jagung dan asam jawa...\n3. Masukkan sayuran lain hingga matang.",
                imageResId = R.drawable.sayurasem
            ),
            Resep(
                name = "Papeda Kuah Kuning",
                category = "Makanan Khas Papua",
                description = "Makanan khas Papua dari sagu kenyal disajikan dengan ikan kuah kuning segar.",
                ingredients = "Tepung sagu, ikan tongkol/kakap, kunyit, serai, kemangi, perasan jeruk nipis.",
                steps = "1. Seduh tepung sagu dengan air panas hingga bening dan kenyal.\n2. Masak ikan dengan bumbu kuah kuning segar.\n3. Sajikan papeda bersama kuah kuning.",
                imageResId = R.drawable.papeda
            )
        )

        val rvRecipes: RecyclerView = findViewById(R.id.rvRecipes)
        rvRecipes.layoutManager = LinearLayoutManager(this)

        val adapter = ResepAdapter(listResep)
        rvRecipes.adapter = adapter
    }
}