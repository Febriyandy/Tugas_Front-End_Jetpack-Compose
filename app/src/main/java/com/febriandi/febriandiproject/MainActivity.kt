
package com.febriandi.febriandiproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.febriandi.agrojaya.component.MainScreen
import com.febriandi.febriandiproject.navigation.Screen
import com.febriandi.febriandiproject.screen.*
import com.febriandi.febriandiproject.ui.theme.FebriandiProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FebriandiProjectTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "mainScreen"
                ) {

                    composable("home") {
                        HomeScreen(navController)
                    }

                    composable("mainScreen") {
                        MainScreen()
                    }
                }

            }
        }
    }

}