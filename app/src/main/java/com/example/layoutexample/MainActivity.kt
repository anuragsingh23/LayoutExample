package com.example.layoutexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layoutexample.ui.theme.LayoutExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    MainContent()
                   
                }
            }
        }
    }
}

@Composable
fun MainContent() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.padding(start = 20.dp, top = 80.dp)) {

            Text(
                text = stringResource(id = R.string.week),
                color = Color.Green,
                fontSize = 36.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold
                )
            Text(
                text = stringResource(id = R.string.second),
                color = Color.Black,
                fontSize = 18.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold
            )
            Column(modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(top = 20.dp)) {


                Text(
                    text = stringResource(id = R.string.explore),
                    color = Color.Black,
                    fontSize = 28.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        ) {
                    Text(
                        text = stringResource(id = R.string.recommended),
                        color = Color.Blue,
                        fontSize = 14.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = stringResource(id = R.string.newm),
                        color = Color.Black,
                        fontSize = 14.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 40.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.show),
                        color = Color.Black,
                        fontSize = 14.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 40.dp)
                    )
                }
                Column {
                    Row(modifier = Modifier.fillMaxWidth().padding(top = 20.dp)) {
                        Card(
                            modifier = Modifier
                                .width(160.dp)
                                .height(300.dp),
                            shape = RoundedCornerShape(15.dp),

                            elevation = 10.dp
                        ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.picone),
                                        contentDescription = "",
                                        contentScale = ContentScale.Crop)

                        }
                        Card(
                            modifier = Modifier
                                .width(160.dp)
                                .padding(start = 10.dp)
                                .height(300.dp),
                            shape = RoundedCornerShape(15.dp),
                            elevation = 10.dp
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.pictwo),
                                contentDescription = "",
                                contentScale = ContentScale.Crop)
                        }
                    }
                }
                Row() {
                    Column() {
                       Row() {
                           Text(
                               text = stringResource(id = R.string.nik),
                               fontSize = 20.sp,
                               fontFamily = FontFamily.SansSerif,
                               fontWeight = FontWeight.Bold
                                )

                           Text(
                               text = stringResource(id = R.string.tris),
                               fontSize = 20.sp,
                               fontFamily = FontFamily.SansSerif,
                               fontWeight = FontWeight.Bold,
                               modifier = Modifier.padding(start = 50.dp)
                           )
                       }
                        Text(
                            text = stringResource(id = R.string.paris),
                            fontSize = 15.sp,
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.Bold
                        )
                        Card(
                            modifier = Modifier
                                .fillMaxWidth().fillMaxHeight()
                                .padding(end = 20.dp, top = 20.dp, bottom = 20.dp),
                            shape = RoundedCornerShape(15.dp),
                            elevation = 10.dp
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.picthree),
                                contentDescription = "",
                                contentScale = ContentScale.Crop)
                        }

                    }

                }
                
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LayoutExampleTheme {
       MainContent()
    }
}