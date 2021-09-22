package Spices

fun main (args: Array<String>)
{
    val yellowCurry = Curry("Curry", "mild")
    yellowCurry.showColor()
    val yellowCurryContainer = SpiceContainer(yellowCurry)
    println(yellowCurryContainer.label)
    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy")))
    for(element in spiceCabinet) println(element.label)
}