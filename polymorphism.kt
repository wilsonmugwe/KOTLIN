open class Shape{
    open fun draw(){
        println("Drawing")
    }
}
class Rectangles:Shape(){
     override fun draw(){
        println("Drawing a rectangle")
    }
}
class Squares:Shape(){
     override fun draw(){
        println("Drawing a square")
    }

}
fun main(){
    var r=Rectangles()
    r.draw()

    var s=Squares()
}