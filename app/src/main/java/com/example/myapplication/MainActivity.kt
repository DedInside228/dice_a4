package com.example.myapplication

import android.media.AudioManager
import android.media.MediaActionSound
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private var soundPool: SoundPool? = null
    private var soundId1: Int = 0
    private var soundId2: Int = 0
    private var soundId3: Int = 0
    private var soundId4: Int = 0
    private var soundId5: Int = 0
    private var soundId6: Int = 0
    var playsoundbuf = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageView>(R.id.sound1).setOnClickListener{playsound(1)}
        findViewById<ImageView>(R.id.sound2).setOnClickListener{playsound(2)}
        findViewById<ImageView>(R.id.sound3).setOnClickListener{playsound(3)}
        findViewById<ImageView>(R.id.sound4).setOnClickListener{playsound(4)}
        findViewById<ImageView>(R.id.sound5).setOnClickListener{playsound(5)}
        findViewById<ImageView>(R.id.sound6).setOnClickListener{playsound(6)}

        soundPool = SoundPool(1,AudioManager.STREAM_MUSIC,0)
        soundId1 = soundPool!!.load(baseContext, R.raw.one, 1)
        soundId2 = soundPool!!.load(baseContext, R.raw.two, 1)
        soundId3 = soundPool!!.load(baseContext, R.raw.three, 1)
        soundId4 = soundPool!!.load(baseContext, R.raw.four, 1)
        soundId5 = soundPool!!.load(baseContext, R.raw.five, 1)
        soundId6 = soundPool!!.load(baseContext, R.raw.six, 1)
    }

    fun playsound(sound: Int){
        var soundId = 0
        when(sound){
            1 -> soundId = soundId1
            2 -> soundId = soundId2
            3 -> soundId = soundId3
            4 -> soundId = soundId4
            5 -> soundId = soundId5
            6 -> soundId = soundId6
            else -> print("Error")
        }
        soundPool?.play(soundId,1F,1F,0,0,1F)
    }
}