class Dog(food: String, location: String,val noise: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Cat make a sound $noise")
        //WOOF! WOOF! WOOF!")
    }
    override fun eat() {
        println("Dog eat $food in $location.")
    }
}