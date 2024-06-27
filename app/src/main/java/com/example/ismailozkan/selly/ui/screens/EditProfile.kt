package com.example.ismailozkan.selly.ui.screens

import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import com.example.ismailozkan.selly.R
import com.example.ismailozkan.selly.ui.BottomBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditProfileScreen(navController: NavHostController){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(
            brush = Brush.linearGradient(
                colors = listOf(colorResource(id = R.color.fblaci), Color.White)
            )
        )){

        val notification= rememberSaveable { mutableStateOf("")}
        if (notification.value.isNotEmpty()){
            Toast.makeText(LocalContext.current, notification.value, Toast.LENGTH_LONG).show()
            notification.value=""
        }
        var name by rememberSaveable { mutableStateOf("") }
        var surname by rememberSaveable { mutableStateOf("") }
        var description by rememberSaveable { mutableStateOf("") }
        var phonenumber by rememberSaveable { mutableStateOf("") }

        Scaffold(topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Spacer(modifier = Modifier.padding(20.dp))
                        Text(text = "Edit Profile", fontWeight = FontWeight.Bold, fontSize = 30.sp)
                        IconButton(onClick = { navController.navigate("Main Menu") }, modifier = Modifier.size(48.dp)) {
                            Image(
                                painter = painterResource(id = R.drawable.selly),
                                contentDescription = ""
                            )
                        }
                    }

                }
            )
        },
            bottomBar = { BottomBar(navController = navController)}
        ) {innerPadding ->
            Box(modifier = Modifier
                .fillMaxSize()
                .background(brush = Brush.linearGradient(colors = listOf(colorResource(id = R.color.fblaci), Color.White))))
        Column(modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(innerPadding)) {
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween){
                Button(onClick = { notification.value = "Cancelled"
                                 navController.navigate("Profile")},
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.fblaci))
                ) {
                    Text(text = "Cancel")


                }
                Button(onClick = { notification.value="Profile Updated"
                    navController.navigate("Profile")},
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.fblaci))) {
                    Text(text = "Save")

                }
            }
            ProfileImage()
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(start = 4.dp, end = 4.dp),
                verticalAlignment = Alignment.CenterVertically){
                Text(text = "Name", modifier = Modifier.width(100.dp), color = colorResource(id = R.color.fblaci))
                OutlinedTextField(value = name, onValueChange = {name=it})
            }
            Spacer(modifier = Modifier.padding(4.dp))
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(start = 4.dp, end = 4.dp)){
                Text(text = "Surname",modifier = Modifier.width(100.dp), color = colorResource(id = R.color.fblaci))
                OutlinedTextField(value = surname, onValueChange ={surname=it} )
            }
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
                verticalAlignment = Alignment.Top,
            ){
                Text(text = "Description: ", modifier = Modifier
                    .width(100.dp)
                    .padding(top = 8.dp), color = colorResource(id = R.color.fblaci))
                OutlinedTextField(value = description, onValueChange ={description=it},
                    singleLine = false,
                    modifier = Modifier.height(150.dp))
            }
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)){
                Text(text = "Phone Number", modifier = Modifier.width(100.dp), color = colorResource(id = R.color.fblaci))
                OutlinedTextField(value = phonenumber, onValueChange = {phonenumber=it},
                    label = {
                        Text(text = "Must be 11 digit",
                            color = colorResource(id = R.color.fblaci),
                            fontSize = 10.sp)
                    })
            }
        }
        }
    }
}

@Composable
fun ProfileImage(){
    val imageUri = rememberSaveable { mutableStateOf("") }
    val painter = rememberImagePainter(
        if (imageUri.value.isEmpty()) {
            R.drawable.terlikimage
        }
        else
            imageUri.value
    )

    val launcher = rememberLauncherForActivityResult(contract = ActivityResultContracts.GetContent()) {
            uri: Uri? ->
        uri?.let { imageUri.value= it.toString() }
    }
    Column (modifier = Modifier
        .padding(8.dp)
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Card(shape = CircleShape,
            modifier = Modifier
                .padding(8.dp)
                .size(100.dp)) {
            Image(painter = painter,
                contentDescription = null,
                modifier = Modifier
                    .wrapContentSize()
                    .clickable { launcher.launch("image/*") },
                contentScale = ContentScale.Crop )
        }
        OutlinedButton(onClick = { /*TODO*/ },
        ) {
            Text(text = "Change Profile Picture", color = colorResource(id = R.color.fblaci))
        }
    }
}
@Preview(showBackground = true)
@Composable
fun EditProfileScreenPreview() {
    EditProfileScreen(navController = rememberNavController())
}