package moviles.actividades

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import moviles.actividades.ui.theme.AplicacionesMovilesTheme
import android.graphics.Color

class MainActivity : ComponentActivity() {
    fun main(args: Array<String>) {
        println("Validador")
        println(validacion("nombre"))
        println(validacion("_nombre"))
        println(validacion("_12"))
        println(validacion(""))
        println(validacion("012"))
        println(validacion("no$"))
    }
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