package mx.edu.uttt.logincompose.app
//detectar el navigation controller

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

//clase sellada donde se encuentran las pantallas
//aqui le decimos cuantas pantallas tenemos
sealed class Screen(){
    object SingUpScreen: Screen()
    object TerminosCondicionesScreen: Screen()
}

//solo va a hacer la navegacion
// se crea la variable pantalla, la cual tomará de Screen y los hará mutables (pueden cambiar)
//eso es igual al estado mutable de la clase sellada Screen
//en especifico hace referencia a la pantalla SingUpScreen
object PostOfficeAppRouter {
    val pantallaConcurrente: MutableState<Screen> = mutableStateOf(Screen.SingUpScreen)

    //para navegar de una a otra de la clase sellada Screen
    fun navigateTo(destino: Screen){
        pantallaConcurrente.value = destino
    }
}