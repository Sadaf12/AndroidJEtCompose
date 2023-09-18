package com.example.myfirstcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.TextUnit
import com.example.myfirstcompose.ui.theme.MyFirstComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Textinput(name = "Zurich")
        }
    }
}

//@Preview(showBackground = true, name = "Sadaf", showSystemUi = true)
@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        color = Color.Gray,
        fontSize = TextUnit.Unspecified,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.SemiBold
        )
    Image(painter = painterResource(id = R.drawable.baseline_album_24),
        contentDescription = "")
}
@Composable
fun Textinput(name: String) {
    val state = remember {mutableStateOf("")    }
    TextField(
            value = state.value,
            onValueChange = {
//                Log.d("MyCompose", it)
                state.value = it
            },
            label = { Text(text = "Enter Something") },
            placeholder = {}
        )
    }


@Preview(showBackground = true, name = "Sadaf", widthDp = 200, heightDp = 200)
@Composable
fun Previewfunction(name: String = "Zurich") {
    Greeting("Zurich")
}