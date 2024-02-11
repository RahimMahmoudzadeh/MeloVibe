package com.example.melovibe.ui.views.playlist_view

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
import com.example.melovibe.ui.core.reusables.MyCommonText
import com.example.melovibe.ui.core.theme.AppTheme
import com.example.melovibe.ui.domain.data_class.PlaylistCategoryData
import com.example.melovibe.ui.views.playlist_view.widgets.body.YourPlaylistInit
import com.example.melovibe.ui.views.playlist_view.widgets.header.PlaylistBoxSlider

@Composable
fun MainPlaylistView(modifier: Modifier = Modifier) {
    val playlistTitle = "Your Playlist"
    val space = 20.dp
    Column {
        Column(
            modifier.fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(100.dp))
            PlaylistBoxSlider()
            Spacer(modifier = Modifier.height(50.dp))

            MyCommonText(
                text = playlistTitle,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(horizontal = 10.dp),
                color = AppTheme.colorScheme.primary
            )
            Spacer(
                modifier =
                Modifier
                    .height(height = space)
                    .padding(10.dp)
            )
            YourPlaylistInit(playlist = listOf(PlaylistCategoryData("NEW 2024", "55 Tracks")))
            Spacer(
                modifier =
                Modifier
                    .height(height = 8.dp)
            )
            YourPlaylistInit(playlist = listOf(PlaylistCategoryData("NOSTALGIA 1980", "55 Tracks")))

        }
        /*Todo: Playlist UI Footer*/
    }
}