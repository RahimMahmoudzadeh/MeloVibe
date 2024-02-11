package com.example.melovibe.ui.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.melovibe.ui.core.AppHeader
import com.example.melovibe.ui.core.theme.AppTheme
import com.example.melovibe.ui.views.playlist_view.MainPlaylistView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Surface(
                    Modifier.fillMaxSize(),
                    color = AppTheme.colorScheme.background,
                ) {
                    AppHeader()
                    MainPlaylistView()
                }
            }
        }
    }

}