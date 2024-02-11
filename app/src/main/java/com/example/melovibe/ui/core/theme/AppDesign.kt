package com.example.melovibe.ui.core.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

data class AppColorScheme(
    val background: Color,
    val primary: Color,
    val secondary: Color,
    val tertiary: Color,
)

data class AppTypo(
    val titleLarge: TextStyle,
    val titleMedium: TextStyle,
    val titleSmall: TextStyle,
    val bodyLarge: TextStyle,
    val bodyMedium: TextStyle,
    val bodySmall: TextStyle,
    val caption: TextStyle,
    val subtitle: TextStyle,
)

val LocalAppColorScheme = staticCompositionLocalOf {
    AppColorScheme(
        background = Color.Unspecified,
        primary = Color.Unspecified,
        secondary = Color.Unspecified,
        tertiary = Color.Unspecified,
    )
}

val LocalAppTypoGraphy = staticCompositionLocalOf {
    AppTypo(
        titleLarge = TextStyle.Default,
        titleMedium = TextStyle.Default,
        titleSmall = TextStyle.Default,
        bodyLarge = TextStyle.Default,
        bodyMedium = TextStyle.Default,
        bodySmall = TextStyle.Default,
        caption = TextStyle.Default,
        subtitle = TextStyle.Default,
    )

}