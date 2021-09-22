package Aquarium

fun main (args: Array<String>)
{
    buildAquarium()
    val spice = SimpleSpice()
    println(spice.name)
    println(spice.heat)
    val spices = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "inferno")
    )
    val spice2 = Spice("cayenne", spiciness = "spicy")
    println("")
    val spicelist = spices.filter{it.returnHeat() < 5}
    for (spice in spicelist) spice.showInfo()
}

fun buildAquarium()
{
    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height}")

    myAquarium.height = 80
    println("Height: ${myAquarium.height} cm")
    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small aquarium: ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)

    println("Small Aquarium 2: ${myAquarium2.volume} liters with " +
    "length ${myAquarium2.length} " +
    "width ${myAquarium2.width} " +
    "height ${myAquarium2.height} ")
}