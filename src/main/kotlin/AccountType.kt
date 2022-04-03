//enum class AccountType {
//    BRONZE,
//    GOLD,
//    PLATINUM,
//    SILVER
//}

fun main() {
    println(AccountType.SILVER)
    println(AccountType.GOLD.calculatedPercentage())
    println(AccountType.PLATINUM.numberOfSubscriptions)

    val value = AccountType.valueOf("Platinum".uppercase())
    println(value)
    println(value.calculatedPercentage())
    println(value.numberOfSubscriptions)

    for(accountType in AccountType.values()) {
        println(accountType)
    }

    val account = AccountType.getAccountTypeByName("Platinum")
    println("Account Type: $account")
}

//enum class AccountType(val discountPercentage: Int, val numberOfSubscriptions: Int) {
//    BRONZE(10, 1),
//    SILVER(15, 3),
//    GOLD(20, 5),
//    PLATINUM(25, 10)
//}

enum class AccountType(val numberOfSubscriptions: Int) {
    BRONZE(1) {
        override fun calculatedPercentage(): Int = 10
    },
    SILVER(3) {
        override fun calculatedPercentage(): Int {
            return 15
        }
    },
    GOLD(5) {
        override fun calculatedPercentage(): Int = 10
    },
    PLATINUM(10) {
        override fun calculatedPercentage(): Int = 25
    };

    abstract fun calculatedPercentage(): Int

    companion object {
        fun getAccountTypeByName(name: String) = valueOf(name.uppercase())
    }
}