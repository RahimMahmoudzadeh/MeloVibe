package com.example.melovibe.ui.views.playlist_view.widgets.body

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.melovibe.R
import com.example.melovibe.ui.core.reusables.MyCommonText
import com.example.melovibe.ui.core.theme.AppTheme
import com.example.melovibe.ui.domain.data_class.PlaylistCategoryData

@Composable
fun YourPlayListDataItem(item: PlaylistCategoryData) {
    Row(
        Modifier.padding(horizontal = 10.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.havana),
            contentDescription = null,
            modifier = Modifier
                .width(70.dp)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(12.dp))
        )
        Spacer(modifier = Modifier.width(width = 15.dp))

        Column(
            verticalArrangement = Arrangement.Center
        ) {
            MyCommonText(
                text = item.title,
                fontSize = 13.sp,
                fontWeight = FontWeight.Medium,
                color = AppTheme.colorScheme.primary,
            )
            Spacer(modifier = Modifier.height(height = 4.dp))

            MyCommonText(
                text = item.subtitle,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                color = AppTheme.colorScheme.primary,
            )
        }

    }

}