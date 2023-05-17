class Dog(var color:String,var breed:String,var sex:String,var age:Int){

}
fun main(){
    var d=Dog("White" ,"German Shepherd" ,"Female", 5)
    println(d.color + " " +d.breed + " " + d.sex + " " + d.age)

    var puppy=Dog("Brown" ,"Kenyan", "Male" ,6)
    println( puppy.color + " " + puppy.breed + " " + puppy.sex + " " + puppy.age)
}