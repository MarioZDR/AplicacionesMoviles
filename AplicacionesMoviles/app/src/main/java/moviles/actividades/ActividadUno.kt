package moviles.actividades

fun main(args: Array<String>) {
    println("Validador")
    println(validacion("nombre"))
    println(validacion("_nombre"))
    println(validacion("_12"))
    println(validacion(""))
    println(validacion("012"))
    println(validacion("no$"))
}

fun validacion(cadena: String): Boolean{
    if(cadena.isEmpty()){
        return false
    }
    val primerCaracter = cadena.get(0)
    if(!(primerCaracter == '_' || primerCaracter.isLetter())){
        return false
    }
    for(caracter in cadena)
        if(!(caracter.isLetterOrDigit()|| caracter == '_'))
            return false
    return true
}