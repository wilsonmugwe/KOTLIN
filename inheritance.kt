//Parent class
open class Animal() {
    var age: Int = 21
    var gender: String = "Male"

    fun ismammal() {
        println("Animal is a mammal")

    }
}
//Child classes
class Duck:Animal(){
    var color:String="Black"

    fun swim(){
     println("Swimming")
    }

}
class Fish:Animal(){
    var canEat:Boolean=true

    fun swim(){
        println("Swimming")
    }
}
class Horse:Animal(){
    var isWild:Boolean=false

    fun run(){
        println("Running")

    }
}
fun main(){
    var  d=Duck()
    println(d.color)

    var h=Horse()
    h.ismammal()
    println(h.gender)

    
    var f=Fish()
}