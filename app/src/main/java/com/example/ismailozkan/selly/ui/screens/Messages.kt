package com.example.ismailozkan.selly.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.ismailozkan.selly.R

class Messages : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                MessagesScreen()
            }
        }
    }
}



@Composable
fun MessagesScreen() {
    val gradient = Brush.linearGradient(
        0.0f to colorResource(id = R.color.fblaci),
        500.0f to Color.White,
        start = Offset.Zero,
        end = Offset.Infinite
    )
    val gradient2 = Brush.linearGradient(
        0.0f to Color.White,
        500.0f to Color.Gray,
        start = Offset.Zero,
        end = Offset.Infinite
    )

    Box(modifier = Modifier.background(gradient)) {
        Column {
            Row (horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxSize()) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = "Main Menu",
                        modifier = Modifier.size(100.dp),
                        colorResource(id = R.color.fblaci)
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.chat_icon),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp),
                        colorResource(id = R.color.fblaci)
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.camera_icon),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp),
                        colorResource(id = R.color.fblaci)
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription = "Favoruites",
                        modifier = Modifier.size(100.dp),
                        colorResource(id = R.color.fblaci)
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile",
                        modifier = Modifier.size(100.dp),
                        colorResource(id = R.color.fblaci)
                    )
                }
            }
        }
    }



}