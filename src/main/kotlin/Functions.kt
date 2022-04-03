fun main() {
    sayHi(
        name = "Lameck",
        age = 30,
        likesChapati = false,
        isDark = true,
        isTall = true
    )

    printBookInfo("Gifted Hands", "Ben Carson", "Lameck Otieno")
}

fun sayHi(
    name: String,
    age: Int,
    likesChapati: Boolean = true,
    isDark: Boolean,
    isTall: Boolean
) {
    println("$name is $age years old! Likes Chapati: $likesChapati! Is Dark: $isDark! Is Tall: $isTall")
}

// The vararg

fun printBookInfo(title: String, vararg authors: String) {
    println("Book Title: $title")
    println("Authors:")
    authors.forEach {
        println(it)
    }
}

