package com.example.myfirstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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

class RecyclerviewLazyColumnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           GreetingPreview()
        }
    }
}


@Composable
fun RowItem(img: Int, title: String, subtitle: String) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
        modifier = Modifier.padding(5.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(5.dp)
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = " ",
                modifier = Modifier
                    .size(48.dp)
                    .padding(5.dp)
            )
            ItemDescription(title, subtitle)
        }
    }

}

@Composable
private fun ItemDescription(title: String, subtitle: String) {
    Column() {
        Text(
            text = title,
            style = MaterialTheme.typography.titleMedium
        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Thin,
            fontSize = 12.sp
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
//        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//            getItemList().map { item ->
//                RowItem(img = item.img,
//                    title = item.title,
//                    subtitle = item.subtitle)
//            }
//        }

    //for recyclerview using lazycolumn
    LazyColumn(content = {
        items(getItemList()){
            item: Category -> RowItem(img = item.img,
            title = item.title,
            subtitle = item.subtitle)
        }
    })
}

data class Category(val img: Int, val title: String, val subtitle: String)
    fun getItemList(): MutableList<Category> {
        val list = mutableListOf<Category>()
        list.add(Category(R.drawable.a, "Sadaf", "Android"))
        list.add(Category(R.drawable.b, "Sadaf", "Android"))
        list.add(Category(R.drawable.a, "Sadaf", "Android"))
        list.add(Category(R.drawable.b, "Sadaf", "Android"))
        list.add(Category(R.drawable.a, "Sadaf", "Android"))
        list.add(Category(R.drawable.b, "Sadaf", "Android"))
        list.add(Category(R.drawable.a, "Sadaf", "Android"))
        list.add(Category(R.drawable.b, "Sadaf", "Android"))
        list.add(Category(R.drawable.a, "Sadaf", "Android"))
        list.add(Category(R.drawable.b, "Sadaf", "Android"))
        list.add(Category(R.drawable.a, "Sadaf", "Android"))
        list.add(Category(R.drawable.b, "Sadaf", "Android"))
        list.add(Category(R.drawable.a, "Sadaf", "Android"))
        list.add(Category(R.drawable.b, "Sadaf", "Android"))
        list.add(Category(R.drawable.a, "Sadaf", "Android"))
        list.add(Category(R.drawable.b, "Sadaf", "Android"))
        list.add(Category(R.drawable.a, "Sadaf", "Android"))
        list.add(Category(R.drawable.b, "Sadaf", "Android"))
        list.add(Category(R.drawable.a, "Sadaf", "Android"))
        list.add(Category(R.drawable.b, "Sadaf", "Android"))
        list.add(Category(R.drawable.a, "Sadaf", "Android"))
        list.add(Category(R.drawable.b, "Sadaf", "Android"))
        list.add(Category(R.drawable.a, "Sadaf", "Android"))
        return list
}