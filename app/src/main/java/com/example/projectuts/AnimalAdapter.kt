package com.example.projectuts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimalAdapter(private val context: Context, private val animal: List<Animal>, val listener: (Animal) -> Unit)
    : RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>(){

    class AnimalViewHolder (view: View): RecyclerView.ViewHolder(view){

        val imgAnimal = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameAnimal = view.findViewById<TextView>(R.id.tv_item_name)
        val descAnimal = view.findViewById<TextView>(R.id.tv_item_description)

        fun blindView(animal: Animal, listener: (Animal) -> Unit) {
            imgAnimal.setImageResource(animal.imgAnimal)
            nameAnimal.text = animal.nameAnimal
            descAnimal.text = animal.descAnimal
            itemView.setOnClickListener {
                listener(animal)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        return AnimalViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_binatangbuas, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.blindView(animal[position], listener)
    }

    override fun getItemCount(): Int = animal.size
    }