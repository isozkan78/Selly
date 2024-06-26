
package com.example.ismailozkan.selly.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ismailozkan.selly.ui.screens.AdvertisementScreen
import com.example.ismailozkan.selly.ui.screens.AnimatedSplashScreen
import com.example.ismailozkan.selly.ui.screens.BuyScreen
import com.example.ismailozkan.selly.ui.screens.EditProfileScreen
import com.example.ismailozkan.selly.ui.screens.FavoruitesScreen
import com.example.ismailozkan.selly.ui.screens.LogInScreen
import com.example.ismailozkan.selly.ui.screens.MessagesScreen
import com.example.ismailozkan.selly.ui.screens.ProfileScreen
import com.example.ismailozkan.selly.ui.screens.PurchaseHistoryScreen
import com.example.ismailozkan.selly.ui.screens.SaleHistoryScreen
import com.example.ismailozkan.selly.ui.screens.SaleScreen
import com.example.ismailozkan.selly.ui.screens.Splash


@Composable
fun MyNavHost(navController: NavHostController, starDest: String) {
    NavHost(navController = navController, startDestination = starDest) {
        composable(route = "Main Menu") {
           MainScreen(navController = navController)
        }
        composable(route = "Edit Profile") {
            EditProfileScreen(navController = navController)
        }
        composable(route = "Sale History") {
            SaleHistoryScreen(navController = navController)
        }
        composable(route = "Purchase History") {
            PurchaseHistoryScreen(navController = navController)
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
        composable(route = "Profile") {
            ProfileScreen(navController = navController)
        }
        composable(route = "My Advertisements") {
            AdvertisementScreen(navController = navController)
        }
        composable(route = "SplashScreen") {
            AnimatedSplashScreen(navController = navController)
        }
        composable(route = "Sale") {
            SaleScreen(navController = navController)
        }
       // composable(route = "Buy $itemName") {
         //   BuyScreen(navController = navController)
        //}
    }
}