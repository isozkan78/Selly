package com.example.ismailozkan.selly.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
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
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ismailozkan.selly.R
import com.example.ismailozkan.selly.ui.BottomBar

class Messages : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
            }
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MessagesScreen(navController: NavController) {
    val gradient = Brush.linearGradient(listOf(colorResource(id = R.color.fblaci),Color.White))
    val gradient2 = Brush.linearGradient(
        0.0f to Color.White,
        500.0f to Color.Gray,
        start = Offset.Zero,
        end = Offset.Infinite
    )

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = {
                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        Text("Messages", fontWeight = FontWeight.Bold, modifier = Modifier, fontSize = 30.sp)
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
        bottomBar = { BottomBar(navController = navController)}

    )
    { innerPadding ->
        Box(modifier = Modifier
            .background(gradient)
            .padding(innerPadding)
            .fillMaxSize()) {

                Column(
                    verticalArrangement = Arrangement.spacedBy(20.dp),
                    modifier = Modifier.padding(top = 70.dp)
                ) {

                    ElevatedCard(
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 20.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {

                        Column(modifier = Modifier.padding(15.dp)) {
                            Text(
                                text = "UserName", color = colorResource(id = R.color.fblaci),
                                fontSize = 20.sp
                            )
                            Spacer(modifier = Modifier.padding(5.dp))
                            Text(
                                text = "Time: Last Message",
                                color = colorResource(id = R.color.fblaci),
                                fontSize = 20.sp
                            )
                        }
                    }
                    ElevatedCard(
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 20.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {

                        Column(modifier = Modifier.padding(15.dp)) {
                            Text(
                                text = "UserName", color = colorResource(id = R.color.fblaci),
                                fontSize = 20.sp
                            )
                            Spacer(modifier = Modifier.padding(5.dp))
                            Text(
                                text = "Time: Last Message",
                                color = colorResource(id = R.color.fblaci),
                                fontSize = 20.sp
                            )
                        }
                    }
                    ElevatedCard(
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 20.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {

                        Column(modifier = Modifier.padding(15.dp)) {
                            Text(
                                text = "UserName", color = colorResource(id = R.color.fblaci),
                                fontSize = 20.sp
                            )
                            Spacer(modifier = Modifier.padding(5.dp))
                            Text(
                                text = "Time: Last Message",
                                color = colorResource(id = R.color.fblaci),
                                fontSize = 20.sp
                            )
                        }
                    }
                    ElevatedCard(
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 20.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {

                        Column(modifier = Modifier.padding(15.dp)) {
                            Text(
                                text = "UserName", color = colorResource(id = R.color.fblaci),
                                fontSize = 20.sp
                            )
                            Spacer(modifier = Modifier.padding(5.dp))
                            Text(
                                text = "Time: Last Message",
                                color = colorResource(id = R.color.fblaci),
                                fontSize = 20.sp
                            )
                        }
                    }
                    ElevatedCard(
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 20.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {

                        Column(modifier = Modifier.padding(15.dp)) {
                            Text(
                                text = "UserName", color = colorResource(id = R.color.fblaci),
                                fontSize = 20.sp
                            )
                            Spacer(modifier = Modifier.padding(5.dp))
                            Text(
                                text = "Time: Last Message",
                                color = colorResource(id = R.color.fblaci),
                                fontSize = 20.sp
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.padding(100.dp))
        }
    }
}
@Preview(showBackground = true)
@Composable
fun MessagesScreenPreview() {
    MessagesScreen(navController = rememberNavController())
}