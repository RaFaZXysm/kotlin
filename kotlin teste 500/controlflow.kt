fun main() {
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    val a = 1
    val b = 2

    println(if (a > b) a else b)

    val obj = "Hello"

     when (obj) {
        "1" -> println("One");
        "Hello" -> println("Greeting");
        else -> println("Unknown")
    }

    val temp = 18

    val description = when {
        temp < 0 -> "very cold"
        temp < 10 -> "e bit cold"
        temp < 20 -> "warm"
        else -> "hot"
    }
     println(description)

     for (number in 1..5) {

        println(number)
     }
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes){
        println("Yummy, it's a $cake cake!")
    }

    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }

    var cakesEaten1 = 0
    var cakesBaked1 = 0
    while (cakesEaten1 < 3) {
        println("Eat a cake")
        cakesEaten1++
    }
    do {
        println("Bake a cake")
        cakesBaked1++
    } while (cakesBaked1< cakesEaten1)
}