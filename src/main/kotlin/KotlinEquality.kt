fun main() {
//    Structural
    val name = "Lameck"
    val nameTwo = "Otieno"

    println(name == nameTwo)

//    Referential
//    numbers, chars, booleans all share a special reference to memory.
//    == and === behave the same for numbers, chars and booleans
    val numOne = 1
    val numTwo = 1

    println(numOne == numTwo)

    val personA = Person("Lameck")
    val personB = Person("Lameck")

    println(personA === personB)

}

class Person(var name:String)