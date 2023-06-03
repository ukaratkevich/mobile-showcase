package dev.karatkevich.mobile.showcase.music.player.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PlayerControls(
    isPlaying: Boolean,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Center,
    onPlayClicked: (Boolean) -> Unit = {},
    onNextClicked: () -> Unit = {},
    onPrevClicked: () -> Unit = {},
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = horizontalArrangement,
        modifier = Modifier.fillMaxWidth(),
    ) {
        val controlSize = 64.dp

        Image(
            painter = painterResource(R.drawable.skip_previous_24),
            contentDescription = null,
            modifier = Modifier
                .size(controlSize)
                .clickable { onPrevClicked() }
        )

        if (isPlaying) {
            Image(
                painter = painterResource(R.drawable.pause_circle_filled_24),
                contentDescription = null,
                modifier = Modifier
                    .size(controlSize)
                    .clickable { onPlayClicked(false) }
            )
        } else {
            Image(
                painter = painterResource(R.drawable.play_circle_filled_24),
                contentDescription = null,
                modifier = Modifier
                    .size(controlSize)
                    .clickable { onPlayClicked(true) }
            )
        }

        Image(
            painter = painterResource(R.drawable.skip_next_24),
            contentDescription = null,
            modifier = Modifier
                .size(controlSize)
                .clickable { onNextClicked() }
        )
    }
}

@Composable
@Preview
private fun PlayerControlsPreview() {
    PlayerControls(
        isPlaying = false,
    )
}
