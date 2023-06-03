package dev.karatkevich.mobile.showcase.music.player.card

import android.graphics.Bitmap
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.graphics.drawable.toBitmap
import androidx.palette.graphics.Palette
import coil.compose.AsyncImage
import coil.request.ImageRequest

@Composable
fun MusicPlayerCard(
    track: Track,
    progress: Progress,
    dominantColor: Color,
    modifier: Modifier = Modifier,
    onPaletteGenerated: (Palette) -> Unit = {},
) {
    Card(
        modifier = modifier.wrapContentSize(),
        colors = CardDefaults.cardColors(
            containerColor = Color(0x4Dfafafa)
        ),
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            val context = LocalContext.current

            AsyncImage(
                model = ImageRequest.Builder(context)
                    .allowHardware(false)
                    .data(track.cover)
                    .build(),
                contentDescription = null,
                modifier = Modifier.clip(RoundedCornerShape(6.dp))
                    .aspectRatio(1f),
                onSuccess = { state ->
                    val bitmap = state.result.drawable.toBitmap(config = Bitmap.Config.ARGB_8888)
                    val palette = Palette.from(bitmap).generate()

                    onPaletteGenerated(palette)
                }
            )

            Spacer(
                modifier = Modifier.fillMaxWidth()
                    .height(16.dp)
            )

            TrackInfo(track)

            TrackProgress(progress, color = dominantColor)

            PlayerControls(track.isPlaying)
        }
    }
}

@Composable
@Preview
private fun MusicPlayerCardPreview() {
    MusicPlayerCard(
        Track.TEST.copy(isPlaying = true),
        Progress.TEST,
        Color.Red,
    )
}
