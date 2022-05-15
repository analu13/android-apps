package dev.analuiza.mvi_animals.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dev.analuiza.mvi_animals.api.AnimalService
import dev.analuiza.mvi_animals.databinding.AnimalItemBinding
import dev.analuiza.mvi_animals.model.Animal

class AnimalListAdapter(private val animals: ArrayList<Animal>) : RecyclerView.Adapter<AnimalListAdapter.DataViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            AnimalItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) = holder.bind(animals[position])

    override fun getItemCount(): Int = animals.size

    class DataViewHolder(private val item: AnimalItemBinding) : RecyclerView.ViewHolder(item.root) {
        fun bind(animal: Animal) {
            item.tvAnimalName.text = animal.name
            item.tvAnimalLocation.text = animal.location

            val url = AnimalService.BASE_URL + animal.image
            Glide.with(item.ivAnimalImage.context)
                .load(url)
                .into(item.ivAnimalImage)
        }
    }

    fun newAnimals(newAnimals: List<Animal>){
        animals.clear()
        animals.addAll(newAnimals)
        notifyDataSetChanged()
    }
}
