package com.example.ismailozkan.selly.ui.screens

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ismailozkan.selly.R
//import com.example.ismailozkan.selly.addNewUser
//import com.example.ismailozkan.selly.userList


@Composable
fun SignUp(navController: NavController){


    Box(modifier = Modifier
        .fillMaxSize()
        .background(
            brush = Brush.linearGradient(
                colors = listOf(
                    colorResource(id = R.color.fblaci),
                    Color.White
                )
            )
        )){
        var userName by remember {
            mutableStateOf("")
        }
        var userSurname by remember {
            mutableStateOf("")
        }

        var email by remember {
            mutableStateOf("")
        }
        var phoneNumber by remember {
            mutableStateOf("")
        }
        var password by remember{
            mutableStateOf("")
        }


        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(bitmap = ImageBitmap.imageResource(id = R.drawable.selly), contentDescription ="selly" )
            Spacer(modifier = Modifier.padding(16.dp))
            OutlinedTextField(value = userName, onValueChange = {
                userName =it
            },
                label = {
                    Text(text = "Name and Surname:  ", color = colorResource(id = R.color.fblaci))
                },modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                singleLine = true,
                leadingIcon = {
                    Icon(Icons.Outlined.Person, contentDescription =" ")
                })
            OutlinedTextField(value = userSurname, onValueChange = {
                userSurname =it
            },
                label = {
                    Text(text = "Name and Surname:  ", color = colorResource(id = R.color.fblaci))
                },modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                singleLine = true,
                leadingIcon = {
                    Icon(Icons.Outlined.Person, contentDescription =" ")
                })
            OutlinedTextField(value = email, onValueChange = {
                email =it
            },
                label = {
                    Text(text = "E-mail:  ", color = colorResource(id = R.color.fblaci))
                },modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                singleLine = true,
                leadingIcon = {
                    Icon(Icons.Outlined.MailOutline, contentDescription =" ")
                })
            OutlinedTextField(value = password, onValueChange = {
                password=it
            },
                label = {
                    Text(text = "Password:  ", color = colorResource(id = R.color.fblaci))
                },modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                singleLine = true,
                leadingIcon = {
                    Icon(Icons.Outlined.Lock, contentDescription =" ")
                })
            OutlinedTextField(value = phoneNumber, onValueChange = {
                phoneNumber =it
            },
                label = {
                    Text(text = "Phone Number:  ", color = colorResource(id = R.color.fblaci))
                },modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                singleLine = true,
                leadingIcon = {
                    Icon(Icons.Outlined.Phone, contentDescription =" ")
                })
            Button(
                onClick = {
                    if(!userName.isEmpty() && !userSurname.isEmpty() && !phoneNumber.isEmpty() && !email.isEmpty() && !password.isEmpty()){
                      //  addNewUser((userList.size+1).toString(),userName,userSurname, "",phoneNumber,email,password,emptyList(),emptyList(),emptyList())
                        navController.navigate("LogIn")
                    } },
                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.fblaci))
            ) {
                 Text(text = "Sign In")
            }

        }
    }
}

@Preview
@Composable
fun SignUpPreview(){
    SignUp(navController = rememberNavController())
}