package com.example.pokemonnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.pokemonnavigation.model.getPokemons
import com.example.pokemonnavigation.navigation.ScreenNames
import com.example.pokemonnavigation.screens.DetailScreen
import com.example.pokemonnavigation.screens.HomeScreen
import com.example.pokemonnavigation.ui.theme.PokemonnavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokemonnavigationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainNavigation(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainNavigation(modifier: Modifier = Modifier) {
    val nav = rememberNavController()
    val pokemons = remember { getPokemons() }
    NavHost(
        navController = nav,
        startDestination = ScreenNames.Home.route,
        modifier = modifier
    ) {
        // Pantalla de home
        composable(ScreenNames.Home.route) {
            HomeScreen(
                pokemons = pokemons,
                onItemClick = {p -> nav.navigate(ScreenNames.Details.createRoute(p.id))}
            )
        }
        // Pantalal de detalles
        composable(
            route = ScreenNames.Details.route,
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("id")
            val pokemon = pokemons.firstOrNull { it.id == id }
            DetailScreen(pokemon = pokemon)
        }
    }
}
