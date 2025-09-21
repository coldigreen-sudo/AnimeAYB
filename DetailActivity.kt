package com.tuusuario.animeayb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_AnimeAYB)
        setContentView(R.layout.activity_detail)
        // TODO: Cargar datos del anime, episodios, idiomas de subtítulos y botón de reproducción
    }
}