fun main() {
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    val readOnlyShapes1 = listOf("triangle", "square", "circle")
    println("The first item in the list is: ${readOnlyShapes1[0]}")

    val readOnlyShapes2 = listOf("triangle", "square", "circle")
    println("The frist item in the list is: ${readOnlyShapes2.first()}")

    val readOnlyShapes3 = listOf("triangle", "square", "circle")
    println("This list has ${readOnlyShapes3.count()} items")

    val readOnlyShapes4 = listOf("triangle", "square", "circle")
    println("circle" in readOnlyShapes4)

    val shapes1: MutableList<String> = mutableListOf("triangle", "square", "circle")
    shapes.add("pentagon")
    println(shapes1)

    shapes.remove("pentagon")
    println(shapes1) 

    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruit)

    val readOnlyFruit1 = setOf("apple", "banana", "cherry", "cherry")
    println("This set has ${readOnlyFruit1.count()} items")

    val readOnlyFruit2 = setOf("apple", "banana", "cherry", "cherry")
    println("banana"  in readOnlyFruit2)

    val fruit1: MutableList<String> = mutableListOf("apple", "banana", "cherry", "cherry")
    fruit.add("dragonfruit")
    println(fruit1)

    fruit.remove("dragonfruit")
    println(fruit1)

    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    val JuiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(JuiceMenu)

    val readOnlyJuiceMenu1 = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println("The value os apple juice is: ${readOnlyJuiceMenu["apple"]}")

    val readOnlyJuiceMenu2 = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")

    val juiceMenu1: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    juiceMenu1.put("coconut", 150)
    println(juiceMenu1)

    juiceMenu1.remove("orange")
    println(juiceMenu1)

    val readOnlyJuiceMenu3 = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu3.containsKey("kiwi"))

    val readOnlyJuiceMenu4 = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu4.keys)

    println(readOnlyJuiceMenu4.values)

    val readOnlyJuiceMenu5 = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println("orange" in readOnlyJuiceMenu5.keys)

    println(200 in readOnlyJuiceMenu5.values)
}