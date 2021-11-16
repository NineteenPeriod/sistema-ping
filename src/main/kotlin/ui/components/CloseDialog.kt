package ui.components
//
//import androidx.compose.foundation.layout.*
//import androidx.compose.material.Button
//import androidx.compose.material.ButtonDefaults
//import androidx.compose.material.Text
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.window.Dialog
//import androidx.compose.ui.window.DialogState
//import ui.theme.Theme
//
//class CloseDialog {
//}
//
//fun closeDialog() {
//    Dialog(onCloseRequest = {
//        isAskingToClose = false
//    }, title = "¿Deseas salir?", state = DialogState(width = 300.dp, height = 150.dp)) {
//        Column(
//            modifier = Modifier.fillMaxSize().padding(all = 15.dp),
//            verticalArrangement = Arrangement.SpaceBetween,
//        ) {
//            Row(horizontalArrangement = Arrangement.Start) {
//                Text("¿Realmente deseas salir del programa?");
//            }
//            Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()) {
//
//                Button(
//                    onClick = { isAskingToClose = false },
//                    colors = ButtonDefaults.buttonColors(
//                        Theme.colors.light.secondary,
//                        contentColor = Color.White
//                    )
//                ) {
//                    Text("cancelar")
//                }
//                Spacer(Modifier.size(15.dp))
//                Button(
//
//                    onClick = { isOpen = false },
//                    colors = ButtonDefaults.buttonColors(
//                        Theme.colors.light.primary,
//                        contentColor = Color.White
//                    )
//                ) {
//                    Text("salir")
//                }
//            }
//        }
//    }
//}