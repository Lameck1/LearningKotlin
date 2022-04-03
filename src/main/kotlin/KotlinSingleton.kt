// to create a singleton in Kotlin you only need to introduce the keyword object
// to ensure there is only one instance of the singleton

// replace the class keyword with object
object FavouriteFood {
    var name = "Unknown"
    var ingredients = mutableListOf<String>()
}

fun main() {
    FavouriteFood.name = "Chapati"
    println(FavouriteFood.name)
}