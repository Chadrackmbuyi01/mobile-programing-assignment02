package com.example.mobile_programing_assignment02

import android.content.Intent
import android.graphics.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Black
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavHost


class SecondScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(modifier = Modifier.fillMaxSize().background(androidx.compose.ui.graphics.Color.LightGray),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,

                )
            {

                ParagraphStyle()

                Button(onClick = {
                    val navigate2= Intent(this@SecondScreen,ThirdScreen::class.java)
                    startActivity(navigate2)
                },

                    shape= CircleShape,
                    contentPadding = PaddingValues(16.dp),
                    border= BorderStroke(5.dp, Gray),
                    modifier = Modifier.size(width = 200.dp,height = 60.dp),
                    colors = ButtonDefaults.textButtonColors(backgroundColor = Blue, contentColor = Blue
                    )

                ) {
                    Text(text = "Return\n", fontSize = 18.sp, color = White)
                }
            }
            Column(
                Modifier


                    .padding(100.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp)

            ) {

                TextButton(onClick = {
                    val navigate2= Intent(this@SecondScreen,ThirdScreen::class.java)
                    startActivity(navigate2)
                },
                    shape= CircleShape,
                    contentPadding = PaddingValues(16.dp),
                    border= BorderStroke(5.dp, Gray),
                    modifier = Modifier.size(width = 200.dp,height = 60.dp),
                    colors = ButtonDefaults.textButtonColors(backgroundColor = Blue, contentColor = White
                    )
                ) {
                    Text(text = "Current Modules", fontSize = 15.sp)
                }}

        }
    }
}
@Composable
fun ParagraphStyle() {

    Column(

    ) {
        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(color = Blue)) {
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            fontSize = 25.sp
                        )
                    ) {
                        append("Chadrack Mbuyi Kalala \n")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            fontSize = 25.sp
                        )
                    ) {
                        append("\nInformatics and Design \n")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            fontSize = 25.sp
                        )
                    ) {
                        append("\nInformation Technology\n")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            fontSize = 25.sp
                        )
                    ) {
                        append("\n219013012")
                    }

                }
            }
        )

    }
}