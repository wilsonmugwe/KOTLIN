class Dogg(var breed:String,var size:String,var age:Int,var color:String){

    fun eat(food:String){
     println("The dog is eating " + food)
 }
    fun sleep(action:String){
        println("The dog is " + action)

    }
    fun sit(state:String){
        println("The dog is " + state)

    }
    fun run(movement:String){

    }
}
fun main(){
    var a=Dogg("Neapolitan Mastiff", "Large", 5 , "Black")

    var b=Dogg("Maltese" , "Small" , 2 , "White")
    b.sleep("Sleeping")

    var c=Dogg("Chow Chow" , "Medium", 3 , "Brown")
     (c.sit("Seated"))

    println(a.breed)
    println(b.breed)
    println(c.breed)

}