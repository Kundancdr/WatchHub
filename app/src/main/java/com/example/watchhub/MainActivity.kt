package com.example.watchhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.watchhub.Presentation.screens.DetailScreen
import com.example.watchhub.Presentation.screens.HomeScreen
import com.example.watchhub.ui.theme.WatchHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navHostController = rememberNavController()
            WatchHubTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column (modifier = Modifier.padding(innerPadding)){
                        SetupNavigation(navHostController = navHostController)
                    }

                }
            }
        }
    }
}

@Composable
fun SetupNavigation(navHostController: NavHostController) {
   NavHost(navController = navHostController, startDestination = "home") {
        composable(route = "home") {
            HomeScreen(navHostController = navHostController)
        }

        composable(route = "detail") {
            DetailScreen(onClickBack = { navHostController.popBackStack() })
        }
    }
}