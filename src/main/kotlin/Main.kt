fun printAll (vararg messages: String, prefix: String = " Nome"){
    for(e in messages) println(e + prefix)
}

fun log (vararg entries: String){
    printAll(*entries, prefix = " Vinicius")
}

fun main() {
    val neverNull: String = "This can't be null"


    println("neverNull = ${neverNull}")
    log("Hello", "Hallo", "Salut", "Hola", "Ola")
}