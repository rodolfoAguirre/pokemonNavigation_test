package com.example.pokemonnavigation.screens
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.pokemonnavigation.model.Pokemon

@Composable
fun DetailScreen(
    pokemon: Pokemon?,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        if (pokemon == null) {
            Text("Pokémon no encontrado")
        } else {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(pokemon.name, fontSize = 24.sp)
                Spacer(Modifier.height(8.dp))
                AsyncImage(
                    model = pokemon.url,
                    contentDescription = "Pokemon Image"
                )
                Spacer(Modifier.height(8.dp))
                Text("HP: ${pokemon.hp}")
            }
        }
    }
}
