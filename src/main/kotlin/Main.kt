

fun main() {
printMyName("Janet Museveni")
    modulus(34,56)
    modulus(58, 45)
    printMyName("Jane")
countchars("avocado")
    countchars("Matayo")
    addTwoNumbers(4,5)

}
fun printMyName(name: String){
    println(name)
}
fun modulus(num1: Int, num2: Int):Int{
    var result= num1 % num2
    println(result)
    return result
}
fun countchars(word: String){
    var wordlen = word.length
    println(wordlen)
}
fun Area( circleArea: Float){
    println(circleArea)
}


fun addTwoNumbers(num1: Int, num2: Int): Int{
    var sum = num1 +  num2
    var  square = sum * sum
    println(square)
    return square
}