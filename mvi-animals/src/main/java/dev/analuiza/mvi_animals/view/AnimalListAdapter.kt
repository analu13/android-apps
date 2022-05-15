package dev.analuiza.mvi_animals.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.analuiza.mvi_animals.R
import dev.analuiza.mvi_animals.model.Animal

class AnimalListAdapter(private val animals: ArrayList<Animal>) : RecyclerView.Adapter<AnimalListAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(animal: Animal) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.animal_item, parent, false)
        )

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) = holder.bind(animals[position])

    override fun getItemCount(): Int = animals.size



}
