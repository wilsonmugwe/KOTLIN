class person{
    //Variables/Properties/Attributes/Data members
    var name:String="Wilson"
    var age:Int=21
    var location:String="Nairobi"
    var yearofbirth:Int=1999

    //methods/function
    fun eat(){
        println("Eating")

    }
     fun sleep(){
         println("Sleeping")

     }

}
fun main(){
    var teacher=person()
    println(teacher.location)

    teacher.eat()
}