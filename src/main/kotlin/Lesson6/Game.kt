package Lesson6

import javax.naming.ldap.StartTlsRequest
import javax.xml.stream.events.EndDocument

class Game
{
    val map = Array(5) { arrayOfNulls<String>(5) }
    var xCoordinate = 0;
    var yCoordinate = 0;
    private val outOfBounds = map.size - 1
    var path = mutableListOf<Direction>(Direction.START)
    var north = { path.add(Direction.NORTH)}
    var south = { path.add(Direction.SOUTH)}
    var east = { path.add(Direction.EAST)}
    var west = { path.add(Direction.WEST)}
    var end = { path.add(Direction.END); println("Game over: $path"); println("You ended up at $xCoordinate, $yCoordinate.") ;path.clear(); path.add(Direction.START) ;false
    }

    private fun move(where: () -> Boolean)
    {
        where.invoke()
    }

    fun makeMove(command: String?)
    {
        updateLocation(command)
    }

    private fun updateLocation(dir: String?)
    {

        when (dir)
        {
            "n" -> if (yCoordinate<outOfBounds)
            {
                yCoordinate++; move(north)
            }
                else println("Path blocked")

            "s" -> if (yCoordinate>0)
            {
                yCoordinate--; move(south)
            }
            else println("Path blocked")

            "e" -> if (xCoordinate<outOfBounds)
            {
                xCoordinate++; move(east)
            }
            else println("Path blocked")

            "w" -> if (xCoordinate>0)
            {
                xCoordinate--; move(west)
            }
            else println("Path blocked")

            else -> move(end)
        }
    }
}

enum class Direction()
{
    NORTH, SOUTH, EAST, WEST, START, END
}