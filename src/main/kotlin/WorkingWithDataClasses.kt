fun main() {
    val vehicle1 = Vehicle("Toyota Corolla", "Saloon", "XSE")
    val vehicle2 = Vehicle("Toyota Corolla", "Saloon", "XSE")

    println(vehicle1 == vehicle2)
    println(vehicle1.name)
    println(vehicle2.component3())

//    Destructuring
    val (name, type, trim) = vehicle1
    
    println("Vehicle name: $name")
    println("Vehicle type: $type")
    println("Vehicle trim: $trim")
}