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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ismailozkan.selly.R
import com.example.ismailozkan.selly.ui.BottomBar

class Profile : ComponentActivity() {
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
fun ProfileScreen(navController : NavHostController) {

    val gradient = Brush.verticalGradient(listOf(Color.White, colorResource(id = R.color.fblaci)))
    val gradient2 = Brush.verticalGradient(listOf(Color.White, Color.Gray))

    var showDialog by remember { mutableStateOf(false) }
    if (showDialog) {
        AlertDialog(onDismiss = { showDialog = false })
    }
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
        bottomBar = { BottomBar(navController = navController) }
    )
    { innerPadding ->
        Box(modifier = Modifier.background(gradient).padding(innerPadding)) {
            Column(
                modifier = Modifier.padding(start = 10.dp, top = 50.dp, end = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier
                        .border(
                            1.dp,
                            color = colorResource(id = R.color.fblaci),
                            shape = RectangleShape
                        )
                        .background(gradient2, shape = RectangleShape)
                ) {
                    Row(
                        modifier = Modifier
                            .padding(start = 6.dp, top = 10.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Absolute.SpaceBetween
                    )
                    {
                        Icon(
                            painter = painterResource(id = R.drawable.pp_icon),
                            contentDescription = "Profile Picture",
                            modifier = Modifier.size(60.dp)
                        )

                        IconButton(
                            onClick = { navController.navigate("Edit Profile") },
                        ) {
                            Icon(
                                imageVector = Icons.Default.Edit,
                                contentDescription = "Edit",
                                modifier = Modifier.size(40.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.padding(5.dp))
                    Row(modifier = Modifier.padding(start = 6.dp)) {
                        Text(
                            text = "Name Surname: ",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                        //In this place Users Name And Surname will be shown.
                    }
                    Spacer(modifier = Modifier.padding(5.dp))
                    Row(modifier = Modifier.padding(start = 6.dp)) {
                        Text(
                            text = "E-mail: ", fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                        //In this place Users e-Mail will be shown.
                    }
                    Spacer(modifier = Modifier.padding(5.dp))
                    Row(modifier = Modifier.padding(start = 6.dp, bottom = 10.dp)) {
                        Text(
                            text = "Phone Number: ",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                        //In this place Users Phone Number will be shown.
                    }
                }
                Spacer(modifier = Modifier.padding(10.dp))
                Column(
                    modifier = Modifier
                        .border(
                            1.dp,
                            color = colorResource(id = R.color.fblaci),
                            shape = RectangleShape
                        )
                        .background(gradient2, shape = RectangleShape)
                )
                {
                    Row(
                        modifier = Modifier
                            .padding(start = 6.dp, top = 10.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Absolute.SpaceBetween
                    ) {
                        Text(text = "Locations", fontWeight = FontWeight.Bold, fontSize = 30.sp)
                        IconButton(
                            onClick = { showDialog = true }
                        ) {
                            Icon(
                                imageVector = Icons.Default.AddCircle,
                                contentDescription = "Add location",
                                modifier = Modifier.size(40.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.padding(7.dp))
                    Row(modifier = Modifier.padding(start = 6.dp)) {
                        Text(
                            text = "Home Address: ",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                        //In this place Users Home Address will be shown.
                    }
                    Spacer(modifier = Modifier.padding(5.dp))
                    Row(modifier = Modifier.padding(start = 6.dp, bottom = 10.dp)) {
                        Text(text = "Workplace: ", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                        //In this place Users Workplace will be shown.
                    }
                }
                Spacer(modifier = Modifier.padding(20.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Button(
                        onClick = { navController.navigate("Sale History") },
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        shape = RectangleShape,
                        modifier = Modifier
                            .background(gradient2)
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "Sale History",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Start,
                            modifier = Modifier.fillMaxWidth(),
                            color = Color.Black
                        )
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = "",
                            modifier = Modifier.size(10.dp),

                            )
                    }
                    Spacer(modifier = Modifier.padding(10.dp))
                    Button(
                        onClick = { navController.navigate("Purchase History") },
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        shape = RectangleShape,
                        modifier = Modifier.background(gradient2)
                    ) {
                        Text(
                            text = "Purchase History",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Start,
                            modifier = Modifier.fillMaxWidth(),
                            color = Color.Black
                        )
                    }
                }
            }
        }
    }
}
@Composable
fun AlertDialog(
    onDismiss:() -> Unit
) {
    var string1 by rememberSaveable {
        mutableStateOf("")
    }
    var string2 by rememberSaveable {
        mutableStateOf("")
    }
    androidx.compose.material3.AlertDialog(


        onDismissRequest = onDismiss,
        confirmButton = { /*TODO*/ },
        modifier = Modifier.height(300.dp),
        title = {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(text = "Add Location" , fontSize = 20.sp)
                OutlinedTextField(
                    value = string1,
                    onValueChange = {string1 = it},
                    label = {
                        Text(text = "Home Address: ",color = colorResource(id = R.color.fblaci))
                    },modifier = Modifier
                        .fillMaxWidth(),
                    singleLine = true
                )
                Spacer(modifier = Modifier.padding(5.dp))
                OutlinedTextField(
                    value = string2,
                    onValueChange = {string2 = it},
                    label = {
                        Text(text = "Workplace: ",color = colorResource(id = R.color.fblaci))
                    },modifier = Modifier
                        .fillMaxWidth(),
                    singleLine = true
                )
                Spacer(modifier = Modifier.padding(5.dp))
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.fblaci)),
                    modifier = Modifier.size(150.dp)
                )
                {
                    Text(text = "Save" , fontWeight = FontWeight.Bold)
                }
            }
        }

    )
}


@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview(){
    ProfileScreen(navController = rememberNavController())
}