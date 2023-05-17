fun main(){
    var languages= arrayOf("Python","Kotlin","Java")
    languages[0]="Javascript" //Changing an element
    println(languages[0])   //Accessing an element


    for (c in languages) {
        println(c)
    }
 println(languages.size)
}