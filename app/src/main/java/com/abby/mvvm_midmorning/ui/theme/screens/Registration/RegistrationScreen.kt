package com.abby.mvvm_midmorning.ui.theme.screens.Registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.abby.mvvm_midmorning.navigation.ROUTE_LOGIN
import com.abby.mvvm_midmorning.navigation.ROUTE_REGISTRATION


@Composable
fun Register(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember {
        mutableStateOf("")
    }
    var mail by remember {
        mutableStateOf("")
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)


    ) {
        Text(
            text = "Registration",
            fontFamily = FontFamily.SansSerif,
            fontSize = 28.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold

        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Create an account",
            fontFamily = FontFamily.SansSerif,
            fontSize = 28.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold

        )

        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "email"
                )
            },
            label = {
                Text(
                    text = "User Name / Mail", color = Color.Red,
                    fontFamily = FontFamily.Serif
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        OutlinedTextField(
            value = mail,
            onValueChange = { mail = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email") },
            label = {
                Text(
                    text = "user@gmail.com", color = Color.Red,
                    fontFamily = FontFamily.Serif
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "password"
                )
            },
            label = {
                Text(
                    text = "Enter password", color = Color.Red,
                    fontFamily = FontFamily.Serif
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "Remember Me",
            fontFamily = FontFamily.Default,
            fontSize = 20.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Forgot Password?",
            fontFamily = FontFamily.SansSerif,
            fontSize = 20.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))


        Button(
            onClick = { navController.navigate(ROUTE_LOGIN) },
            modifier = Modifier.height(60.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Login",
                fontSize = 25.sp
            )

        }

        Text(
            text = "Don't have an account?",
            fontFamily = FontFamily.SansSerif,
            fontSize = 20.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold

        )



        TextButton(
            onClick = { navController.navigate(ROUTE_REGISTRATION) },
            modifier = Modifier.height(60.dp)
        ) {
            Text(
                text = "Sign up",
                fontSize = 25.sp
            )

        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Or Continue with",
            fontFamily = FontFamily.SansSerif,
            fontSize = 20.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold

        )

        Spacer(modifier = Modifier.height(20.dp))


    }
}
@Preview
@Composable
private fun Registerprev() {
    Register( rememberNavController())
}