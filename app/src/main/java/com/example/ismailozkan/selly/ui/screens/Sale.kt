package com.example.ismailozkan.selly.ui.screens

import android.annotation.SuppressLint
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
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.ismailozkan.selly.R


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SaleScreen(){

    Scaffold(topBar = {
        TopAppBar(
            title = {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Spacer(modifier = Modifier.padding(20.dp) )
                    Text(text = "Sale Screen", color = Color.White)
                    IconButton(onClick = { /*TODO*/ }, modifier = Modifier.size(48.dp)) {
                        Image(painter = painterResource(id = R.drawable.selly), contentDescription = "")
                    }
                }

            }
        )



    }) {
        Box (modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(colorResource(id = R.color.fblaci), Color.White)
                )
            ), contentAlignment = Alignment.Center
        ){
            val notification= rememberSaveable { mutableStateOf("") }
            if (notification.value.isNotEmpty()){
                Toast.makeText(LocalContext.current, notification.value, Toast.LENGTH_LONG).show()
                notification.value=""
            }
            var price by rememberSaveable { mutableStateOf("") }
            var stuffname by rememberSaveable { mutableStateOf("") }
            var description by rememberSaveable { mutableStateOf("") }
            var location by rememberSaveable { mutableStateOf("") }

            Column(modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(8.dp)
                .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                StuffImage()
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp),
                    verticalAlignment = Alignment.CenterVertically){
                    Text(text = "Price", modifier = Modifier.width(100.dp), color = colorResource(id = R.color.fblaci))
                    OutlinedTextField(value = price, onValueChange = {price=it},
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = colorResource(id = R.color.fblaci),
                            unfocusedBorderColor = Color.White))
                }
                Spacer(modifier = Modifier.padding(16.dp))
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp)){
                    Text(text = "Surname",modifier = Modifier.width(100.dp), color = colorResource(id = R.color.fblaci))
                    OutlinedTextField(value = stuffname, onValueChange ={stuffname=it},
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = colorResource(id = R.color.fblaci),
                            unfocusedBorderColor = Color.White
                        ))
                }
                Spacer(modifier = Modifier.padding(16.dp))
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp)){
                    Text(text = "Description",modifier = Modifier.width(100.dp), color = colorResource(id = R.color.fblaci))
                    OutlinedTextField(value = description, onValueChange ={description=it},
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = colorResource(id = R.color.fblaci),
                            unfocusedBorderColor = Color.White))
                }
                Spacer(modifier = Modifier.padding(16.dp))
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp)){
                    Text(text = "Location",modifier = Modifier.width(100.dp), color = colorResource(id = R.color.fblaci))
                    OutlinedTextField(value = location, onValueChange ={location=it} )
                }
                Spacer(modifier = Modifier.padding(16.dp))
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                    Button(onClick = { notification.value = "Published" },
                        colors = ButtonDefaults.buttonColors(colorResource(id = R.color.fblaci)), modifier = Modifier,) {
                        Text(text = "Publish")
                    }
                }


            }
        }
    }
}





@Composable
fun StuffImage(){
    val imageUri = rememberSaveable { mutableStateOf("") }
    val painter = rememberImagePainter(
        if (imageUri.value.isEmpty()) {
            R.drawable.addphoto
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
        OutlinedButton(onClick = { launcher.launch("image/*") },
        ) {
            Text(text = "Add Stuff Picture", color = colorResource(id = R.color.fblaci))
        }
    }}
@Preview
@Composable
fun preview(){
    SaleScreen()
}