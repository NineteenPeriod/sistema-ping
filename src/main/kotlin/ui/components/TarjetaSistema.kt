package ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import ui.models.Sistema

class TarjetaSistema {
}

@Composable
fun tarjetaSistema(sistema: Sistema) {
    Card(elevation = 5.dp, shape = RoundedCornerShape(8.dp)) {
        Row {
            imagenSistema(sistema.image_url)
            Box(modifier = Modifier.padding(5.dp)) {

                Text("sistema")
            }
        }

    }
}