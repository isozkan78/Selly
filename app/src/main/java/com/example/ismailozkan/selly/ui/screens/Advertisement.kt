package com.example.ismailozkan.selly.ui.screens

import android.content.res.Resources.Theme
import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.example.ismailozkan.selly.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdvertisementScreen() {

    val gradient = Brush.linearGradient(
        0.0f to Color.White,
        500.0f to colorResource(id = R.color.fblaci),
        start = Offset.Zero,
        end = Offset.Infinite
    )
    val gradientBlue = Brush.linearGradient(
        0.0f to Color.White,
        500.0f to Color.Blue,
        start = Offset.Zero,
        end = Offset.Infinite
    )
    val gradientYellow = Brush.linearGradient(
        0.0f to Color.Yellow,
        500.0f to Color.White,
        start = Offset.Zero,
        end = Offset.Infinite
    )
    Scaffold(

        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Absolute.SpaceBetween) {
                        Text("Advertisements", fontWeight = FontWeight.Bold)
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                painter = painterResource(id = R.drawable.selly),
                                contentDescription = "Selly"
                            )
                        }
                    }
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary
            ) {
                Row (horizontalArrangement = Arrangement.SpaceEvenly , modifier = Modifier.fillMaxWidth()) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = "Main Menu",
                            modifier = Modifier.size(100.dp),
                            tint = Color.White
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.chat_icon),
                            contentDescription = "",
                            modifier = Modifier.size(100.dp),
                            tint = Color.White
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.camera_icon),
                            contentDescription = "",
                            modifier = Modifier.size(100.dp),
                            tint = Color.White

                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "",
                            modifier = Modifier.size(100.dp),
                            tint = Color.White
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Profile",
                            modifier = Modifier.size(100.dp),
                            tint = Color.White
                        )
                    }
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row (modifier = Modifier.fillMaxWidth()){
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .background(brush = gradientBlue, shape = RectangleShape)
                        .width(210.dp)
                    ,
                    colors = ButtonDefaults.buttonColors(Color.Transparent)
                ) {
                    Text(text = "My Advertisements",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .background(brush = gradientYellow, shape = RectangleShape)
                        .width(210.dp)
                    ,
                    colors = ButtonDefaults.buttonColors(Color.Transparent)
                    ) {
                    Text(text = "Fav Advertisements",
                        fontWeight = FontWeight.Bold,
                            color = Color.Black
                    )
                }
            }
            Column (horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxHeight()
                    .padding(30.dp)
            )
            {
                ElevatedCard(
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 20.dp
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
                {
                    Row (horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()){
                        Image(
                            painter = painterResource(id = R.drawable.terlikimage),
                            contentDescription = "terlik",
                            modifier = Modifier.height(100.dp)
                        )
                        Text(text = "Location", modifier = Modifier.padding(5.dp))
                        Text(text = "Product Name", modifier = Modifier.padding(5.dp))
                    }
                    Text(
                        text = "Price",
                        modifier = Modifier
                            .padding(16.dp),
                        textAlign = TextAlign.Center,
                    )
                }
                ElevatedCard(
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 20.dp
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
                {
                    Row (horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()) {
                        Image(
                            painter = painterResource(id = R.drawable.terlikimage),
                            contentDescription = "terlik",
                            modifier = Modifier.height(100.dp)
                        )
                        Text(text = "Location", modifier = Modifier.padding(5.dp))
                        Text(text = "Product Name", modifier = Modifier.padding(5.dp))
                    }
                    Text(
                        text = "Price",
                        modifier = Modifier
                            .padding(16.dp),
                        textAlign = TextAlign.Center,
                    )
                }

                ElevatedCard(
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 20.dp
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
                {
                    Row (horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()) {
                        Image(
                            painter = painterResource(id = R.drawable.terlikimage),
                            contentDescription = "terlik",
                            modifier = Modifier.height(100.dp)
                        )
                        Text(text = "Location", modifier = Modifier.padding(5.dp))
                        Text(text = "Product Name" , modifier = Modifier.padding(5.dp))
                    }
                    Text(
                        text = "Price",
                        modifier = Modifier
                            .padding(16.dp),
                        textAlign = TextAlign.Center,
                    )
                }
            }
        }
    }
}