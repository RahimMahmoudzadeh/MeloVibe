package com.example.melovibe.ui.views.playlist_view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.melovibe.R
import com.example.melovibe.ui.core.reusables.MyCommonText
import com.example.melovibe.ui.core.theme.AppTheme
import com.example.melovibe.ui.domain.data_class.PlaylistCategoryData
import com.example.melovibe.ui.views.playlist_view.widgets.body.YourPlaylistInit
import com.example.melovibe.ui.views.playlist_view.widgets.footer.CurrentMusicStatusBox
import com.example.melovibe.ui.views.playlist_view.widgets.header.PlaylistBoxSlider

@Composable
fun MainPlaylistView(modifier: Modifier = Modifier) {
    val playlistTitle = "Your Playlist"
    val space = 20.dp
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
        ) {
            Spacer(modifier = Modifier.height(70.dp))
            PlaylistBoxSlider()
            Spacer(modifier = Modifier.height(40.dp))

            MyCommonText(
                text = playlistTitle,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(horizontal = 18.dp),
                color = AppTheme.colorScheme.primary
            )
            Spacer(
                modifier =
                Modifier
                    .height(height = space)
            )
            YourPlaylistInit(
                playlist = listOf(
                    PlaylistCategoryData(
                        "NEW 2024",
                        "55 Tracks",
                        image = R.drawable.posty
                    )
                )
            )
            Spacer(
                modifier =
                Modifier
                    .height(height = 8.dp)
            )
            YourPlaylistInit(
                playlist = listOf(
                    PlaylistCategoryData(
                        "NOSTALGIA 1980",
                        "55 Tracks",
                        image = R.drawable.newspeak
                    )
                )
            )

        }
        CurrentMusicStatusBox()
    }
}