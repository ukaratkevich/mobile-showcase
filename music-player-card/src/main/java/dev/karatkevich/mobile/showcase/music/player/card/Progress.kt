package dev.karatkevich.mobile.showcase.music.player.card

data class Progress(
    val value: Float,
    val current: String,
    val end: String,
) {
    companion object {
        val TEST = Progress(
            .33f,
            "0:59",
            "3:00",
        )
    }
}
