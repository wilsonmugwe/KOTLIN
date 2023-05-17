import java.util.Scanner
fun main() {
    var a=Scanner(System.`in`)
    println("Num1:")
    var num1=a.nextInt()

    var b=Scanner(System.`in`)
    print("Num2:")
    var num2=b.nextInt()

    var c=Scanner(System.`in`)
    print("Num3:")
    var num3=c.nextInt()


    if (num1>num2 && num1>num3){
        println(num1)
    }
    else if(num2>num1 && num2>num3){
        println(num2)
    }
    else {
        println(num3)
    }
}




