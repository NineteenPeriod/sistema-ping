package ui.theme

import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle

object Theme {
    val colors: Colors = Colors()

    val code: Code = Code()

    class Colors(
        val backgroundDark: Color = Color(0xFF2B2B2B),
        val backgroundMedium: Color = Color(0xFF3C3F41),
        val backgroundLight: Color = Color(0xFF4E5254),

        val light: androidx.compose.material.Colors = lightColors(
            background = Color(0xFFfffbfc),
            surface = Color(0xFFfffbfc),
            primary = Color(0xFF7c00fb),
            secondary = Color(0xFF645b70)
        ),

        val dark: androidx.compose.material.Colors = darkColors(
            background = Color(0xFF1d1b1e),
            surface = Color(0xFF1d1b1e),
            primary = Color(0xFFd7baff),
            secondary = Color(0xFFcec2db)
        ),

        )

    class Code(
        val simple: SpanStyle = SpanStyle(Color(0xFFA9B7C6)),
        val value: SpanStyle = SpanStyle(Color(0xFF6897BB)),
        val keyword: SpanStyle = SpanStyle(Color(0xFFCC7832)),
        val punctuation: SpanStyle = SpanStyle(Color(0xFFA1C17E)),
        val annotation: SpanStyle = SpanStyle(Color(0xFFBBB529)),
        val comment: SpanStyle = SpanStyle(Color(0xFF808080))
    )
}