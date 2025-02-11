package com.example.chatapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val BluePrimary = Color(0x854C4EAF)
val GreenSecondary = Color(0x804A80C3)
val LightBackground = Color(0xFFF5F5F5)
val DarkBackground = Color(0xFF121212)
val SurfaceColor = Color(0xFFFFFFFF)

private val DarkColorScheme = darkColorScheme(
    primary = BluePrimary,
    secondary = GreenSecondary,
    tertiary = Color(0xFF8E8E8E),
    background = DarkBackground,
    surface = DarkBackground,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White
)

private val LightColorScheme = lightColorScheme(
    primary = BluePrimary,
    secondary = GreenSecondary,
    tertiary = Color(0xFF616161),
    background = LightBackground,
    surface = SurfaceColor,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)

@Composable
fun ChatAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
