package com.example.ismailozkan.selly.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.ismailozkan.selly.R

@Composable
fun LogInScreen(navController: NavController){
    Box (modifier = Modifier
        .fillMaxSize()
        .background(
            brush = Brush.linearGradient(
                colors = listOf(Color.White, colorResource(id = R.color.fblaci))
            )
        )){
        var number by remember {
            mutableStateOf("")
        }
        var password by rememberSaveable {
            mutableStateOf("")
        }
        var passwordvisibility by remember {
            mutableStateOf(false)
        }
        val icon = if (passwordvisibility)
            painterResource(id = R.drawable.vizibility)
        else
            painterResource(id = R.drawable.offvizibility)


        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(bitmap = ImageBitmap.imageResource(id = R.drawable.selly), contentDescription = "Selly" )
            Spacer(modifier = Modifier.padding(16.dp))
            OutlinedTextField(value = number,
                onValueChange = { if (number.length<11) number = it},
                supportingText = {
                    Text(text = "${number.length} / 11",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.End, color = colorResource(id = R.color.fblaci)
                    )
                },
                label = {
                    Text(text = "Phone Number:", color = colorResource(id = R.color.fblaci))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                singleLine = true,
                leadingIcon = {
                    Icon(Icons.Filled.Phone, contentDescription = "Phone")
                }
            )
            Spacer(modifier = Modifier.padding(10.dp))
            OutlinedTextField(value = password,
                onValueChange = { if (password.length<8)password = it},
                supportingText = {
                    Text(text = "${password.length} / 8",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.End, color = colorResource(id = R.color.fblaci)
                    )
                },
                label = {
                    Text(text = "Password:", color = colorResource(id = R.color.fblaci))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                singleLine = true,
                leadingIcon = {
                    Icon(Icons.Filled.Lock, contentDescription = "Phone")
                },
                trailingIcon = {
                    IconButton(onClick = { passwordvisibility = !passwordvisibility}, modifier = Modifier.size(20.dp)) {
                        Icon(painter = icon, contentDescription = "visibility icon")

                    }
                },
                visualTransformation =if
                                              (passwordvisibility) VisualTransformation.None
                else
                    PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                )

            )
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly) {
                OutlinedButton(onClick = {
                    navController.navigate("signinpage")
                },
                ) {
                    Modifier.weight(50f)
                    Text(text = "Sign Up", color = colorResource(id = R.color.fblaci))

                }
                Button(onClick = { navController.navigate("Main Menu") },
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.fblaci))) {
                    Text(text = "Sign In")
                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
            TextButton(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.fblaci))) {
                Text(text = "Forgot your password ?")

            }

        }



    }
}