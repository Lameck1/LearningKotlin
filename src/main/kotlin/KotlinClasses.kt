//fun main() {
//    var user = User()
//    user.firstName = "Lameck"
//    user.lastName = "Otieno"
//    user.printFullName()
//
//    var friend = User()
//    friend.firstName = "John"
//    friend.lastName = "Omondi"
//    friend.printFullName()
//}


fun main() {
    // Now, passing arguments to the primary class constructor
    val user = User("Lameck", "Otieno")
    println(user.fullName())
    user.printFullName()

    val friend = User("John", "Omondi")
    friend.printFullName()

    val cousin = User("Zachary")

    val userObj = User.createUser("Nancy", "Achieng'")

    println(userObj)

     User.createUsers(5)
    println(User.users)
}