fun main(){
    val vet = Vet()
    val animals = listOf(
        Dog("meat","dog house","Woof!"),
        Cat("fish","kitchen","Meow!"),
        Horse("grass","field","Frrr!"))
    animals.forEach{animal ->
        vet.treatAnimal(animal)
    }
}