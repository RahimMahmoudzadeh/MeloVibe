package com.example.melovibe.ui.screen.audio_screen.header

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavHostController
import com.example.melovibe.ui.core.reusables.MyAppIconButton
import com.example.melovibe.ui.core.theme.AppTheme

@Composable
fun AudioActionBar(navController: NavHostController) {
    Row(
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically,
    ) {
//        MyAppIconButton(
//            iconResId = Icons.Outlined.Analytics,
//            enabled = true,
//            onClick = { navController.navigate("/playlist") },
//            tintColor = AppTheme.colorScheme.primary,
//            contentDesc = "Navigate back to playlist",
//        )
//        MyAppIconButton(
//            iconResId = Icons.AutoMirrored.Rounded.VolumeUp,
//            enabled = true,
//            onClick = { navController.navigate("/playlist") },
//            tintColor = AppTheme.colorScheme.primary,
//            contentDesc = "Navigate back to playlist",
//        )
        MyAppIconButton(
            iconResId = Icons.Rounded.MoreVert,
            enabled = true,
            onClick = { navController.navigate("/playlist") },
            tintColor = AppTheme.colorScheme.primary,
            contentDesc = "Navigate back to playlist",
        )
    }
}