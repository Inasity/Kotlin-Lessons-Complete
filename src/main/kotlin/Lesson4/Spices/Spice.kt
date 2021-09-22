package Spices

import java.awt.Color

abstract sealed class Spice (var name: String, var spiciness: String = "mild", color: SpiceColor):
SpiceColor by color
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

    fun showInfo() {println("Name: ${name}, Spiciness: ${spiciness}, Heat: $heat")}

    abstract fun prepareSpice()

    fun showColor() = println("Color is: $color")

}

class Curry (name: String, spiciness: String, color: SpiceColor = YellowSpiceColor): Spice(name, spiciness, color), Grinder
{
    override fun grind() {

    }

    override fun prepareSpice() {
        grind()
    }
}

interface Grinder
{
    fun grind()
}

interface SpiceColor
{
    var color: Color
}

object YellowSpiceColor : SpiceColor{
    override var color: Color = Color.yellow
}

data class SpiceContainer (var spice: Spice)
{
    val label = spice.name
}
