//arithmetic operators//
fun main(){
    var num1:Int=25

    var num2:Int=6
    println(num1+num2)
    println(num1-num2)
    println(num1/num2)
    println(num1*num2)
    println(num1%num2)//modulus//

    //Assignment operators//
    var x=5
    println(x)

    var y=35
    y%=7
    println(y)

    var a=78
    a-=5
    println(a)

    //comparison operators
    var number:Int=100
    println(number<20)
    println(number>10)
    println(number==100)
    println(number<=20)
    println(number!=20)

    //logical operators
    var myNumber=90
    println(myNumber<100 && myNumber==30) //and
    println(myNumber<100 || myNumber==30) //or
    println(!(myNumber<100 || myNumber==30)) //not


}