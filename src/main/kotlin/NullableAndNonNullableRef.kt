fun main() {
    // Kotlin nullable type
    var firstName: String? = "Lameck"
    val length = firstName?.length // safe calls(?) must be used with nullable types
    println(length) // - null or 6
    firstName = null

    // Kotlin non-nullable type
    var lastName: String = "Otieno"
    val length2 = lastName.length // you don't need safe call

    // Elvis operator (?:)
    val length3: Int = if (firstName != null) lastName.length else 0
    val length4: Int = firstName?.length ?: 0
}