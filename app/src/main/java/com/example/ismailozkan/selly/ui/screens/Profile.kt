package com.example.ismailozkan.selly.ui.screens

import android.os.Bundle
import android.text.Layout
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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ismailozkan.selly.R

class Profile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                ProfileScreen()
            }
        }
    }
}
@Composable
fun ProfileScreen() {

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

    Box(modifier = Modifier.background(gradient))

    val starCount = 5
    val selectedStars = 3
    var showDialog by remember { mutableStateOf(false) }
    if (showDialog) {
        AlertDialog (onDismiss = {showDialog = false})
    }

            Row (
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.padding(top = 40.dp)
            ){
                Text(
                    text = "Profile",
                    fontWeight = FontWeight.Bold,
                    fontSize = 40.sp,
                    color = colorResource(id = R.color.fblaci)
                )
            }
        Column(
            modifier = Modifier.padding(start =10.dp , top = 150.dp)

        ) {
            Column (
                modifier = Modifier
                    .border(
                        1.dp,
                        color = colorResource(id = R.color.fblaci),
                        shape = AbsoluteRoundedCornerShape(10.dp)
                    )
                    .background(gradient2, shape = AbsoluteRoundedCornerShape(10.dp))
            ) {
                Row (modifier = Modifier.padding(start = 6.dp , top = 10.dp)) {
                    Icon(
                        painter = painterResource(id = R.drawable.pp_icon),
                        contentDescription = "Profile Picture",
                        modifier = Modifier.size(60.dp),
                        colorResource(id = R.color.fblaci)
                    )
                    repeat(starCount) { index ->
                        IconButton(
                            onClick = { /* Handle star click for index */ }
                        ) {
                            Icon(
                                imageVector = if (index < selectedStars) {
                                    Icons.Filled.Star
                                } else {
                                    Icons.Outlined.Star
                                },
                                contentDescription = "Star Rating ${index + 1}",
                                modifier = Modifier.fillMaxSize(),
                                colorResource(id = R.color.fblaci)
                            )
                        }
                    }
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.Top)
                            .padding(end = 16.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Edit,
                            contentDescription = "Edit",
                            modifier = Modifier.size(40.dp),
                            colorResource(id = R.color.fblaci)
                        )
                    }
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Row (modifier = Modifier.padding(start = 6.dp)){
                    Text(
                        text = "Name Surname: ",
                        fontWeight = FontWeight.Bold ,
                        fontSize = 20.sp,
                        color = colorResource(id = R.color.fblaci)
                        )
                    //In this place Users Name And Surname will be shown.
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Row (modifier = Modifier.padding(start = 6.dp)) {
                    Text(
                        text = "E-mail: ",fontWeight = FontWeight.Bold ,
                        fontSize = 20.sp,
                        color = colorResource(id = R.color.fblaci)
                    )
                    //In this place Users e-Mail will be shown.
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Row (modifier = Modifier.padding(start = 6.dp , bottom = 10.dp)) {
                    Text(
                        text = "Phone Number: ",
                        fontWeight = FontWeight.Bold ,
                        fontSize = 20.sp,
                        color = colorResource(id = R.color.fblaci)
                    )
                    //In this place Users Phone Number will be shown.
                }
            }
            Spacer(modifier = Modifier.padding(35.dp))
            Column (
                modifier = Modifier
                    .border(
                        1.dp,
                        color = colorResource(id = R.color.fblaci),
                        shape = AbsoluteRoundedCornerShape(10.dp)
                    )
                    .background(gradient2, shape = AbsoluteRoundedCornerShape(10.dp))
            )
            {
                Row (modifier = Modifier.padding(start = 6.dp , top = 10.dp)) {
                    Text(text = "Locations", fontWeight = FontWeight.Bold, fontSize = 30.sp,color = colorResource(id = R.color.fblaci) )
                    IconButton(
                        onClick = { showDialog = true },
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.Top)
                            .padding(start = 140.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.AddCircle,
                            contentDescription = "Add location",
                            modifier = Modifier.size(40.dp),
                            colorResource(id = R.color.fblaci)
                        )
                    }
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row (modifier = Modifier.padding(start = 6.dp)) {
                    Text(text = "Home Address: ", fontWeight = FontWeight.Bold , fontSize = 20.sp,color = colorResource(id = R.color.fblaci))
                    //In this place Users Home Address will be shown.
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Row (modifier = Modifier.padding(start = 6.dp , bottom = 10.dp )) {
                    Text(text = "Workplace: ", fontWeight = FontWeight.Bold , fontSize = 20.sp,color = colorResource(id = R.color.fblaci))
                    //In this place Users Workplace will be shown.
                }
            }
            Spacer(modifier = Modifier.padding(20.dp))
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
            ) {
                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.fblaci))
                    ) {
                    Text(text = "Sale History", fontWeight = FontWeight.Bold)
                }
                Spacer(modifier = Modifier.padding(10.dp))
                Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(colorResource(id = R.color.fblaci))
                ) {
                    Text(
                        text = "Purchase History",
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(modifier = Modifier.padding(top = 100.dp))
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
@Composable
fun AlertDialog(
    onDismiss:() -> Unit
) {
    var string1 by remember {
        mutableStateOf("")
    }
    var string2 by remember {
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