// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*
import ui.components.sistemaPing
import ui.theme.Theme

fun main() = application {

    var isOpen by remember { mutableStateOf(true) }
    var isAskingToClose by remember { mutableStateOf(false) }

    if (isOpen) {
        Window(
            onCloseRequest = { isAskingToClose = true }, state = rememberWindowState(
                position = WindowPosition(
                    Alignment.Center
                )
            )
        ) {
            if (isAskingToClose) {
                Dialog(onCloseRequest = {
                    isAskingToClose = false
                }, title = "¿Deseas salir?", state = DialogState(width = 300.dp, height = 150.dp)) {
                    Column(
                        modifier = Modifier.fillMaxSize().padding(all = 15.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Row(horizontalArrangement = Arrangement.Start) {
                            Text("¿Realmente deseas salir del programa?");
                        }
                        Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()) {

                            Button(
                                onClick = { isAskingToClose = false },
                                colors = ButtonDefaults.buttonColors(
                                    Theme.colors.light.secondary,
                                    contentColor = Color.White
                                )
                            ) {
                                Text("cancelar")
                            }
                            Spacer(Modifier.size(15.dp))
                            Button(

                                onClick = { isOpen = false },
                                colors = ButtonDefaults.buttonColors(
                                    Theme.colors.light.primary,
                                    contentColor = Color.White
                                )
                            ) {
                                Text("salir")
                            }
                        }
                    }
                }
            }
            sistemaPing()
        }
    }
}
