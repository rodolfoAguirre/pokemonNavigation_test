package com.example.pokemonnavigation.screens
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.pokemonnavigation.components.PokemonCard
import com.example.pokemonnavigation.model.Pokemon

@Composable
fun HomeScreen(
    pokemons: List<Pokemon>,
    onItemClick: (Pokemon) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(pokemons) { pokemon ->
            PokemonCard(pokemon = pokemon, onItemClick = onItemClick)
        }
    }
}