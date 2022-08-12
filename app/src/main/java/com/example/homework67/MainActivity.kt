package com.example.homework67

import android.graphics.fonts.FontStyle
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.homework67.ui.theme.Homework67Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Homework67Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(){
    Image(
        painterResource(R.drawable.pic),
        contentDescription = "",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize())
}
@Composable
fun LayoutContainer() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),

    ) {
        Box(contentAlignment = Alignment.BottomStart) {

            Image(
            painter = painterResource(id = R.drawable.pic),
            contentDescription = ""
            )

            Row(

                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = painterResource(id = R.drawable.location),
                    contentDescription = "Barcelona,Spain",
                    modifier = Modifier.size(20.dp)
                )
                Text(
                    text = "Barcelona, Spain",
                    fontSize = 20.sp,
                    color = Color.White
                )
            }
        }
        Row(Modifier.height(height = 100.dp)) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(80.dp))
                    .size(70.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.chonk),
                    contentDescription = "",
                    Modifier.size(100.dp)
                )
            }

                Text(
                    text = "Mezcal", color = (Color.White),
                    modifier = Modifier.padding(horizontal = 20.dp)
                )
            Text(
                text = "", color = (Color.White),
                modifier = Modifier.padding(horizontal = 40.dp)
            )
                Image(
                    painter = painterResource(id = R.drawable.bookmark),
                    contentDescription = "",
                    Modifier.size(30.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.download),
                    contentDescription = "",
                    Modifier.size(30.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.hearty),
                    contentDescription = "",
                    Modifier.size(30.dp)
                )

        }
        Divider(color = Color.Gray, thickness = 1.dp)
        Row(Modifier.height(height = 90.dp)) {

            Column(Modifier.width(width = 250.dp),) {
                Text(
                    text = "Camera", color = (Color.White),
                    modifier = Modifier.padding(horizontal = 20.dp) ,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Nikon 3D200", color = (Color.White),
                    modifier = Modifier.padding(horizontal = 20.dp)
                )
            }
            Column() {

                Text(text = "Aperture", color = (Color.White),fontWeight = FontWeight.Bold)
                Text(text = "F/5.0", color = (Color.White))
            }


        }
        Row(Modifier.height(height = 80.dp)) {

            Column(Modifier.width(width = 250.dp),) {
                Text(
                    text = "Focal Length", color = (Color.White),
                    modifier = Modifier.padding(horizontal = 20.dp),fontWeight = FontWeight.Bold
                )
                Text(
                    text = "18.0MM", color = (Color.White),
                    modifier = Modifier.padding(horizontal = 20.dp)
                )
            }
            Column() {

                Text(text = "Shutter Speed", color = (Color.White),fontWeight = FontWeight.Bold)
                Text(text = "1/125s", color = (Color.White))
            }


        }
        Row(Modifier.height(height = 80.dp)) {

            Column(Modifier.width(width = 250.dp),) {
                Text(
                    text = "ISO", color = (Color.White),
                    modifier = Modifier.padding(horizontal = 20.dp),fontWeight = FontWeight.Bold
                )
                Text(
                    text = "100", color = (Color.White),
                    modifier = Modifier.padding(horizontal = 20.dp)
                )
            }
            Column() {

                Text(text = "Dimension", color = (Color.White),fontWeight = FontWeight.Bold)
                Text(text = "3096X4882", color = (Color.White))
            }
        }
        Divider(color = Color.Gray, thickness = 1.dp)
        Row(Modifier.height(height = 80.dp)){

            Column(Modifier.width(width = 100.dp)) {
                Text(text = "Views", color = (Color.White),
                    modifier = Modifier.padding(horizontal = 20.dp))
                Text(text = "1.2k", color = (Color.White),
                    modifier = Modifier.padding(horizontal = 20.dp) )
            }
            Column(){

                Text(text = "Downloads", color = (Color.White),
                    modifier = Modifier.padding(horizontal = 30.dp))
                Text(text = "3k", color = (Color.White),
                    modifier = Modifier.padding(horizontal = 30.dp))
            }

            Column(){
                Text(text = "Likes", color = (Color.White),
                    modifier = Modifier.padding(horizontal = 30.dp))
                Text(text = "5k", color = (Color.White),
                    modifier = Modifier.padding(horizontal = 30.dp))
            }


        }

        Row(modifier = Modifier
            .clip(RoundedCornerShape(80.dp))) {
            Text(text ="Barcelona",Modifier.background(Color.Gray).padding(10.dp))
            Text(text ="Spain",Modifier.background(Color.Gray).padding(10.dp))
        }
    }

        }

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Homework67Theme {
        LayoutContainer()
    }
}