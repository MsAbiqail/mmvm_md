package com.abby.mvvm_midmorning.ui.theme.screens.SignIn

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.abby.mvvm_midmorning.navigation.ROUTE_REGISTRATION
import com.abby.mvvm_midmorning.navigation.ROUTE_SIGNIN

@Composable
fun SignInn(navController: NavHostController) {
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
                .fillMaxSize()
            .padding(15.dp)
            .background(Color.DarkGray)
    ){
        Text(text = "WELCOME TO OUR APP",
            fontSize = 30.sp,
            fontFamily = FontFamily.Default,
            color = Color.White
        )
        Text(text = "Fresh food for everyone",
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "Let us help you disappoint the hunger.",
            fontSize = 18.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Yellow
        )
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick =  {
            navController.navigate(ROUTE_SIGNIN)},
            modifier = Modifier.width(300.dp),
            ) {
            Text(text = "Sign In",
            fontSize = 15.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Blue
        )}
            Spacer(modifier = Modifier.height(40.dp))
           
            Button(onClick ={ navController.navigate(ROUTE_REGISTRATION)},
                modifier = Modifier.width(300.dp),) {
                Text(text = "Create an account",
                    fontSize = 12.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.Blue
                )
    }
    }
}
@Preview
@Composable
private fun SignT() {
    SignInn(navController = rememberNavController())
}