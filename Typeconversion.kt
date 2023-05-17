import java.util.Scanner
fun main() {
    var me=Scanner(System.`in`)

    print("Enter radius:")
    var rad=me.nextInt()


    val pi = 3.142


    var area=(pi*rad*rad)
    println(area)

    var z=area.toInt()
    println(z)
}