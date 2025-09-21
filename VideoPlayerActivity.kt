package com.tuusuario.animeayb

import android.os.Bundle
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubePlayerView

class VideoPlayerActivity : YouTubeBaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_AnimeAYB)
        setContentView(R.layout.activity_video_player)
        val playerView: YouTubePlayerView = findViewById(R.id.youtubePlayerView)
        // TODO: Inicializar el reproductor de YouTube con el ID de video correspondiente
    }
}