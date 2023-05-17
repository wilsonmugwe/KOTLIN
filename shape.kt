open class Shapes{
    open fun area(){
        println("Calculating area")
    }
}
class Circles:Shapes(){
     override fun area(){
        println("Circle area")
    }
}
class Triangle:Shapes(){
     override  fun area(){
        println("Triangle area")
    }

}
class Rectangless:Shapes(){
    override fun area(){
        println("Rectangle area")
    }

}
fun main(){
    var c=Circles()
    c.area()

    var t=Triangle()
    t.area()

    var r=Rectangless()
    r.area()
}