class car{
    var make:String="TOYOTA"
    var model:String="Prius"
    var color:String="Black"
    var drivingSpeed:Int=100


    fun drive(){
        println("Driving")
    }

    fun turn(){
        println("Turning")
    }
     fun stop(){
         println("Halting")
     }

}
 fun main(){
     var driver=car()
     println(driver.make + " " + driver.model + " " + driver.color + " " +driver.drivingSpeed)


 }