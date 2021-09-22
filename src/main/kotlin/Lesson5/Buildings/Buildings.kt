package Lesson5.Buildings

open class BaseBuildingMaterial ()
{
    open var numberNeeded: Int = 1
}

class Wood() : BaseBuildingMaterial()
{
    override var numberNeeded = 4
}

class Brick() : BaseBuildingMaterial()
{
    override var numberNeeded = 8
}

class Building<T: BaseBuildingMaterial>(var material: T)
{
    var baseMaterialsNeeded = 100
    var actualMaterialsNeeded = baseMaterialsNeeded * material.numberNeeded
    fun build() {
        println("$actualMaterialsNeeded ${material::class.simpleName} is needed.")
    }

}

fun <T : BaseBuildingMaterial> isSmallBuilding (building : Building<T>)
{
    if (building.actualMaterialsNeeded < 500) println("Small building") else println ("Big building")
}