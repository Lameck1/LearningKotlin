interface Discountable {
    fun discountPercent(): Double
}

class GenericToy: Discountable {
    override fun discountPercent(): Double {
        TODO("Not yet implemented")
    }
}