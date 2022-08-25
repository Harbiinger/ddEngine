package ddEngine.objects

class Cell(var id: String, var x: Int, var y: Int, var collisionLevel: Int, var texture: String) {

    override fun toString(): String {
        return "id              : " + id + "\n" +
               "x               : " + x + "\n" +
               "y               : " + y + "\n" +
               "collision level : " + collisionLevel + "\n" +
               "texture path    : " + texture
    }
}
