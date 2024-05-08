package com.abby.mvvm_midmorning.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.abby.mvvm_midmorning.ui.theme.screens.Login.Logins
import com.abby.mvvm_midmorning.ui.theme.screens.Registration.Register
import com.abby.mvvm_midmorning.ui.theme.screens.about.aboutscreen
import com.abby.mvvm_midmorning.ui.theme.screens.home.Homescreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination:String= ROUTE_HOME){
    NavHost(navController = navController, modifier = modifier,
        startDestination =startDestination ) {
        composable(ROUTE_HOME) {
            Homescreen(navController)
        }
        composable(ROUTE_ABOUT) {
            aboutscreen(navController)

        }
        composable(ROUTE_REGISTRATION){
            Register(navController)

    }
        composable(ROUTE_LOGIN){
            Logins(navController)
}
    }
}
