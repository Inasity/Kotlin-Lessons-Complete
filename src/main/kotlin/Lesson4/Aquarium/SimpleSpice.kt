package Aquarium

class SimpleSpice
{
    var name: String = "curry"
    var spiciness: String = "mild"

    val heat: Int
    get() = 5
}

class Spice (var name: String, var spiciness: String = "mild")
{
    private val heat: Int
    get() {
        return when (spiciness) {
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            "inferno" -> 10
            else -> 0
        }
    }

    init {
        println("Name: ${name}, Spiciness: ${spiciness}, Heat: $heat")
    }

    fun returnHeat(): Int {
        return heat
    }

    fun makeSalt() = Spice("Salt")

    fun showInfo() {println("Name: ${name}, Spiciness: ${spiciness}, Heat: $heat")}

}