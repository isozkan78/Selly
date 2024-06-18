package com.example.ismailozkan.selly.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ismailozkan.selly.ui.screens.EditProfileScreen
import com.example.ismailozkan.selly.ui.screens.FavoruitesScreen
import com.example.ismailozkan.selly.ui.screens.LogInScreen
import com.example.ismailozkan.selly.ui.screens.MessagesScreen


@Composable
fun MyNavHost(navController: NavHostController, starDest: String) {
    NavHost(navController = navController, startDestination = starDest) {
        composable(route = "Main Menu") {
            MainMenu(navController = navController)
        }
        composable(route = "Edit Profile") {
            EditProfileScreen(navController = navController)
        }
        composable(route = "Sale History") {
            SaleHistory(navController = navController)
        }
        composable(route = "Purchase History") {
            PurchaseHistory(navController = navController)
        }
        composable(route = "Messages") {
            MessagesScreen(navController = navController)
        }
        composable(route = "Favourite Ads") {
            FavoruitesScreen(navController = navController)
        }
        composable(route = "LogIn") {
            LogInScreen(navController = navController)
        }
    }
}