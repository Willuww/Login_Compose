package mx.edu.uttt.logincompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mx.edu.uttt.logincompose.R
import mx.edu.uttt.logincompose.app.PostOfficeAppRouter
import mx.edu.uttt.logincompose.app.Screen
import mx.edu.uttt.logincompose.components.ButtonComponent
import mx.edu.uttt.logincompose.components.CheckBoxComponent
import mx.edu.uttt.logincompose.components.DividerTextComponent
import mx.edu.uttt.logincompose.components.HeadingTextComponent
import mx.edu.uttt.logincompose.components.NormalTextComponent
import mx.edu.uttt.logincompose.components.TextFieldName

@Composable
fun SignUpScreen(){
    Surface (
        color = Color.White,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(28.dp)
    ){
        //establecemos layout principal del componente de titulo y subtitulo
        Column(modifier = Modifier.fillMaxWidth()) {
            NormalTextComponent(value = "Ey, Registrate Prro")
            HeadingTextComponent(value = "Crea una cuenta")
            Spacer(modifier = Modifier.height(20.dp))
            TextFieldName(labelValue = "Nombre",
                //lo que se encuentra dentro del painterResource es el icono que se encuentra
                //en drawable, carpeta res, y es el nombre del icono que se agregó
                painterResource (id = R.drawable.baseline_co_present_24)
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextFieldName(labelValue = "Apellidos",
                painterResource(id = R.drawable.baseline_person_add_24))
            Spacer(modifier = Modifier.height(8.dp))
            TextFieldName(labelValue = "Email",
                painterResource (id= R.drawable.baseline_email_24))
            Spacer(modifier = Modifier.height(8.dp))
            TextFieldName(labelValue = "Password",
                painterResource (id= R.drawable.baseline_fingerprint_24))
            CheckBoxComponent(value = "Para continuar debes aceptar los terminos y condiciones",
                onTextSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.TerminosCondicionesScreen)
                })
            Spacer(modifier = Modifier.height(20.dp))
            ButtonComponent(value = "Registrate")
            Spacer(modifier = Modifier.height(10.dp))
            DividerTextComponent()
        }
    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}