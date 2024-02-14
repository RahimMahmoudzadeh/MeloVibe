package com.example.melovibe.ui.screen.audio_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.FastForward
import androidx.compose.material.icons.rounded.FastRewind
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.melovibe.R
import com.example.melovibe.ui.core.reusables.MyAppIconButton
import com.example.melovibe.ui.core.reusables.MyAppImage
import com.example.melovibe.ui.core.reusables.MyCommonText
import com.example.melovibe.ui.core.theme.AppTheme
import com.example.melovibe.ui.screen.audio_screen.header.AudioViewTopBar

@Composable
fun MainAudioView(navController: NavHostController) {
    Column(
        modifier = Modifier
            .background(AppTheme.colorScheme.background)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AudioViewTopBar(navController = navController)
        Spacer(modifier = Modifier.height(55.dp))

        MyAppImage(
            imageResId = R.drawable.posty,
            contentDesc = "Audio cover",
            modifier = Modifier
                .width(250.dp)
                .aspectRatio(1f)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(20.dp))
        MyCommonText(
            text = "Post Malone",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = AppTheme.colorScheme.primary,
            letterSpacing = 2.5.sp
        )
        MyCommonText(
            text = "Better Now",
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
            color = AppTheme.colorScheme.tertiary,
            letterSpacing = 2.sp
        )
        Spacer(modifier = Modifier.fillMaxHeight(0.3f))
        AudioProgressBar()
        Spacer(modifier = Modifier.fillMaxHeight(0.3f))
        AudioButtons()
    }

}

@Composable
fun AudioButtons() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
//            AudioPlayingControl()
        MyAppIconButton(
            iconResId = Icons.Rounded.FastRewind,
            onClick = {
                //Todo: Previous Song
            },
            modifier = Modifier.size(45.dp),
            tintColor = AppTheme.colorScheme.primary
        )
        MyAppIconButton(
            iconResId = Icons.Rounded.PlayArrow,
            onClick = {
                //Todo: Play Song
            },
            modifier = Modifier.size(45.dp),

            tintColor = AppTheme.colorScheme.primary
        )
        MyAppIconButton(
            iconResId = Icons.Rounded.FastForward,

            onClick = {
                //Todo: Next Song
            },
            modifier = Modifier.size(45.dp),

            tintColor = AppTheme.colorScheme.primary

        )
    }
}

@Composable
fun AudioProgressBar() {

    LinearProgressIndicator(
        backgroundColor = AppTheme.colorScheme.tertiary,
        color = AppTheme.colorScheme.primary,
        progress = 1 / 5f,
        strokeCap = StrokeCap.Round,
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
            .height(10.dp)
    )
}