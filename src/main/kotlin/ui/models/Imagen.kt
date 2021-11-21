package ui.models

import kotlinx.coroutines.runBlocking
import java.awt.image.BufferedImage

class Imagen(
    var url: String = "",
    var nombre: String = "",
    var bufferedImg: BufferedImage,
    var ancho: Int = 0,
    var alto: Int = 0
) {

}