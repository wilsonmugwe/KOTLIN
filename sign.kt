import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)
    println("Enter number:")

    var number: Float
    number = read.nextFloat()

    if (number > 0) {
        println("Number is positive")
    } else if (number < 0) {
        println("Negative")
    } else {
        println("Neither")
    }
}

