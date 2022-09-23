package com.gdscmmdu.thurusdaytriviatwo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gdscmmdu.thurusdaytriviatwo.ui.theme.ThurusdayTriviaTwoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThurusdayTriviaTwoTheme {
                Home()
            }
        }
    }
}

@Composable
fun Home(){
    Column {
        TopImage()
    }
}

@Composable
fun TopImage(){
    Image(painter = painterResource(R.drawable.topimage), contentDescription = null)
    Score()
    Choice()
    Buttons()
    Footer()
}

@Composable
fun Score(){
    Column (modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Score", fontSize = 30.sp)
        Text(text = "0 / 4", fontSize = 50.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun Choice(){
    Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier
        .fillMaxWidth()
        .padding(top = 150.dp)){
     Column() {
         Text("You Choose", fontSize = 16.sp)
         Text("Rock", fontSize = 32.sp, fontWeight = FontWeight.Bold)
     }
        Column() {
            Text("Android Choose", fontSize = 16.sp)
            Text("Paper", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun Buttons(){
    Row (modifier = Modifier.fillMaxWidth().padding(top = 150.dp), horizontalArrangement = Arrangement.SpaceAround){
        Button(onClick = {}, modifier = Modifier.height(100.dp).width(100.dp), shape = RoundedCornerShape(10.dp)){
            Text("Rock", fontSize = 15.sp)
        }
        Button(onClick = {}, modifier = Modifier.height(100.dp).width(100.dp), shape = RoundedCornerShape(10.dp)){
            Text("Paper", fontSize = 15.sp)
        }
        Button(onClick = {}, modifier = Modifier.height(100.dp).width(100.dp), shape = RoundedCornerShape(10.dp)){
            Text("Scissors", fontSize = 15.sp)
        }
    }
}

@Composable
fun Footer(){
    Row(modifier = Modifier.fillMaxWidth().padding(top = 30.dp), horizontalArrangement = Arrangement.Center){
        Text("#JetpackCompose", fontSize = 20.sp, fontFamily = FontFamily.SansSerif)
    }
}