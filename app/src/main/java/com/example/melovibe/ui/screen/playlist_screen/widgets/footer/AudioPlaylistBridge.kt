package com.example.melovibe.ui.screen.playlist_screen.widgets.footer

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.melovibe.R
import com.example.melovibe.ui.core.reusables.MyAppImage
import com.example.melovibe.ui.core.reusables.MyCommonText
import com.example.melovibe.ui.core.theme.AppTheme
import com.example.melovibe.ui.core.theme.robotoSlab

@Composable
fun AudioPlaylistBridge(navController: NavHostController) {
    Box(
        modifier = Modifier
            .background(
                AppTheme.colorScheme.secondary, RoundedCornerShape(
                    topStart = 25.dp,
                    topEnd = 25.dp
                )
            )
            .fillMaxWidth()
            .size(100.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            MyAppImage(
                modifier = Modifier
                    .padding(18.dp)
                    .clip(RoundedCornerShape(13.dp))
                    .clickable { navController.navigate("/audio") },
                imageResId = R.drawable.posty,
                contentDesc = "played song cover"

            )
            Spacer(modifier = Modifier.width(4.dp))
            Column {
                MyCommonText(
                    text = "Post Malone",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = AppTheme.colorScheme.primary,
                    fontFamily = robotoSlab
                )
                MyCommonText(
                    text = "Better Now",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = AppTheme.colorScheme.primary,
                    fontFamily = robotoSlab
                )
            }
            Spacer(modifier = Modifier.width(25.dp))

            AudioPlayingControl()

        }
    }
}

