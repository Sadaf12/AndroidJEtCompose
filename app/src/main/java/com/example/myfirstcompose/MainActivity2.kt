package com.example.myfirstcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layout = findViewById<ComposeView>(R.id.contentLayout)
        layout.setContent {
//            sayHello(name = "Zurich")
        }
    }

    @Preview(showBackground = true, name = "Sadaf", showSystemUi = true)
    @Composable
    fun PreviewFunc() {
//        sayHello(name = "Zurich")
        Textinput(name = "Swiss")
    }

    @Composable
    fun sayHello(name: String) {
        Text(text = "Hello $name")
    }

    @Composable
    fun Textinput(name: String) {
        TextField(
            value = name,
            onValueChange = {
                Log.d("MyCompose", it)
            },
            label = { Text(text = "Enter Something") },
            placeholder = {}
        )
    }
}