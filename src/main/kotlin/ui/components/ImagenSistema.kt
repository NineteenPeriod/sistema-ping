package ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.toComposeImageBitmap
import androidx.compose.ui.unit.dp
import ui.models.Imagen
import java.awt.image.BufferedImage
import java.io.ByteArrayOutputStream
import java.io.InputStream
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import java.net.HttpURLConnection
import java.net.URL
import javax.imageio.ImageIO

class ImagenSistema {
}

private val isAppReady = mutableStateOf(false)
private var imagen: Imagen = Imagen(bufferedImg = BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB))

@Composable
fun imagenSistema(imagenUrl: String) {
    initialize(imagenUrl)

    if (isAppReady.value) {
        Image(
            org.jetbrains.skia.Image.makeFromEncoded(
                toByteArray(imagen.bufferedImg)
            ).toComposeImageBitmap(),
            contentDescription = null,
            modifier = Modifier.height(100.dp)
                .width(120.dp),
            contentScale = ContentScale.Crop
        )
    } else {
        Text("cargando")
    }
}

fun initialize(imagenUrl: String) {
    println(imagenUrl)
    println("obteniendo...")

    try {
        val url = URL(imagenUrl)
        val connection: HttpURLConnection = url.openConnection() as HttpURLConnection
        connection.connectTimeout = 5000
        connection.connect()

        val input: InputStream = connection.inputStream
        val bitmap: BufferedImage? = ImageIO.read(input)

        if (bitmap != null) {
            val img = Imagen(
                imagenUrl,
                getNameURL(imagenUrl),
                bitmap,
                bitmap.width,
                bitmap.height
            )
            imagen = img
        }
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        isAppReady.value = true
        println("finalizado")

    }

}

fun toByteArray(bitmap: BufferedImage): ByteArray {
    val baos = ByteArrayOutputStream()
    ImageIO.write(bitmap, "png", baos)
    return baos.toByteArray()
}

private fun getNameURL(url: String): String {
    return url.substring(url.lastIndexOf('/') + 1, url.length)
}