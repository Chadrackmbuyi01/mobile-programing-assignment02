package com.example.mobile_programing_assignment02

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.mobile_programing_assignment02.ui.theme.Mobileprogramingassignment02Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mobileprogramingassignment02Theme {
                var visible: MutableState<Boolean> = remember { mutableStateOf(false) }
                Alert(setVisible= visible)
                TextView()
                Column(
                    modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Box( modifier = Modifier.padding(all = Dp(10F)).background(color = MaterialTheme.colors.secondary)
                        .border(border = BorderStroke(width = 1.dp, brush = SolidColor(Color.Green)))
                    )
                    {
                        TextButton(onClick = { visible.value = true }) {
                            Text(text = "Info",color= Color.White)
                        }
                    }

                }
            }
        }
    }
}

@Preview
@Composable
fun TextView() {
    Column(

        modifier = Modifier.fillMaxWidth().fillMaxHeight(),


        verticalArrangement = Arrangement.Top,

        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Welcome to My Jetpack Compose Journey",
            style = TextStyle(
                color = Color.Red,
                fontWeight = FontWeight.Black,
                fontFamily = FontFamily.Default,
                background = Color.White,
                shadow = Shadow(color = Color.Green),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier.padding(all = Dp(22.0F))
        )
    }
}
@Preview
@Composable
fun Alert(setVisible: MutableState<Boolean>)
{
    if(setVisible.value){
        AlertDialog(
            onDismissRequest = { setVisible.value=false },

            confirmButton = {
                TextButton(onClick = {setVisible.value=false}) {
                    Text(text = "OK")
                }
            },
            title = { Text(text = "Alert Dialog")},
            text = { Text(text = "My experience so far with the android elective is positive.")}
        )


    }
}