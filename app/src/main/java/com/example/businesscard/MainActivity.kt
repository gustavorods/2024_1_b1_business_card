package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    middleElements("Gustavo", "FullStack Developer")
                }
            }
        }
    }
}

@Composable
fun middleElements(name: String, subTitle: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_launcher_background)
   Box(modifier = Modifier) {
       Column(
           modifier = Modifier
           //.align(Alignment.CenterHorizontally)
           .padding(horizontal = 16.dp),
           verticalArrangement = Arrangement.Center
       ) {
           Image(
               painter = image,
               contentDescription = null,
           )
           Text(
               text = name,
               lineHeight = 116.sp,
               modifier = modifier
           )
           Text(
               text = subTitle,
               modifier = modifier
           )
       }
   }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        middleElements("Gustavo", "FullStack Developer")
    }
}