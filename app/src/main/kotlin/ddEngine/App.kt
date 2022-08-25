package ddEngine
import ddEngine.objects.Cell
import ddEngine.objects.Collisions

fun main() {
    var myCell: Cell = Cell("firstCell", 0, 0, Collisions.LEVEL1.value, "/texture.png")
    println(myCell)
}
