package dev.karatkevich.mobile.showcase.music.player.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TrackInfo(
    track: Track,
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = track.title,
                style = MaterialTheme.typography.labelLarge,
                maxLines = 1
            )

            if (track.isExplicit) {
                Image(
                    painter = painterResource(R.drawable.explicit_24),
                    contentDescription = null,
                    modifier = Modifier.size(14.dp),
                )
            }
        }

        Text(
            text = track.author,
            style = MaterialTheme.typography.bodyMedium,
            maxLines = 1,
        )
    }
}

@Composable
@Preview
private fun TrackInfoPreview() {
    TrackInfo(
        Track.TEST,
    )
}
