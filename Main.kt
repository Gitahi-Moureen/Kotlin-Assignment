fun main () {
     helloName("Gitahi")
    var x = modulus(456 , 15)
    println(x)
    println(add(41, 26, 12.73, 2))
    interestingFactsAboutMe()



}
fun helloName(name:String){
    var name = "Hello ${name}"
    println(name)
}

fun modulus(num1:Int , num2: Int):Int{
    var modulus = num1 % num2
    return modulus



}
fun add(num3:Int , num4: Int , num5: Double, num6: Int):Double{
    var sum = num3 + num4 + num5 + num6
    return sum

}
fun interestingFactsAboutMe(){
    var fact = "I can sing"
    println(fact)

}
