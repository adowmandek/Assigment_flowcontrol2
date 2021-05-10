import jdk.jfr.Category

fun main() {
    println(isEven(3))
    println(isEven(6))
    bigList()
   println( instituition("banana"))


}
fun isEven(x:Int):Boolean {
    if (x%2==0 ){
        return true

    } else{
        return false
    }

    }
data class Item(val name:String,val weight:Double,var price:Int,val category: Any)

fun bigList(){
var items="Flour"
    when(items) {
        "Flour"-> println("it consist of wheat flour and maize flour")
        "flowers"-> println("Rose flower is my favourite flower")
        else-> println("i get can buy any other item")
   }
}
fun instituition(a: String):String {
    var name=""
    for (x in a) {
        if (a.indexOf(x) % 2 == 0) {
            name += x
        }
    }
return name
}

fun people (name:Array<String>):MutableList<String>{
    var students= mutableListOf<String>()
    for (students in students){
        if (students.length%2==0){

        }
    }
    return students
}

