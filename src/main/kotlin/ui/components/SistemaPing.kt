package ui.components

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ui.pages.sistemas
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
        sistemas()
    }
}