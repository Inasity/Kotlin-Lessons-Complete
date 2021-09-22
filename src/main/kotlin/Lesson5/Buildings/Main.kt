package Lesson5.Buildings

fun main(args: Array<String>)
{
    Building(Wood()).build()
    isSmallBuilding(Building(Brick()))
    isSmallBuilding(Building(Wood()))
}