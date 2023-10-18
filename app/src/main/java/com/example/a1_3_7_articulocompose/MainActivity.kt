package com.example.a1_3_7_articulocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a1_3_7_articulocompose.ui.theme._1_3_7_ArticuloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _1_3_7_ArticuloComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    ArticuloApp()
                }
            }
        }
    }
}
@Composable
fun ArticuloApp() {
    Articulo(
        title = stringResource(R.string.titulo),
        descripcionCorta = stringResource(R.string.descCorta),
        descripcionLarga = stringResource(R.string.descLarga),
        imagenP = painterResource(R.drawable.bg_compose_background)
    )
}
@Composable
private fun Articulo(
    title: String,
    descripcionCorta: String,
    descripcionLarga: String,
    imagenP: Painter,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Image(painter = imagenP, contentDescription = null)
        Text(text = title, modifier = Modifier.padding(16.dp), fontSize = 24.sp)
        Text(text = descripcionCorta, modifier = Modifier.padding(start = 16.dp, end = 16.dp), textAlign = TextAlign.Justify)
        Text(text = descripcionLarga, modifier = Modifier.padding(16.dp), textAlign = TextAlign.Justify)
    }
}
@Preview(showBackground = true)
@Composable
fun ComposeArticleAppPreview() {
    _1_3_7_ArticuloComposeTheme {
        ArticuloApp()
    }
}