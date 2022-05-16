/*
* This app has been developed by
* Chadrack Mbuyi Kalala 219013012
* On the 14th of May 2022
*/
package com.example.mobile_programing_assignment02

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class ThirdScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Module()
            val button: MutableState<Boolean> = remember { mutableStateOf(false) }
            Alert(setVisible = button)
            TextView()
            Column(
                modifier = Modifier.fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Box(
                    modifier = Modifier
                        .padding(all = Dp(20F))
                        .background(color = MaterialTheme.colors.secondary)
                        .border(border = BorderStroke(width = 5.dp, brush = SolidColor(Color.Blue)))
                )
                {
                    TextButton(onClick = { button.value = true }) {
                        Text(text = "Good Bye", color = Color.Black)
                    }
                }
            }
        }
    }


@Composable
fun Module() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        )
    {
        LazyColumn() {
            var sub1= subject("APPLICATION DEVELOPMENT PRACTICE 3",
                "Practical module", "year-round ")
            var sub2= subject("APPLICATION DEVELOPMENT THEORY 3",
                "Theory module", "year-round ")
            var sub3= subject("ELECTIVES-MOB PROGRAMING 3",
                "Practical module", "year-round ")
            var sub4= subject("INFORMATION SYSTEMS 3",
                "Practical module", "year-round ")
            var sub5= subject("PROFESSIONAL PRACTICE 3",
                "Theory module", "6 months ")
            var sub6= subject("PROJECT 3",
                "Practical module", "year-round ")
            var sub7= subject("PROJECT MANAGEMENT 3",
                "Theory module", "year-round ")
            var sub8= subject("PROJECT PRESENTATION 3",
                "Practical module", "year-round ")

            val modules = listOf (sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8)


        }

    }
}
data class subject(var mod_name:String, var mod_type: String, var mod_duration:String,)

@Composable
fun MainContent(message: subject )
{

    Row() {

        Spacer(modifier = Modifier.width(23.2.dp))
        var isExpanded by remember { mutableStateOf(false) }

        Column(modifier = Modifier.clickable { isExpanded =!isExpanded  }) {

            Text(text = "${message.mod_name}",
                color = MaterialTheme.colors.secondaryVariant,


                style= MaterialTheme.typography.subtitle2

            )
            Spacer(modifier = Modifier.width(14.2.dp))

            Surface(shape = MaterialTheme.shapes.medium,
                color = MaterialTheme.colors.secondary, elevation = 800.dp) {

                Text(text = "${message.mod_type}",style= MaterialTheme.typography.body1,
                    modifier = Modifier.padding(all = 1.6.dp),
                    maxLines = if (isExpanded) Int.MAX_VALUE else 1)
            }


            Spacer(modifier = Modifier.width(12.dp))

            Surface(shape = MaterialTheme.shapes.medium,
                color = MaterialTheme.colors.secondary, elevation = 800.dp) {

                Text(text = "${message.mod_duration}",style= MaterialTheme.typography.body1,
                    modifier = Modifier.padding(all = 1.6.dp),
                    maxLines = if (isExpanded) Int.MAX_VALUE else 1)
            }
        }
    }
}
@Composable
fun List (messages: List<subject>)
{
    Column() {

        LazyColumn()
        {

            items(messages) { s -> MainContent(message = s) }
        }
        Column(
            verticalArrangement = Arrangement.Center,

            horizontalAlignment = Alignment.CenterHorizontally,) {
            Box()

            {
                TextButton(
                    onClick = { val nav= Intent(this@ThirdScreen,SecondScreen::class.java)
                        startActivity(nav)},
                    border = BorderStroke(10.dp, Color.DarkGray),
                    contentPadding = PaddingValues(16.dp),
                    modifier = Modifier
                        .size(width = 800.dp, height = 70.dp)
                        .background(Color.Green),
                ) {
                    Text(text = "back", color = Color.Black)
                }
            }
        }
    }
}
@Composable
fun AlertDialog(setVisible: MutableState<Boolean>) {
    if (setVisible.value) {
        AlertDialog(
            onDismissRequest = { setVisible.value = false },

            confirmButton = {
                TextButton(onClick = { setVisible.value = false }) {
                    Text(text = "Yes")
                }
            },
            title = { Text(text = "Warning") },
            text = { Text(text = "Leaving now?") }
        )

    }
}
}