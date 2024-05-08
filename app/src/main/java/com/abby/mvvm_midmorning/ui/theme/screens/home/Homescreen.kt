package com.abby.mvvm_midmorning.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.abby.mvvm_midmorning.navigation.ROUTE_ABOUT

@Composable
fun Homescreen(navController:NavHostController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta)
    ) {
        Text(
            text = "This is Home Page",
            color = Color.Red,
            fontFamily = FontFamily.Serif,
            fontSize = 32.sp
        )
        Button(
            onClick = {
                navController.navigate(ROUTE_ABOUT)
            },
            modifier = Modifier
        ) {
            Text(
                text = "About",
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Red
            )



        }

    }
}

@Preview
@Composable
private fun Homepage() {
    Homescreen(navController = rememberNavController())
}