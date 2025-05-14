package com.mintywind.volumecontrolapp // あなたのパッケージ名に合わせてください

import android.content.Context
import android.media.AudioManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.SeekBar
import com.mintywind.volumecontrolapp.databinding.ActivityMainBinding // 生成されたバインディングクラスをインポート

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "VolumeControlAppKotlin"
    }

    // View Bindingのインスタンス
    private lateinit var binding: ActivityMainBinding
    private lateinit var audioManager: AudioManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // View Bindingの初期化
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // rootビューを設定

        audioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager

        // View Binding経由でSeekBarにアクセス
        setupVolumeSeekBar(binding.seekBarMedia, AudioManager.STREAM_MUSIC)
        setupVolumeSeekBar(binding.seekBarCall, AudioManager.STREAM_VOICE_CALL)
        setupVolumeSeekBar(binding.seekBarRinger, AudioManager.STREAM_RING)
        setupVolumeSeekBar(binding.seekBarAlarm, AudioManager.STREAM_ALARM)
    }

    // setupVolumeSeekBar と onResume メソッドは findViewById 版と同じロジック
    // ただし、onResume 内でSeekBarにアクセスする際も binding.seekBarMedia のようにする
    private fun setupVolumeSeekBar(seekBar: SeekBar, streamType: Int) {
        try {
            seekBar.max = audioManager.getStreamMaxVolume(streamType)
            seekBar.progress = audioManager.getStreamVolume(streamType)
        } catch (e: SecurityException) {
            Log.e(TAG, "SecurityException for stream type $streamType: ${e.message}")
            seekBar.isEnabled = false
        }

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                //Log.d(TAG, "onProgressChanged - StreamType: $streamType, Progress: $progress, FromUser: $fromUser")
                if (fromUser && seekBar != null) {
                    try {
                        audioManager.setStreamVolume(streamType, progress, 0)
                    } catch (e: SecurityException) {
                        Log.e(TAG, "SecurityException on setting volume for stream type $streamType: ${e.message}")
                    }
                }
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }

    override fun onResume() {
        super.onResume()
        if (binding.seekBarMedia.isEnabled) {
            binding.seekBarMedia.progress = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC)
        }
        if (binding.seekBarCall.isEnabled) {
            binding.seekBarCall.progress = audioManager.getStreamVolume(AudioManager.STREAM_VOICE_CALL)
        }
        if (binding.seekBarRinger.isEnabled) {
            binding.seekBarRinger.progress = audioManager.getStreamVolume(AudioManager.STREAM_RING)
        }
        if (binding.seekBarAlarm.isEnabled) {
            binding.seekBarAlarm.progress = audioManager.getStreamVolume(AudioManager.STREAM_ALARM)
        }
    }
}