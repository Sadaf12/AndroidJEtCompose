package com.example.myfirstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstcompose.ui.theme.MyFirstComposeTheme

class RowAndColumnLayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RowColumnPreview()
        }
    }
}

@Composable
fun PreviewColFunction() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "A", fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }
}


@Composable
fun PreviewRowFunction() {
    Row(
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "A", fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }
}

@Composable
fun PreviewBoxFunction() {
    Box(
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.baseline_album_24),
            contentDescription = ""
        )
        Image(
            painter = painterResource(id = R.drawable.baseline_album_24),
            contentDescription = ""
        )
    }
}

@Composable
fun PreviewListViewFunction(img: Int, name: String, occupation: String) {
    Row(Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = img),
            contentDescription = "",
            Modifier.size(40.dp)
        )
        Column() {
            Text(
                text = name,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = occupation,
                fontWeight = FontWeight.Thin,
                fontSize = 16.sp
            )
        }
    }
}

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun RowColumnPreview() {
    Column {
        PreviewListViewFunction(R.drawable.baseline_album_24, "Sadaf", "Android Engineer")
        PreviewListViewFunction(R.drawable.baseline_album_24, "Uneza", "Software Engineer")
        PreviewListViewFunction(R.drawable.baseline_album_24, "Shakir", "Android Developer")
        PreviewListViewFunction(R.drawable.baseline_album_24, "Shad", "Civil Engineer")
    }
}