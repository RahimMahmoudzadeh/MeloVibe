package com.example.melovibe.ui.screen.playlist_screen.widgets.footer

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.FastForward
import androidx.compose.material.icons.rounded.FastRewind
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.runtime.Composable
import com.example.melovibe.ui.core.reusables.MyAppIconButton
import com.example.melovibe.ui.core.theme.AppTheme

@Composable
fun AudioPlayingControl() {
    Row {
        MyAppIconButton(
            iconResId = Icons.Rounded.FastRewind,
            onClick = { /*TODO*/ },
            tintColor = AppTheme.colorScheme.primary,
        )
        val playButton = Icons.Rounded.PlayArrow
        MyAppIconButton(
            iconResId = playButton,
            onClick = {


            },
            tintColor = AppTheme.colorScheme.primary,
        )
        MyAppIconButton(
            iconResId = Icons.Rounded.FastForward,
            onClick = { /*TODO*/ },
            tintColor = AppTheme.colorScheme.primary,
        )
    }
}