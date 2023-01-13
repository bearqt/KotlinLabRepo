abstract class Animal constructor(food: String, location: String){
     var food: String? = null
     var location: String? = null
    init {
        this.food = food
        this.location = location
    }
    abstract fun makeNoise()
    abstract fun eat()
    fun sleep() {
        println("${javaClass.typeName} sleep.")
    }
 }