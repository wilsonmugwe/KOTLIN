import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)

    print("Enter width:")
    var wid=read.nextInt()

    print("Enter length:")
    var len=read.nextInt()

    var area=(wid*len)
    println(area)
}