package com.sales.articleapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sales.articleapp.ui.navigation.Routes.HOME_SCREEN
import com.sales.articleapp.ui.screens.HomeScreen

@Composable
fun AppNavigationGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = HOME_SCREEN) {

        composable(HOME_SCREEN) {
            HomeScreen()
        }

    }


}