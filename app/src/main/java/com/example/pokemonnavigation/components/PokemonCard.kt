package com.example.pokemonnavigation.components
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.pokemonnavigation.model.Pokemon

@Composable
fun PokemonCard(
    pokemon: Pokemon,
    onItemClick: (Pokemon) -> Unit
) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable { onItemClick(pokemon) },
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = pokemon.url,
                contentDescription = "Pokemon Image",
                modifier = Modifier.size(84.dp)
            )
            Column(Modifier.padding(start = 12.dp)) {
                Text(pokemon.name, style = MaterialTheme.typography.titleLarge)
                Text("HP: ${pokemon.hp}", style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}
