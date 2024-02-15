package com.example.melovibe.ui.domain.data_class

import com.example.melovibe.R

data class PlaylistBoxData(
    val image: Int,
    val title: String,
    val subtitle: String,
)

val boxImages = arrayListOf(
    PlaylistBoxData(
        image = R.drawable.swift, title = "Recently Added", subtitle = "250 Tracks",
    ),
    PlaylistBoxData(
        image = R.drawable.newspeak, title = "Most Played", subtitle = "150 Tracks",
    ),
    PlaylistBoxData(
        image = R.drawable.havana, title = "Recently Played", subtitle = "150 Tracks",
    ),
    PlaylistBoxData(
        image = R.drawable.posty, title = "Favorite Tracks", subtitle = "80 Tracks",
    ),
)