package dev.karatkevich.mobile.showcase.music.player.card

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TrackProgress(
    progress: Progress,
    color: Color = ProgressIndicatorDefaults.linearColor,
    onValueChanged: (Float) -> Unit = {},
) {
    Column {
        var currentProgress by remember { mutableStateOf(progress.value) }

        Slider(
            value = currentProgress,
            modifier = Modifier.fillMaxWidth()
                .padding(0.dp),
            colors = SliderDefaults.colors(
                activeTrackColor = color,
                thumbColor = color,
            ),
            onValueChange = { currentProgress = it },
            onValueChangeFinished = { onValueChanged(currentProgress) }
        )

        Row {
            Text(
                text = progress.current,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.labelSmall,
            )
            Text(
                text = progress.end,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.End,
                style = MaterialTheme.typography.labelSmall,
            )
        }
    }
}

@Composable
@Preview
private fun TrackProgressPreview() {
    TrackProgress(Progress.TEST)
}
