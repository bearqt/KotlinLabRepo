class Horse(food: String, location: String,val noise: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Horse make a sound $noise")
    }
    override fun eat() {
        println("Horse eat $food in $location.")
    }
}