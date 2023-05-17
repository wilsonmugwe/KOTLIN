open class Figure(){
    var start:String="Starting"


    fun area(){
        println("Area")
    }
    fun perimeter(){
        println("Perimeter")
    }

        fun draw(){
            println("Drawing")
        }

}
class Circle:Figure(){
    var radius:Double=7.0
    val pi=3.142
    var area=pi*radius*radius
    var perimeter=pi*radius*2



}
open class Rectangle:Figure(){
    var width:Double=5.0
    var height:Double=10.0
    var area=width*height
    var perimeter=width+width+height+height



}
class Square:Rectangle(){

}
fun main(){
    var f=Figure()



    var c=Circle()
    println(c.area)


    var r=Rectangle()
    println(r.perimeter)

}