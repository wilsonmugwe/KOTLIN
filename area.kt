import java.util.Scanner
fun main(){
    var me=Scanner(System.`in`)

    print("Enter a:")
    var a=me.nextInt()

    print("Enter b:")
    var b=me.nextInt()

    print("Enter height:")
    var h=me.nextInt()

    var area=((a+b)*h*0.5)
    println(area)

}
