package ui.models

data class Sistema(
    val nombre: String,
    val descripcion: String,
    val ip_interna: String,
    val ip_externa: String,
    val ip_base_de_datos: String,
    val image_url: String
)