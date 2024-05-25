package com.example.ismailozkan.selly.ui.screens

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ismailozkan.selly.R
import com.example.ismailozkan.selly.ui.theme.SellyTheme

class Profile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                profileScreen()
            }
        }
    }
}
@Composable
fun profileScreen() {

    val starCount = 5
    val selectedStars = 3
    var showDialog by remember { mutableStateOf(false) }
    if (showDialog) {
        AlertDialog (onDismiss = {showDialog = false})
    }
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(top = 50.dp),

        ) {
            Text(
                text = "Profile",
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp
            )
        }
        Column(
            modifier = Modifier.padding(start =10.dp , top = 200.dp)

        ) {
            Column (
                modifier = Modifier
                    .border(1.dp,Color.Black,shape = AbsoluteRoundedCornerShape(10.dp)
                    )
            ) {
                Row (modifier = Modifier.padding(start = 6.dp , top = 10.dp)) {
                    Icon(
                        painter = painterResource(id = R.drawable.pp_icon),
                        contentDescription = "Profile Picture",
                        modifier = Modifier.size(60.dp)
                    )
                    repeat(starCount) { index ->
                        IconButton(
                            onClick = { /* Handle star click for index */ }
                        ) {
                            Icon(
                                imageVector = if (index < selectedStars) {
                                    Icons.Filled.Star // Filled star for selected
                                } else {
                                    Icons.Outlined.Star // Outline star for unselected
                                },
                                contentDescription = "Star Rating ${index + 1}"
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
                            modifier = Modifier.size(30.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Row (modifier = Modifier.padding(start = 6.dp)){
                    Text(text = "Name Surname: ", fontWeight = FontWeight.Bold , fontSize = 20.sp)
                    //In this place Users Name And Surname will be shown.
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Row (modifier = Modifier.padding(start = 6.dp)) {
                    Text(text = "E-mail: ",fontWeight = FontWeight.Bold , fontSize = 20.sp)
                    //In this place Users e-Mail will be shown.
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Row (modifier = Modifier.padding(start = 6.dp , bottom = 10.dp)) {
                    Text(text = "Phone Number: ",fontWeight = FontWeight.Bold , fontSize = 20.sp)
                    //In this place Users Phone Number will be shown.
                }
            }
            Spacer(modifier = Modifier.padding(55.dp))
            Column (
                modifier = Modifier
                    .border(1.dp,Color.Black,shape = AbsoluteRoundedCornerShape(10.dp)
                    )
            )
            {
                Row (modifier = Modifier.padding(start = 6.dp , top = 10.dp)) {
                    Text(text = "Locations", fontWeight = FontWeight.Bold, fontSize = 30.sp )
                    IconButton(
                        onClick = { showDialog = true },
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.Top)
                            .padding(start = 120.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.AddCircle,
                            contentDescription = "Add location",
                            modifier = Modifier.size(30.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.padding(7.dp))
                Row (modifier = Modifier.padding(start = 6.dp)) {
                    Text(text = "Home Address: ", fontWeight = FontWeight.Bold , fontSize = 20.sp)
                    //In this place Users Home Address will be shown.
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Row (modifier = Modifier.padding(start = 6.dp , bottom = 10.dp )) {
                    Text(text = "Workplace: ", fontWeight = FontWeight.Bold , fontSize = 20.sp)
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
                    modifier = Modifier.border(1.dp , color = Color.Black)) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Home, contentDescription = "Main Menu")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.chat_icon),
                            contentDescription = ""
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.camera_icon),
                            contentDescription = ""
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favoruites"
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Person, contentDescription = "Profile")
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