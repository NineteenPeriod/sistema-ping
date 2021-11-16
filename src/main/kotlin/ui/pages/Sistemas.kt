package ui.pages

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.flowlayout.FlowMainAxisAlignment
import com.google.accompanist.flowlayout.FlowRow
import ui.models.Sistema

class Sistemas {
}

@Composable
fun sistemas() {
    val sistemasCargados: List<Sistema> =
        listOf(
            Sistema("Sistema 1", "Descripcion sistema 1", "142.251.34.142", "172.26.16.1", "192.168.0.1"),
            Sistema("Sistema 2", "Descripcion sistema 2", "142.251.34.142", "172.26.16.1", "192.168.0.1"),
            Sistema("Sistema 3", "Descripcion sistema 3", "142.251.34.142", "172.26.16.1", "192.168.0.1"),
            Sistema("Sistema 4", "Descripcion sistema 4", "142.251.34.142", "172.26.16.1", "192.168.0.1"),
            Sistema("Sistema 5", "Descripcion sistema 5", "142.251.34.142", "172.26.16.1", "192.168.0.1"),
            Sistema("Sistema 6", "Descripcion sistema 6", "142.251.34.142", "172.26.16.1", "192.168.0.1"),
        );
    Column(
        modifier = Modifier.fillMaxSize().padding(all = 15.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            mainAxisSpacing = 15.dp,
            mainAxisAlignment = FlowMainAxisAlignment.SpaceBetween
        ) {
            for (sistema in sistemasCargados) {
                Button(onClick = {}) {
                    Text(sistema.nombre)
                }
            }
        }
    }
}