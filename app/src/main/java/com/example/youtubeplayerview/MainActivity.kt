package com.example.youtubeplayerview

import android.media.MediaDrm
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : YouTubeBaseActivity() {
    val apikey = "AIzaSyCzeia8hkAmRGgzJ0M3xYBvkQy7Fhd9HIM"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
var list = mutableListOf("tSIk1QvIM2E","5xVh-7ywKpE")
        youtubeplayerview.initialize(apikey, object : YouTubePlayer.OnInitializedListener {
                override fun onInitializationSuccess(provider: YouTubePlayer.Provider, youTubePlayer: YouTubePlayer?, b: Boolean) {


                    youTubePlayer!!.loadPlaylist("PLyORnIW1xT6waC0PNjAMj33FdK2ngL_ik")

                    //.loadVideo(string)
                    //.cueVideo(string)

                    //.loadVideo(mutableListOf<String>(string1,string2,string3...))
                    //.cueVideo(list)

                    //youTubePlayer.setFullscreen(true)
                    youTubePlayer!!.addFullscreenControlFlag(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_SYSTEM_UI)


                 // youTubePlayer!!.loadVideos(list)
                    
                }

                override fun onInitializationFailure(provider: YouTubePlayer.Provider, youTubeInitializationResult: YouTubeInitializationResult) {
                    Toast.makeText(this@MainActivity, "Youtube Failed!", Toast.LENGTH_SHORT).show()
                }
            })

    }
}

