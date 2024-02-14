package com.example.melovibe.ui.screen.audio_screen.header

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.melovibe.ui.core.reusables.MyAppIconButton
import com.example.melovibe.ui.core.theme.AppTheme

@Composable
fun AudioViewTopBar(navController: NavHostController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .padding(10.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        MyAppIconButton(
            iconResId = Icons.AutoMirrored.Rounded.ArrowBack,
            enabled = true,
            onClick = { navController.navigate("/playlist") },
            tintColor = AppTheme.colorScheme.primary,
            contentDesc = "Navigate back to playlist",
        )
        Spacer(modifier = Modifier.weight(1f))
        AudioActionBar(navController = navController)
    }
}


