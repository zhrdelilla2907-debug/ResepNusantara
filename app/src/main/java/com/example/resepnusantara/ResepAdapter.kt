package com.example.resepnusantara

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ResepAdapter(private val resepList: List<Resep>) : RecyclerView.Adapter<ResepAdapter.ResepViewHolder>() {

    class ResepViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tvRecipeName)
        val tvCategory: TextView = itemView.findViewById(R.id.tvCategory)
        val tvDescription: TextView = itemView.findViewById(R.id.tvDescription)
        val imgRecipe: ImageView = itemView.findViewById(R.id.imgRecipe)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResepViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_resep, parent, false)
        return ResepViewHolder(view)
    }

    override fun onBindViewHolder(holder: ResepViewHolder, position: Int) {
        val resep = resepList[position]
        holder.tvName.text = resep.name
        holder.tvCategory.text = resep.category
        holder.tvDescription.text = resep.description
        holder.imgRecipe.setImageResource(resep.imageResId)

        // Menambahkan fungsi klik untuk membuka DetailActivity
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, DetailActivity::class.java).apply {
                putExtra("EXTRA_NAME", resep.name)
                putExtra("EXTRA_CATEGORY", resep.category)
                putExtra("EXTRA_INGREDIENTS", resep.ingredients)
                putExtra("EXTRA_STEPS", resep.steps)
                putExtra("EXTRA_IMAGE", resep.imageResId)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = resepList.size
}