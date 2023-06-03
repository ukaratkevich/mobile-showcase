package dev.karatkevich.mobile.showcase.music.player.card

data class Track(
    val title: String,
    val author: String,
    val cover: String,
    val isExplicit: Boolean = false,
    val isPlaying: Boolean,
) {
    companion object {
        val TEST = Track(
            title = "GHOST!",
            author = "phonk.me, KIIXSHI",
            cover = "https://i.scdn.co/image/ab67616d0000b27363392de372fd2ee2822717ea",
            isExplicit = true,
            isPlaying = true,
        )
    }
}