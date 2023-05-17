import java.util.Scanner

fun main(){
    var m= Scanner(System.`in`)

     println("Enter character:")

    var character=m.next().single()


    if (character=='a' || character=='e' || character=='i' || character=='o' || character=='o' ){
        println("$character is a Vowel")
    }
    else{
        println("$character is a Consonant")
    }
}