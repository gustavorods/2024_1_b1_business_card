package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
                    IntroductionCard()
                    infoCard()
                }
            }
        }
    }
}

@Composable
fun IntroductionCard() {
    var photo = painterResource(R.drawable.ic_launcher_background)
    Column(Modifier
        .fillMaxWidth(),
        Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            Modifier
                .fillMaxWidth(),
                Arrangement.Center,
        ) {
            Image(painter = photo, contentDescription = null)
        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Text(text = "Gustavo Rodrigues",
                fontSize = 25.sp
                )
        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center,
        ) {
            Text(text = "Back-end developer",
                fontSize = 15.sp)
        }
    }
}

@Composable
fun infoCard() {
    var phoneIcon = painterResource(R.drawable.phone_solid__1_)
    var linkidin = painterResource(R.drawable.linkedin)
    var email = painterResource(R.drawable.envelope_solid)
    Column(
        Modifier
            .fillMaxWidth(),
            Arrangement.Bottom,
           horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Column {
            Row() {
                Image(painter = phoneIcon,
                    contentDescription = null,
                    modifier = Modifier
                        .width(25.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "++55 (11) 99999-9999")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row() {
                Image(painter = linkidin,
                    contentDescription = null,
                    modifier = Modifier
                        .width(25.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "@Gustavo Rodrigues")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                Modifier
                    .padding(bottom = 10.dp)
            ) {
                Image(painter = email,
                    contentDescription = null,
                    modifier = Modifier
                        .width(25.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))

                Text(text = "gustavo.rlsilva07@gmail.com")
            }
        }
    }
}

@Composable
@Preview
fun cardPreview() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        IntroductionCard()
        infoCard()
    }
}