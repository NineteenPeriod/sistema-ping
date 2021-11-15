package ui.components

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import ui.theme.Theme

class Home {
}

@Composable
@Preview
fun sistemaPing() {
    var text by remember { mutableStateOf("Hello, World!") }
    val dark = Theme.colors.dark
    val light = Theme.colors.light
    val darkmode = false

    MaterialTheme(colors = if (darkmode) light else dark) {
        Button(onClick = {
            text = "Hello, Desktop!"
        }) {
            Text(text)
        }
    }
}