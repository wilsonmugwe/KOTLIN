class Person (var name: String,var age: Int,var job_status: String,var gender: String){



}

fun main(){
    var d=Person("Rita", 18, "unemployed" ,"Female")
    println(d.name + " " + d.age + " " + d.job_status + " " + d.gender)
    
    var g=Person("David", 43, "unemployed" ,"Male")
    println(g.name + " " + g.age + " " + g.job_status + " " + g.gender)



}