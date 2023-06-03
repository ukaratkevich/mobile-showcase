package dev.karatkevich.mobile.showcase.music.player.card

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.palette.graphics.Palette

@Composable
fun MainScreen() {
    var palette by remember { mutableStateOf<Palette?>(null) }

    val dominantColors = remember(palette) {
        palette
            ?.let {
                listOf(
                    0.1f to Color(it.vibrantSwatch?.rgb!!),
                    0.9f to Color(it.darkVibrantSwatch?.rgb!!),
                )
            }
            .orEmpty()
    }

    val brush = remember(dominantColors) {
        if (dominantColors.isNotEmpty()) {
            Brush.linearGradient(
                *dominantColors.toTypedArray(),
                start = Offset(0f, 0f),
                end = Offset(0f, Float.POSITIVE_INFINITY),
            )
        } else {
            Brush.linearGradient(
                0.1f to Color.White,
                0.9f to Color.Black,
                start = Offset(0f, 0f),
                end = Offset(0f, Float.POSITIVE_INFINITY),
            )
        }
    }

    Box(
        modifier = Modifier.fillMaxSize()
            .background(brush),
        contentAlignment = Alignment.Center,
    ) {
        MusicPlayerCard(
            track = Track.TEST,
            progress = Progress.TEST,
            modifier = Modifier.padding(16.dp),
            dominantColor = palette?.vibrantSwatch?.rgb?.let(::Color) ?: Color.Red,
            onPaletteGenerated = { updatedPalette ->
                palette = updatedPalette
            }
        )
    }
}

@Composable
@Preview(
    showBackground = true,
)
private fun MainScreenPreview() {
    MainScreen()
}
