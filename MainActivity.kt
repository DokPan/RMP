package com.example.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation.ui.theme.NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController,"Home"){
                composable(Screens.HOME.route) {
                    Home()
                }
                composable("profile") {
                    Profile()
                }
                composable(Screens1.About.route) {
                    About()
                }
            }
        }
    }
}

@Composable
fun Home(){
    Text("Главная")
}

@Composable
fun Profile(){
    Text("Профиль")
}

@Composable
fun About(){
    Text("О программе")
}

enum class Screens(val route: String){
    HOME("home"),
    PROFILE("profile"),
    ABOUT("about")
}

sealed class Screens1(val route: String){
    object Home: Screens1("home")
    object Profile: Screens1("profile")
    object About: Screens1("about")
}