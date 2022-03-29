fun main(args: Array<String>) {
    val whoAmI: String = "Lameck"
    val myNumber: Int = 5
    val myLong: Long = 64
    val bigLong: Long = 1_000_000
    val myChar: Char = 'a' // 16 bit unicode Character
    val multilineString: String = """
        Hello!
        My name is Lameck.
        How are you doing?
    """.trimIndent()

    val multilineStringTwo: String = """
        Hello!
        My name is Lameck.
        How are you doing?
    """.replaceIndent("----")

    println(myLong::class.java)
    println(bigLong)
    println(myNumber.plus(10))
    println(multilineString)
    println(multilineStringTwo)


}