/*
* This app has been developed by
* Chadrack Mbuyi Kalala 219013012
* On the 14th of May 2022
*/
package com.example.mobile_programing_assignment02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

class ThirdScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,

                )
            {

            }

        }
    }
}
@Composable
fun topBar() {
    TopAppBar(title = {
        Text(
            text = "My current modules 2022",
            style = MaterialTheme.typography.h5,
            textAlign = TextAlign.Center
        )
    })
}