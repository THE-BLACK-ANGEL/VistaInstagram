package com.example.tareaevaluable1_angelmiguelmuozcastao

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Label
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tareaevaluable1_angelmiguelmuozcastao.ui.theme.TareaEvaluable1_AngelMiguelMuñozCastañoTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TareaEvaluable1_AngelMiguelMuñozCastañoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { e ->
                    Superior()
                    Intermedia()
                    Inferior()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InstagramPreview() {
    TareaEvaluable1_AngelMiguelMuñozCastañoTheme {
        Superior()
        Intermedia()
        Inferior()
    }
}
//Metodo principal parte superior
@Composable
fun Superior (modifier: Modifier = Modifier)
{
    Box{
        Row{
            Spacer(Modifier.weight(10f))
            IconButton(onClick = { finish() }) {
                Icon(
                    imageVector = Icons.Outlined.Close,
                    contentDescription = null

                )
            }
        }

    }

}
//Metodo principal parte intermedia
@Composable
fun Intermedia(modifier: Modifier= Modifier)
{
    Box(Modifier.fillMaxWidth()){

    }



}
//Metodo principal parte inferior
@Composable
fun Inferior (modifier: Modifier = Modifier)
{

}

//Metodos para los componentes de la parte superior de la aplicacion
fun finish() {
    //TODO("Not yet implemented")
}

//Metodos para los componentes de la parte intermedia de la aplicacion
@Composable
fun Body (){

}
@Composable
fun Logo (){

}
@Composable
fun Email(){

}
@Composable
fun Password(){

}
@Composable
fun OlvidoPass(){

}
@Composable
fun BotonLogin(){

}
@Composable
fun FBLogin (){

}

//Metodos para los componentes de la parte Inferior de la aplicacion

