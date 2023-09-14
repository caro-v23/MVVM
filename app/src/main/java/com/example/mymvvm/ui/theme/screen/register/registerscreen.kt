package com.example.mymvvm.ui.theme.screen.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable


fun registerScreen(nabController: NavHostController) {
    var fullname by remember { mutableStateOf(TextFieldValue(text = "")) }
    var email by remember { mutableStateOf(TextFieldValue(text = "")) }
    var pass by remember { mutableStateOf(TextFieldValue(text = "")) }
    var context= LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        OutlinedTextField(value = fullname, onValueChange = { fullname },
            label = { Text(text = "Fullname") }

        )
        Button(onClick = {
        /*TODO*/ }) {
            Text(
                text = "REGISTER HERE",
                color = Color.Blue,
                fontFamily = FontFamily.Cursive,
                fontSize = 20.sp
            )

            Button(onClick = { /*TODO*/ }) {
                Text(
                    text = "Have Account? Register here",
                    color = Color.Blue,
                    fontFamily = FontFamily.Cursive,
                    fontSize = 20.sp)
            }
        }
    }
}