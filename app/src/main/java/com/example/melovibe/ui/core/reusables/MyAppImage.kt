package com.example.melovibe.ui.core.reusables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun MyAppImage(
    modifier: Modifier = Modifier,
    @DrawableRes imageResId: Int,
    contentDesc: String = "",
) {
    Image(
        painter = painterResource(id = imageResId),
        contentDescription = contentDesc,
        modifier = modifier,
    )
}