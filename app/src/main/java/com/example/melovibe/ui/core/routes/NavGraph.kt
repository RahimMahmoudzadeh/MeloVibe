package com.example.melovibe.ui.core.routes

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.melovibe.ui.screen.audio_screen.MainAudioView
import com.example.melovibe.ui.screen.playlist_screen.MainPlaylistView

@Composable
fun SetupNavGraph(modifier: Modifier = Modifier) {
    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = "/playlist") {

        composable(route = "/playlist") {
            MainPlaylistView(navController)
        }
        composable(route = "/audio") {
            MainAudioView(navController)
        }


    }
}