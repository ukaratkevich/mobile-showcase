package dev.karatkevich.mobile.showcase.hello.compose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun MainScreen() {
    Text(
        text = "Hello Compose!",
        modifier = Modifier.fillMaxSize()
            .padding(8.dp)
            .wrapContentHeight(),
        textAlign = TextAlign.Center,
        color = Color.White
    )
}
