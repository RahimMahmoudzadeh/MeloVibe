package com.example.melovibe.ui.core.reusables

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.melovibe.ui.core.theme.AppTheme

@Composable
fun MyAppIconButton(
    iconResId: ImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = false,
    contentDesc: String = "",
    tintColor: Color = Color.Unspecified,
) {
    IconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,

        ) {
        val color = if (tintColor != Color.Unspecified)
            tintColor else AppTheme.colorScheme.primary

        Icon(
            imageVector = iconResId,
            contentDescription = contentDesc,
            tint = color,
        )
    }
}
