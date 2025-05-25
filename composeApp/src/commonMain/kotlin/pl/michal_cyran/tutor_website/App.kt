package pl.michal_cyran.tutor_website

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview
import pl.michal_cyran.tutor_website.screens.HomeScreen
import pl.michal_cyran.tutor_website.ui.theme.AppThemeM3


@Composable
@Preview
fun App() {
    val systemInDarkTheme = isSystemInDarkTheme()
    var isDarkTheme by remember { mutableStateOf(systemInDarkTheme) }

    AppThemeM3(
        darkTheme = isDarkTheme,
    ) {
        HomeScreen(
            darkTheme = isDarkTheme,
            onToggleTheme = { isDarkTheme = !isDarkTheme }
        )
    }
}