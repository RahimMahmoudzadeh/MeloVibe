package com.example.melovibe.ui.core.theme


import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.example.melovibe.ui.core.theme.AppTheme.typography

private val darkColorScheme = AppColorScheme(
    background = DarkModeColors.background,
    primary = DarkModeColors.primary,
    secondary = DarkModeColors.secondary,
    tertiary = DarkModeColors.tertiary,
)

private val lightColorScheme = AppColorScheme(
    background = LightModeColors.background,
    primary = LightModeColors.primary,
    secondary = LightModeColors.secondary,
    tertiary = LightModeColors.tertiary,
)


@Composable
fun AppTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit
) {
    val colorScheme = if (isDarkTheme) darkColorScheme else lightColorScheme
    val rippleIndication = rememberRipple()

    CompositionLocalProvider(
        LocalAppColorScheme provides colorScheme,
        LocalAppTypoGraphy provides typography,
        LocalIndication provides rippleIndication,
        content = content,
    )

}


object AppTheme {
    val colorScheme: AppColorScheme
        @Composable get() = LocalAppColorScheme.current


    val typography: AppTypo
        @Composable get() = LocalAppTypoGraphy.current


}




