package com.example.ismailozkan.selly.ui.background

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val textStyle = TextStyle(fontStyle = FontStyle.Italic , fontWeight = FontWeight.ExtraLight)
val stringCount = 4

@Composable
fun sellyBackground () {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        repeat(15) { index ->
            Row(
                modifier = Modifier.padding(20.dp).fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween

            ) {
                repeat(stringCount) { index ->
                    Text(
                        text = "Selly",
                        style = textStyle
                    )
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun AdvertisementScreenPreview(){
    sellyBackground()
}