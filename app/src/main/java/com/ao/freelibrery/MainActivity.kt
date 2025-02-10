package com.ao.freelibrery

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import com.ao.freelibrery.ui.Login

import com.ao.freelibrery.ui.theme.FreeLibreryTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FreeLibreryTheme {
                var navController: NavController
                var startDestination = Login

                NavHost(navController = navController, startDestination = startDestination) {

                }
            }
        }
    }
}
