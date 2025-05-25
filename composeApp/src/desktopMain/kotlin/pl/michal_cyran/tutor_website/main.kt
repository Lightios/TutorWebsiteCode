package pl.michal_cyran.tutor_website

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "TutorWebsite",
    ) {
//        AnimationExample(
//            lines = pl.michal_cyran.tutor_website.animation.getLines()
//        )
        App()
    }
}