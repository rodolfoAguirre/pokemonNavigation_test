package com.example.pokemonnavigation.model
data class Pokemon(
    val id: Int,
    val name: String,
    val url: String,
    val hp: String
)
fun getPokemons(): List<Pokemon> = listOf(
    Pokemon(1, "Bulbasaur", "https://img.pokemondb.net/artwork/large/bulbasaur.jpg", "45"),
    Pokemon(2, "Charmander", "https://img.pokemondb.net/artwork/large/charmander.jpg", "39"),
    Pokemon(3, "Weedle", "https://img.pokemondb.net/artwork/large/weedle.jpg", "40"),
    Pokemon(4, "Squirtle", "https://img.pokemondb.net/artwork/large/squirtle.jpg", "44"),
    Pokemon(5, "Pidgey", "https://img.pokemondb.net/artwork/large/pidgey.jpg", "44"),
    Pokemon(6, "Pikachu", "https://img.pokemondb.net/artwork/large/pikachu.jpg", "35"),
    Pokemon(7, "Haunter", "https://img.pokemondb.net/artwork/large/haunter.jpg", "45"),
    Pokemon(8, "Vulpix", "https://img.pokemondb.net/artwork/large/vulpix.jpg", "38"),
    Pokemon(9, "Tauros", "https://img.pokemondb.net/artwork/large/tauros.jpg", "75"),
    Pokemon(10, "Machop", "https://img.pokemondb.net/artwork/large/machop.jpg", "70"),
    Pokemon(11, "Magikarp", "https://img.pokemondb.net/artwork/large/magikarp.jpg", "20"),
)
