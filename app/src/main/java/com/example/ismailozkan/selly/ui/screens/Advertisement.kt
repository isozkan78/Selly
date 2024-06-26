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
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ismailozkan.selly.R
import com.example.ismailozkan.selly.ui.BottomBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdvertisementScreen(navController: NavController) {

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
                        Text("My Ads", fontWeight = FontWeight.Bold, modifier = Modifier, fontSize = 30.sp)
                    }
                    Row ( horizontalArrangement = Arrangement.End,
                        modifier = Modifier.fillMaxWidth()){
                        IconButton(onClick = { navController.navigate("Main Menu") }) {
                            Image(
                                painter = painterResource(id = R.drawable.selly),
                                contentDescription = "Selly"
                            )
                        }
                    }
                }
            )
        },

        bottomBar = {
            BottomBar(navController = navController)
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .background(brush = gradient),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row (){
                Button(
                    onClick = { navController.navigate("MyAdvertisements") },
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
                    onClick = { navController.navigate("Favourite Ads") },
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
@Preview(showBackground = true)
@Composable
fun AdvertisementScreenPreview(){
    AdvertisementScreen(navController = rememberNavController())
}