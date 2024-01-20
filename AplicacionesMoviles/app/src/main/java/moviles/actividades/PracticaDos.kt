package moviles.actividades

fun String.esFina(): Boolean{
    var condicionesCumplidas = 0

    val patron1 = Regex("(bu|ba|be)")
    val patron2 = Regex("[aeiouAEIOU]")
    val patron3 = Regex("(\\w)\\1")

    if(!patron1.containsMatchIn(this))
        condicionesCumplidas++

    if(patron2.findAll(this).count()>=3)
        condicionesCumplidas++

    if(patron3.containsMatchIn(this))
        condicionesCumplidas++

    return condicionesCumplidas >=2
}

fun main(args: Array<String>){
    println("bac".esFina()) // Resultado Esperado: false
    println("aza".esFina()) // Resultado Esperado: false
    println("abaca".esFina()) // Resultado Esperado: false
    println("baaa".esFina()) // Resultado Esperado: true
    println("aaab".esFina()) // Resultado Esperado: true
}
