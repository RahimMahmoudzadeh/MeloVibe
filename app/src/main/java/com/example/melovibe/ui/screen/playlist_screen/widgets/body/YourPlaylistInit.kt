package com.example.melovibe.ui.screen.playlist_screen.widgets.body

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.example.melovibe.ui.domain.data_class.PlaylistCategoryData

@Composable
fun YourPlaylistInit(playlist: List<PlaylistCategoryData>) {

    LazyColumn {
        items(playlist.size) {

            YourPlayListDataItem(item = playlist[it])

        }
    }
}
