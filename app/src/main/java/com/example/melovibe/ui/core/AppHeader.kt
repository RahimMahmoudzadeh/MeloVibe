package com.example.melovibe.ui.core

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.melovibe.ui.core.reusables.MyCommonText
import com.example.melovibe.ui.core.theme.AppTheme

@Composable
fun AppHeader() {
    Box {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
        ) {
            MyCommonText(
                text = "MeloVibe",
                fontSize = 19.sp,
                fontWeight = FontWeight.Black,
                color = AppTheme.colorScheme.primary

            )
            IconButton(
                onClick = {},
                enabled = true,
                modifier = Modifier.size(30.dp)

            ) {
                Icon(
                    imageVector = Icons.Rounded.MoreVert,
                    contentDescription = "More",
                    tint = AppTheme.colorScheme.primary

                )
            }

        }
    }
}
