package mx.edu.uttt.logincompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import mx.edu.uttt.logincompose.app.PostOfficeAppRouter
import mx.edu.uttt.logincompose.app.Screen
import mx.edu.uttt.logincompose.components.HeadingTextComponent
import mx.edu.uttt.logincompose.navigations.SystemBackButtonHandler

@Composable
fun Screen.TerminosCondicionesScreen()
{
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
            .padding(16.dp)
    ) {
        HeadingTextComponent(value = "Terminos de Uso")
    }
    SystemBackButtonHandler {
        PostOfficeAppRouter.navigateTo(Screen.SingUpScreen)
    }
}


/*@Preview
@Composable
fun TerminosCondicionesScreenPreview()
{
    TerminosCondicionesScreen()
}
*/
