fun main (){
    salutation("Liliane")
    modulus(15,2)
    total(1,2,3,4)
    Interestingfact("Magic voice")
}
fun salutation(name:String) {
    println("Hello $name")
}

fun modulus(a:Int,b:Int){
    var modulus = a%b
    println(modulus)
}
fun total(x:Int, y:Int, z:Int,n:Int) {
    var total = x + y + z + n
    println(total)
}
fun Interestingfact(serious:String) {
    println(serious)
}