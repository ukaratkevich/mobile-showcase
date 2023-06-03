package dev.karatkevich.mobile.showcase.hello.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(message: String) {
    Box(
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = message,
            modifier = Modifier.fillMaxWidth()
                .padding(8.dp),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleLarge,
        )
    }
}

@Composable
@Preview(
    showBackground = true,
    showSystemUi = true,
    device = "id:pixel_4a",
)
private fun MainScreenPreview() {
    MainScreen("Hello Compose!")
}

