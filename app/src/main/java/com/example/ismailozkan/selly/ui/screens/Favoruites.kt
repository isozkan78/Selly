package com.example.ismailozkan.selly.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ismailozkan.selly.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavoruitesScreen(navController: NavHostController) {

    val gradient = Brush.linearGradient(listOf(colorResource(id = R.color.fblaci),Color.White))
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
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = {
                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        //Spacer(modifier = Modifier.weight(1f))
                        Text("Favourites", fontWeight = FontWeight.Bold, modifier = Modifier, fontSize = 30.sp)
                        //Spacer(modifier = Modifier.weight(1f))
                    }
                    Row ( horizontalArrangement = Arrangement.End,
                        modifier = Modifier.fillMaxWidth()){
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
                            modifier = Modifier.size(100.dp)
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.chat_icon),
                            contentDescription = "",
                            modifier = Modifier.size(100.dp)
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.camera_icon),
                            contentDescription = "",
                            modifier = Modifier.size(100.dp)

                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "",
                            modifier = Modifier.size(100.dp)
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Profile",
                            modifier = Modifier.size(100.dp)
                        )
                    }
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .background(brush = gradient),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
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
@Preview(showBackground = true)
@Composable
fun FavoruitesScreenPreview(){
    FavoruitesScreen(navController = rememberNavController())
}