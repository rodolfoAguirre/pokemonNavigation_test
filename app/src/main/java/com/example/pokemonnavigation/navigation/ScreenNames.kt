package com.example.pokemonnavigation.navigation
sealed class ScreenNames(val route: String) {
    data object Home : ScreenNames("home")
    data object Details : ScreenNames("details/{id}") {
        fun createRoute(id: Int) = "details/$id"
    }
}