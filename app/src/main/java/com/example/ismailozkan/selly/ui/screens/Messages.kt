package com.example.ismailozkan.selly.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        0.0f to Color.Magenta,
        500.0f to colorResource(id = R.color.fblaci),
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
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {

            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .border(
                        1.dp,
                        color = colorResource(id = R.color.fblaci)
                    )
                    .background(gradient2)
                    .fillMaxWidth()


            ) {
                Text(text = "Chat" , fontSize = 40.sp , color = colorResource(id = R.color.fblaci))

                Spacer(modifier = Modifier.padding(start = 250.dp))

                IconButton(onClick = { /*TODO*/ },modifier = Modifier.size(60.dp)) {
                    Icon(
                        painter = painterResource(id = R.drawable.selly) ,
                        contentDescription = "Selly"
                    )
                }
            }
            Spacer(modifier = Modifier.padding(50.dp))
            Column (verticalArrangement = Arrangement.spacedBy(20.dp)){
                Row(
                    modifier = Modifier
                        .border(
                            1.dp,
                            color = colorResource(id = R.color.fblaci),
                            shape = AbsoluteRoundedCornerShape(10.dp)
                        )
                        .background(gradient2, shape = AbsoluteRoundedCornerShape(10.dp))
                        .width(300.dp)

                ) {
                    Column (modifier = Modifier.padding(15.dp)){
                        Text(
                            text = "UserName", color = colorResource(id = R.color.fblaci),
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.padding(5.dp))
                        Text(
                            text = "Time: Last Message", color = colorResource(id = R.color.fblaci),
                            fontSize = 20.sp
                        )
                    }
                }

                Row(
                    modifier = Modifier
                        .border(
                            1.dp,
                            color = colorResource(id = R.color.fblaci),
                            shape = AbsoluteRoundedCornerShape(10.dp)
                        )
                        .background(gradient2, shape = AbsoluteRoundedCornerShape(10.dp))
                        .width(300.dp)
                )
                {
                    Column (modifier = Modifier.padding(15.dp)) {
                        Text(
                            text = "UserName", color = colorResource(id = R.color.fblaci),
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.padding(5.dp))
                        Text(
                            text = "Time: Last Message", color = colorResource(id = R.color.fblaci),
                            fontSize = 20.sp
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .border(
                            1.dp,
                            color = colorResource(id = R.color.fblaci),
                            shape = AbsoluteRoundedCornerShape(10.dp)
                        )
                        .background(gradient2, shape = AbsoluteRoundedCornerShape(10.dp))
                        .width(300.dp)
                )
                {
                    Column (modifier = Modifier.padding(15.dp)){
                        Text(
                            text = "UserName", color = colorResource(id = R.color.fblaci),
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.padding(5.dp))
                        Text(
                            text = "Time: Last Message", color = colorResource(id = R.color.fblaci),
                            fontSize = 20.sp
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .border(
                            1.dp,
                            color = colorResource(id = R.color.fblaci),
                            shape = AbsoluteRoundedCornerShape(10.dp)
                        )
                        .background(gradient2, shape = AbsoluteRoundedCornerShape(10.dp))
                        .width(300.dp)
                )
                {
                    Column (modifier = Modifier.padding(15.dp)) {
                        Text(
                            text = "UserName", color = colorResource(id = R.color.fblaci),
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.padding(5.dp))
                        Text(
                            text = "Time: Last Message", color = colorResource(id = R.color.fblaci),
                            fontSize = 20.sp
                        )
                    }
                }

            }

            Spacer(modifier = Modifier.padding(100.dp))

            Row (
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 1.dp,
                        color = colorResource(id = R.color.fblaci)
                    )
                    .background(brush = gradient2)
            )
            {
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