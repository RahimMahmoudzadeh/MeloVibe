package com.example.melovibe.ui.views.playlist_view.widgets.header

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.melovibe.ui.core.reusables.MyCommonText
import com.example.melovibe.ui.core.theme.AppTheme
import com.example.melovibe.ui.domain.data_class.boxImages

@Composable
fun PlaylistBoxSlider() {
    LazyRow(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        items(boxImages.size) {
            Box(
                modifier = Modifier.padding(horizontal = 7.dp)
            ) {
                Column {
                    Image(
                        painter = painterResource(id = boxImages[it].image),
                        contentDescription = null,
                        modifier = Modifier
                            .width(180.dp)
                            .aspectRatio(300f / 300f)
                            .clip(RoundedCornerShape(20.dp))
                    )
                    MyCommonText(
                        text = boxImages[it].title,
                        color = AppTheme.colorScheme.primary,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .padding(vertical = 6.dp, horizontal = 6.dp)
                    )
                    MyCommonText(
                        text = boxImages[it].subtitle,
                        color = AppTheme.colorScheme.tertiary,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .padding(horizontal = 6.dp)
                    )
                }
            }
        }
    }
}
