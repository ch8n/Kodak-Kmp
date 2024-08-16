package dev.ch8n.kodak

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Kodak-KMP",
    ) {
        App()
    }
}