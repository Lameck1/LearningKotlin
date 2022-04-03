//class User {
//    var firstName: String = ""
//    var lastName: String = ""
//
//    fun printFullName() {
//        println("$firstName $lastName")
//    }
//}

// using the class primary constructor

//class User constructor(var firstName: String, var lastName: String) { OR

class User (var firstName: String, var lastName: String) {

    constructor(firstName: String) : this(firstName, "Unknown") {
        println("Secondary constructor called!")
    }

    companion object {

        val users = mutableListOf<User>()

        fun createUsers(count: Int) {
            for (i in 0..count) {
                users.add(User("Firstname$i", "Lastname$i"))
            }
        }

        fun createUser(firstName: String, lastName: String): User {
            return User(firstName, lastName)
        }
    }
//    var fullName = "$firstName $lastName"
//        get() = "Full Name: $field" // the backing field
//        set(value) {
//            field = if (value.startsWith("L")) {
//                "L. Otieno"
//            } else {
//                value
//            }
//        }

    fun fullName(): String = "$firstName $lastName"

    override fun toString(): String {
        return fullName()
    }

    init {
        println("This class is for ${fullName()}")
    }

    fun printFullName() {
        println("$firstName $lastName")
    }
}