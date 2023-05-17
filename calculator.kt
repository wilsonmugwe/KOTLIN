
import java.util.Scanner
fun main() {

    var read = Scanner(System.`in`)



    println("Enter first number:")
    var num1: Double
    num1 = read.nextDouble()


    println("Enter second number:")
    var num2: Double
    num2 = read.nextDouble()


    println("Enter operator(+,-,*,/):")
      var operator= readLine()


    var result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> "Invalid Operator"
    }

    println("Answer is $result")
}


