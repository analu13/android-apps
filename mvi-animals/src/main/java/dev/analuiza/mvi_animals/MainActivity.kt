package dev.analuiza.mvi_animals

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import dev.analuiza.mvi_animals.api.AnimalService
import dev.analuiza.mvi_animals.databinding.ActivityMainBinding
import dev.analuiza.mvi_animals.view.AnimalListAdapter
import dev.analuiza.mvi_animals.view.MainIntent
import dev.analuiza.mvi_animals.view.MainState
import dev.analuiza.mvi_animals.view.MainViewModel
import dev.analuiza.mvi_animals.view.ViewModelFactory
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var mainViewModel: MainViewModel
    private var adapter = AnimalListAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupUI()
        setupObervables()
    }

    private fun setupUI() {
        mainViewModel = ViewModelProvider(this, ViewModelFactory(AnimalService.api))[MainViewModel::class.java]
        binding.recyclerView.adapter = adapter
        binding.buttoFetchAnimals.setOnClickListener {
            lifecycleScope.launch {
                mainViewModel.userIntent.send(MainIntent.FetchAnimals)
            }
        }
    }

    private fun setupObervables() {
        lifecycleScope.launch {
            mainViewModel.state.collect { collector ->
                when (collector) {
                    is MainState.Idle -> {
                    }
                    is MainState.Loading -> {
                        binding.buttoFetchAnimals.visibility = View.GONE
                        binding.progressBar.visibility = View.VISIBLE
                    }
                    is MainState.Animals -> {
                        binding.progressBar.visibility = View.GONE
                        binding.buttoFetchAnimals.visibility = View.GONE
                        binding.recyclerView.visibility = View.VISIBLE
                        collector.animals.let { adapter.newAnimals(it) }
                    }
                    is MainState.Error -> {
                        binding.progressBar.visibility = View.GONE
                        binding.buttoFetchAnimals.visibility = View.GONE
                        Toast.makeText(this@MainActivity, collector.error, Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}
